
function displayMainMenu() {
    var choose = prompt("1.Add New Customer. \n" +
        "2.Display Information Customer. \n" +
        "3.Edit Information Customer.\n" +
        "4.Delete Customer.\n" +
        "5.Display total pay of customer. \n "+
        "6.Add New Employee. \n "+
        "7.Display Employee.\n "+
        "8.Exit.");
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
            addEmployee();
            break;
        case "7" :
            displayEmployee();
            break;
        case "8" :
            exit();
            break;


    }

}
displayMainMenu();


