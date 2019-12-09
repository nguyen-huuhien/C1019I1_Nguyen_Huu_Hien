var Apple = function () {
    this.weight = 10;
    this.decreaseWeight = function () {
        if (this.weight > 0) {
            this.weight--;
        }
        return this.weight;
    };

    this.isEmty = function (){

        } ;

    this.getWeight = function () {
        return this.weight;
    };

};


