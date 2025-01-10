class OrderApp {
    constructor() {
        this.productApi = new ProductApi();
        this.orderApi = new OrderApi();
        this.details = []; //lista me artikujt qe do te shtohen ne porosi
        this.productSelectionForm = document.getElementById("productSelectionForm");
        this.products = [];
        this.orderDetailsTBody = document.getElementById("orderDetails");
        this.btnSave = document.getElementById("btnSave");
    }

    async init() {
        this.productSelectionForm.querySelector("#orderDate").value = new Date().toISOString().split("T")[0];
        this.loadProducts();

        this.productSelectionForm.addEventListener("submit", async event => {
            event.preventDefault();
            const formData = new FormData(event.target);
            const object = Helper.formDataToJsonObject(formData);

            const detail = {
                product: {
                    id: object.product
                },
                quantity: object.quantity,
                price: object.price,
                discount: object.discount,
                total: object.quantity * object.price
            }

            this.details.push(detail);
            const {name, description} = this.products.find(product => product.id.toString() === object.product);
            this.orderDetailsTBody.innerHTML += `
             <tr>
            <td>${object.product}</td>
            <td>${name + ' ' + description}</td>
            <td>${object.quantity}</td>
            <td>${object.price}</td>
            <td>${object.discount}</td>
            <td>${(object.quantity * object.price).toFixed(2)}</td>
            <td><button class="btn btn-danger btn-sm" data-id="${object.product}">X</button></td>
        </tr>`

            this.resetProductSelectionForm();
        });

        this.orderDetailsTBody.addEventListener("click", event => {
            if (event.target.tagName === "BUTTON") {
                const productId = event.target.dataset.id;
                this.details = this.details.filter(detail => detail.product.id !== productId);
                event.target.closest("tr").remove();
            }
        });

        this.btnSave.addEventListener("click", async event => {
            const formData = new FormData(this.productSelectionForm);
            const order = Helper.formDataToJsonObject(formData);
            delete order["product"];
            delete order["price"];
            delete order["discount"];
            delete order["quantity"];
            order.details = this.details;
            console.log(order);
            console.log(JSON.stringify(order));
            const newOrder = await this.orderApi.add(order);
            console.log(newOrder)
        });

    }

    resetProductSelectionForm() {
        this.productSelectionForm.querySelector("#quantity").value = 0;
        this.productSelectionForm.querySelector("#price").value = 0;
        this.productSelectionForm.querySelector("#discount").value = 0;
        this.productSelectionForm.querySelector("#product").value = ""
        this.productSelectionForm.querySelector("#product").focus();
    }

    async loadProducts() {
        this.products = await this.productApi.findAll();

        if (this.products.length === 0) {
            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Missing products!",
                footer: '<a href="#">Why do I have this issue?</a>'
            });
            return;
        }

        let productSelectionHtml = "<option value='' selected>Select One</option>";

        this.products.forEach(product => {
            productSelectionHtml += `<option value="${product.id}">
                                        ${product.name} ${product.description}
                                    </option>`
        });

        this.productSelectionForm.querySelector("#product").innerHTML = productSelectionHtml;


    }
}

new OrderApp().init().then(() => {
    console.log("Order app initialized");
}).catch(error => {
    console.error("Failed to initialize order app", error);
});