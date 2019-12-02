function NhanVien() {
    this.setName = function (name) {
        this.name = name;
    };
    this.getname = function () {
        return this.name;
    };
    this.setSoNgaylamViec = function (soNgayLamViec) {
        this.soNgaylamViec = soNgayLamViec;
    };
    this.getSongaylamViev = function () {
        return this.soNgaylamViec;
    };
    this.setMucLuong1Ngay = function (mucLuong1Ngay) {
        this.mucluong1ngay = mucLuong1Ngay;
    };
    this.getMucLuong1Ngay = function () {
        return this.mucluong1ngay;
    }
    this.luong = function () {
        return parseInt(this.soNgaylamViec) * parseInt(this.mucluong1ngay);
    }
    this.showInFo = function () {
        return "Tên : " + this.name + "\n"
        + "Số Ngày làm Việc : " + this.soNgaylamViec + "\n"
        +"Mức Lương 1 Ngày : " + this.mucluong1ngay + " VND \n"
        + "Lương : " + this.luong() + " VND";
    }
}