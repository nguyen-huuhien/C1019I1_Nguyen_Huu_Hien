function Employee() {
    this.setName = function (name) {
        this.name = name;
    };
    this.getName = function () {
        return this.name;
    };
    this.setBirthDay = function (birthday) {
        this.birthday = birthday;
    };
    this.getBirthday = function () {
        return this.birthday;
    };
    this.setCMND = function (cmnd) {
        this.cmnd = cmnd;
    };
    this.getCMND = function () {
        return this.cmnd;
    };
    this.setPhoneNumber = function (phoneNumber) {
        this.phoneNumber = phoneNumber;
    };
    this.getPhoneNumber = function () {
        return this.phoneNumber;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setTrinhDo = function (trinhDo) {
        this.trinhDo = trinhDo;
    };
    this.getTrinhDo = function () {
        return this.trinhDo;
    };
    this.setViTri = function (viTri) {
        this.viTri = viTri;
    };
    this.getViTri = function () {
        return this.viTri;
    };
    this.setLuong = function (luong) {
        this.luong = luong
    };
    this.getLuong = function () {
        if (this.getViTri() == "Sale") {
            return this.luong + 500;
        }
        return this.luong;
    };
}