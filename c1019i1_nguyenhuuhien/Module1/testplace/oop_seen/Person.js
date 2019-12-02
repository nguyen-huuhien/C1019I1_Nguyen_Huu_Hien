let Person = function () {
    this.setAge = function (age) {
        this.age = age;
    };
    this.getAge = function () {
        return this.age;
    };
    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name;
    };
};