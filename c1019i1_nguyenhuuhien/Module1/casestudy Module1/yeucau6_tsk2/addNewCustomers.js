function addNewCustomers() {


    var name = prompt("1. Nhập tên Customers :");
    var cmnd = inportCMND();
    var birthday = inportBirthday();
    var email = inportEmail();
    var address = prompt("5. Nhập địa chỉ Customers :");
    var typeCustomers = prompt("6. Nhập loại Customers : ");
    var discount = inportDiscount();
    var numBerOfCompanying = inportNOC();
    var rentdays = inportRentdays();
    var typeSevice = prompt("10. Nhập loại dịch vụ :");
    var typeRoom = prompt("11. Nhập loại phòng thuê :");
//prompt("3. Nhập ngày tháng năm sinh (dd/mm/yyyy)");
    var customers = new Customers();
    customers.setName(name);
    customers.setCMND(cmnd);
    customers.setBirthDay(birthday);
    customers.setEmail(email);
    customers.setAddress(address);
    customers.setTypeCustomers(typeCustomers);
    customers.setDiscount(discount);
    customers.setNumberOfAccompanying(numBerOfCompanying);
    customers.setRentDays(rentdays);
    customers.settypeSevice(typeSevice);
    customers.setTypeRoom(typeRoom);

    arrListCusTomers.push(customers);

    displayMainMenu();

}
function inportEmail() {
     var status = false;
    do {
        var inputEmail = prompt("4. Nhập Email customers : ")
        if (validateEmail(inputEmail)) {
            status = true
        }
    }while (status == false) ;
    return inputEmail;
}
function validateEmail(str) {
    var reg = /^[a-zA-Z0-9]+@[a-zA-Z0-9]{4,8}\.[a-zA-z0-9]{2,8}$/;
    if (reg.test(str)) {
        return true;
    }
}

function inportBirthday() {
    var status = false;
    do {
        var inputBirthday = prompt("3. Nhập ngày tháng năm sinh (dd/mm/yyyy)");
        var check = /^((^00)|[0-2][0-9]|30|31)\/([0-9]|10|11|12)\/((19|20)(([6-9][0-9])|(0[0-9])))$/;
        if (check.test(inputBirthday)) {
            status = true;
        }
    }while (status == false);
    return inputBirthday;
}
function inportCMND() {
    var status = false;
    do {
        var inputCMND = prompt("2. Nhập số CMND Của Customers :");
        var check = /^[0-9]{9,9}$/;
        if (check.test(inputCMND)) {
            status = true
        }
    }while (status == false)
    return inputCMND;

}
function inportDiscount() {
    var status = false;
    do {
        var input = prompt("7. Nhập giảm giá :");
        var check = /^[0-9]+$/;
        if (check.test(input)) {
            status = true
        }
    }while (status == false)
    return input;
}
function inportNOC() {
    var status = false;
    do {
        var input = prompt("8. nhập số lượng đi kèm :");
        var check = /^[0-9]+$/;
        if (check.test(input)) {
            status = true
        }
    }while (status == false)
    return input;
}
function inportRentdays() {
    var status = false;
    do {
        var input =prompt("9. Nhập số ngày thuê :");
        var check = /^[0-9]+$/;
        if (check.test(input)) {
            status = true
        }
    }while (status == false)
    return input;
}