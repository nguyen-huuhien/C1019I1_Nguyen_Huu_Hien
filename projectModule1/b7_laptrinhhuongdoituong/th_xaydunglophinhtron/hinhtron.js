let Circle = function(radius) {

    this.radius = radius;
    this.getRadius = function() {
        return radius;
    }
    this.getArea = function() {
        return Math.PI * radius * radius;
    }


};
let radius = circle.getRadius(); // 2

let area = circle.getArea();
let circle = new Circle(2);
alert("radius: " + radius + "; area: " + area);