var battery = new Battery();
battery.setEnergy(10);

var flashlamp = new FlashLamp();
flashlamp.setBattery(battery);

document.write("Battery info: " + flashlamp.getBatteryInfo() + "<br/>");
flashlamp.light();

document.write("Turn on<br/>");
flashlamp.turnOn();
flashlamp.light();
document.write("Battery info " + flashlamp.getBattery() + "<br/>");

document.write("Turn Off<br/>");
flashlamp.turnOff();
flashlamp.light();

document.write("Turn on<br/>");
flashlamp.turnOn();
flashlamp.light();
document.write("Battery info " + flashlamp.getBattery() + "<br/>");

