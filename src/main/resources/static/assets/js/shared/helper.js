class Helper {

    static formDataToJson(formData) {
        let object = this.formDataToJsonObject(formData);
        return JSON.stringify(object);
    }

    static formDataToJsonObject(formData) {
        let object = {};
        formData.forEach((value, key) => {
            object[key] = value;
        });
        return object;
    }
    static formTargetToJsonObject(formTarget) {
        let formData = new FormData(formTarget);
        return Helper.formTargetToJsonObject(formData);
    }

    static formTargetToJson(formTarget) {
        let object = this.formTargetToJsonObject(formTarget);
        return JSON.stringify(object);
    }
}