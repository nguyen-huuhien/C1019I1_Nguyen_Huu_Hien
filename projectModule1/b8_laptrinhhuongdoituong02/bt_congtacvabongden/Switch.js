var Switch = function () {


    this.switchOff = function () {
         this.status = false;
    };
    this.switchOn = function () {
         this.status = true;
    };
    this.connectToLamp = function (electriclamp) {
        if (this.status) {
            electriclamp.turnOn();
        } else {
            electriclamp.turnOff();
        }
    };
};
