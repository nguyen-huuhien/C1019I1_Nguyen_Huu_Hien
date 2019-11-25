function editCustomers() {
    choose = prompt("Chọn khách hàng cần edit : \n"+ getArrInfoCustomers() + (arrListCusTomers.length) + ". Back");
    processEditChoosedCustomerToEdit();
    displayMainMenu();
}
function processEditChoosedCustomerToEdit() {
    switch (choose) {
        case (arrListCusTomers.length) + "":
            displayMainMenu();
            break;
        default:
            displayEditPropertyCustomer(choose);
    }
}
function displayEditPropertyCustomer(index) {
    choose = prompt(" Nhập mục cần chỉnh sửa : \n " + getCustomerInfor(index) + ((arrListCusTomers[index]).length) + ". Back");
    processEditPropertyCustomer(index);
}
function processEditPropertyCustomer(index) {
    switch (choose) {
        case ((arrListCusTomers[index]).length)  + "":
            displayMainMenu();
            break;
        default:
            arrListCusTomers[index][parseInt(choose)] = prompt("Nhập nội dung muốn thay đổi : ");
            displayEditPropertyCustomer(index);
    }
}