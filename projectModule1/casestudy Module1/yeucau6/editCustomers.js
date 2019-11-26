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
        case "0":
            arrListCusTomers[index].setName(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "1":
            arrListCusTomers[index].setCMND(prompt("Nhập nội dung muốn thay đổi"));
            displayEditPropertyCustomer(index);
            break;
        case "2":
            arrListCusTomers[index].setBirthDay( prompt("Nhập nội dung muốn thay đổi"));
            displayEditPropertyCustomer(index);
            break;
        case "3":
            arrListCusTomers[index].setEmail(prompt("Nhập nội dung muốn thay đổi"));
            displayEditPropertyCustomer(index);
            break;
        case "4":
            arrListCusTomers[index].setAddress(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "5":
            arrListCusTomers[index].setTypeCustomers(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "6":
            arrListCusTomers[index].setDiscount(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "7":
            arrListCusTomers[index].setNumberOfAccompanying(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "8":
            arrListCusTomers[index].setTypeRoom(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "9":
            arrListCusTomers[index].setRentDays(prompt("Nhập nội dung muốn thay đổi"))  ;
            displayEditPropertyCustomer(index);
            break;
        case "10":
            arrListCusTomers[index].settypeSevice(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditPropertyCustomer(index);
            break;
        case "11":
            displayMainMenu();
    }

}