var FlashLamp = function () {
    this.setBattery = function (battery) {
        this.battery = battery;
    };
    this.getBatteryInfo = function () {
        return this.battery.getEnergy();
    };
    this.getBattery = function () {
        return this.battery.decreaseEnergy();
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
        this.battery.setEnergy(this.getBatteryInfo());

    };
    this.turnOff = function () {
        this.status = false;
    };
};