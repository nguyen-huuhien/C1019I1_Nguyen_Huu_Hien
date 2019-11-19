var FlashLamp = function () {
    this.setBattery = function (battery) {
        this.battery = battery;
    };
    this.getBatteryInfo = function () {
        return this.battery.getEnergy();
    };
    this.light = function () {
        if (this.status) {
            alert("lighting");
        } else {
            alert("Not lighting");
        }
    };

    this.turnOn = function () {
        this.status = true ;
        this.battery.setEnergy(this.getBatteryInfo() - 1);

    };
    this.turnOff = function () {
        this.status = false;
    };
};