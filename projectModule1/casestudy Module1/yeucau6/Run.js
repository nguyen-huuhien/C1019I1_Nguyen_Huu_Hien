
function displayMainMenu() {
    var choose = prompt("1.Add New Customer. \n" +
        "2.Display Information Customer. \n" +
        "3.Edit Information Customer.\n" +
        "4.Delete Customer.\n" +
        "5.Exit.");
    switch (choose) {
        case "1" :
            addNewCustomers();
            break;
        case "2" :
            displayCustomers();
            break;
        case "3" :
            editCustomers();
            break;
        case "4" :
            deleteCustomers();
            break;
        case "5" :
            displayTotalPayOfCustomer();
            break;
        case "6" :
            exit();
            break;

    }

}
displayMainMenu();


