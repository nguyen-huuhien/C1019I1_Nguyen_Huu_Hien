function Customers() {

    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name;
    };
    this.setCMND = function (cmnd) {
        this.cmnd = cmnd;
    };
    this.getCMND = function () {
        return this.cmnd;
    };
    this.setBirthDay = function (birthday) {
        this.birthday = birthday;
    };
    this.getBirthday = function () {
        return this.birthday;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this.address;
    };
    this.setTypeCustomers = function (typeCustomers) {
        this.typeCustomer = typeCustomers;
    };
    this.getTypeCustomes = function () {
        return this.typeCustomer;
    };
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };
    this.setNumberOfAccompanying = function (numBerOfCompanying) {
        this.numberofAccompanying = numBerOfCompanying;
    };
    this.getNumberOfCompanying = function () {
        return this.numberofAccompanying;
    };
    this.setRentDays = function (rentdays) {
        this.rentdays = rentdays;
    };
    this.getRentdays = function () {
        return this.rentdays;
    };
    this.settypeSevice = function (typeSevice) {
        this.typeSevice = typeSevice;
    };
    this.getTypeSevice = function () {
        return this.typeSevice;
    };
    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    };
    this.getTypeRoom = function () {
        return this.typeRoom;
    };
    this.getTotalPays = function () {
       return  totalPays = this.typeSevice*this.rentdays*(1-(this.discount/100));
    }










}
