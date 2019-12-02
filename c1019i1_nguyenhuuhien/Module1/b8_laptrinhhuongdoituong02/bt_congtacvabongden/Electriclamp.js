var ElectricLamp = function () {

    this.turnOff = function () {
        this.status = false;
        alert("Đèn tắt ");
    };
    this.turnOn = function () {
        this.status = true;
        alert("Đèn sáng ");
    };
};