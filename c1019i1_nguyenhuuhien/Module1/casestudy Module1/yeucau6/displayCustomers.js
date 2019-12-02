let arrListCusTomers = [];
function displayCustomers() {
    choose = prompt("Chosse Customer to display : \n" + getArrInfoCustomers() + (arrListCusTomers.length) + ". Back");
    processChooseCustomerToDisplay(choose);
    displayMainMenu();
}
function getArrInfoCustomers() {
    var result = "";
    for (var i = 0; i < arrListCusTomers.length; i++) {
        result += i + " Tên : " + arrListCusTomers[i].getName() + " Số CMND : " + arrListCusTomers[i].getCMND() + "\n " +"=============== \n";
        
    }
    return result;
}
function processChooseCustomerToDisplay() {
    switch (choose) {
        case (arrListCusTomers.length) + "":
            displayMainMenu();
            break;
        default:
            displayInfomationCustomer(choose);
    }
}
function displayInfomationCustomer(choose) {
    alert(getCustomerInfor(choose));
}
function getCustomerInfor(choose) {
    return "0. Tên : " + arrListCusTomers[choose].getName() + "\n"
    + "1. CMND : " + arrListCusTomers[choose].getCMND() + "\n"
    + "2. Birthday : " + arrListCusTomers[choose].getBirthday() + "\n"
    + "3. Email : " + arrListCusTomers[choose].getEmail() + "\n"
    + "4. Address : " + arrListCusTomers[choose].getAddress() + "\n"
    + "5. TypeCustomer : " + arrListCusTomers[choose].getTypeCustomes() + "\n"
    + "6. Discount : " + arrListCusTomers[choose].getDiscount() + "\n"
    + "7. NumberOfCompanying : " + arrListCusTomers[choose].getNumberOfCompanying() + "\n"
    + "8. Rentdays : " + arrListCusTomers[choose].getRentdays() + "\n"
    + "9. TypeSevice : " + arrListCusTomers[choose].getTypeSevice() + "\n"
    + "10. TypeRoom : " + arrListCusTomers[choose].getTypeRoom() + "\n"
}
