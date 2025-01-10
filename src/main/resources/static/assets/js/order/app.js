class OrderApp {
    constructor() {
        this.productApi = new ProductApi();
        this.orderApi = new OrderApi();
        this.details = []; //lista me artikujt qe do te shtohen ne porosi
        this.productSelectionForm = document.getElementById("productSelectionForm");
    }

    async init() {
        this.productSelectionForm.querySelector("#date").value = new Date().toISOString().split("T")[0];
    }
}

new OrderApp().init().then(() => {
    console.log("Order app initialized");
}).catch(error => {
    console.error("Failed to initialize order app", error);
});