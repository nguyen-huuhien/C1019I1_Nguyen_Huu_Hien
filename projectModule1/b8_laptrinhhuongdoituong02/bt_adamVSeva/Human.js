var Human = function () {


    this.isMale = function () {
        this.gender == true;
};
    this.setGender = function (gender) {
            this.gender = gender;
    };
    this.checkApple = function (apple) {
        return apple.getWeight() > 0;
    };

    this.say = function () {

    };
    this.getName = function () {
        return this.name;
    };
    this.setName = function (name) {
        this.name = name;
    };
    this.getWeight = function () {
        return this.weight;
    };
    this.setWeight = function (weight) {
        this.weight = weight;
    };
    this.eat = function (apple) {
        if (this.checkApple(apple)) {
            this.weight++ ;
            apple.decreaseWeight();
        }
    };

};