let apple = new Apple();
let adam = new Human();
let eva = new Human();
eva.setWeight(31);
eva.setGender(false);
adam.setWeight(31);
adam.eat(apple);
alert(apple.getWeight());
alert(adam.getWeight());
eva.eat(apple);
alert(apple.getWeight());
alert(eva.getWeight());
eva.eat(apple);
alert(eva.getWeight())

