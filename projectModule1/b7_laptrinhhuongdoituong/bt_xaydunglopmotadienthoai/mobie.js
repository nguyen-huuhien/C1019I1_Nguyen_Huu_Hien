let mobie = function () {
    this.battery = battery < 100 ;
    this.setBattery = function (battery) {
        this.battery = battery;
    };
    this.getBattery = function () {
        return this.battery;
    };


    this.saveText = [];
    this.setSavetext = function (savetext) {
      this.saveText = saveText.push(savetext);
    };
    this.getSaveText = function () {
        this.saveText = saveText ;
    };
    this.saveInText = [];
    this.saveOutText = [];
    this.checkOnOff =  false;
    this.OnOff = function () {

    };
    this.chageBattery = function () {

    };
    this.OnText = function () {

    };



};