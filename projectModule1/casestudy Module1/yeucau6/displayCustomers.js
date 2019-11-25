let arrListCusTomers = [];
function displayCustomers() {
    choose = prompt("Chosse Customer to display : \n" + getArrInfoCustomers() + (arrListCusTomers.length) + ". Back");
    processChooseCustomerToDisplay(choose);
    displayMainMenu();
}
function getArrInfoCustomers() {
    var result = "";
    for (var i = 0; i < arrListCusTomers.length; i++) {
        result += i + " Tên : " + arrListCusTomers[i][0] + " Số CMND : " + arrListCusTomers[i][1] + "\n " +"=============== \n";
        
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
    return "0. Tên " + arrListCusTomers[choose][0] + "\n"
    + "1. CMND " + arrListCusTomers[choose][1] + "\n"
    + "2. Birthday " + arrListCusTomers[choose][2] + "\n"
    + "3. CMND " + arrListCusTomers[choose][3] + "\n"
    + "4. Address " + arrListCusTomers[choose][4] + "\n"
    + "5. TypeCustomer " + arrListCusTomers[choose][5] + "\n"
    + "6. Discount " + arrListCusTomers[choose][6] + "\n"
    + "7. NumberOfCompanying " + arrListCusTomers[choose][7] + "\n"
    + "8. Rentdays " + arrListCusTomers[choose][8] + "\n"
    + "9. TypeSevice " + arrListCusTomers[choose][9] + "\n"
    + "10. TypeRoom " + arrListCusTomers[choose][10] + "\n"
}
