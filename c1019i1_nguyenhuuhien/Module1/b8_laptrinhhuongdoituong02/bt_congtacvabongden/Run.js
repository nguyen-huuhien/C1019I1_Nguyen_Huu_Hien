var bongDen = new ElectricLamp();
var congTac = new Switch();

for (let i = 0; i < 10; i++) {
    alert("lần "+ (i+1));
    congTac.switchOn();
    congTac.connectToLamp(bongDen);

    congTac.switchOff();
    congTac.connectToLamp(bongDen);

}
