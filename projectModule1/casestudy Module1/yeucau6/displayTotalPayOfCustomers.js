function displayTotalPayOfCustomer() {
    choose = prompt("Chọn khách hàng càn hiển thị tiền thanh toán : \n"
    + getArrInfoCustomers() + (arrListCusTomers.length)+ ". Back");
    processChooseCustomerToShowPay();
    displayMainMenu();
}
function processChooseCustomerToShowPay() {
    switch (choose) {
        case (arrListCusTomers.length) + "":
            displayMainMenu();
            break;
        default:
            alert("Số tiền " + arrListCusTomers[choose].getName() + " cần phải thanh toán là : " + arrListCusTomers[choose].getTotalPays() );

    }
}
