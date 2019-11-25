function deleteCustomers() {
    choose = prompt("Choose customer to delete : \n" + getArrInfoCustomers() + (arrListCusTomers.length) + ". Back");
    processChooseCustomerToDelete();
    displayMainMenu();
}
function processChooseCustomerToDelete() {
    switch (choose) {
        case (arrListCusTomers.length) + "":
            displayMainMenu();
            break;
        default:
            confirmDeleteCustomer(choose);
    }
}
function confirmDeleteCustomer(index) {
    choose = prompt(" Bạn có muốn xóa khách hàng có CMND (" + arrListCusTomers[index][1]  + ") này chứ : \n"
        + "1. Có \n"
        + "2. Không \n");
    processDeleteCustomer(index);
}
function processDeleteCustomer(index) {
    switch (choose) {
        case "1":
            arrListCusTomers.splice(index, 1);
            displayMainMenu();
            break;
        case "2":
            displayMainMenu();
    }
}
