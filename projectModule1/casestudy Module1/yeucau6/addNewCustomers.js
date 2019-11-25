
function addNewCustomers() {
    var customers = [];

    var name = prompt("1. Nhập tên Customers :");
    var cmnd = prompt("2. Nhập số CMND Của Customers :");
    var birthday = prompt("3. Nhập ngày tháng năm sinh (dd/mm/yyyy)");
    var email = prompt("4. Nhập Email Customer :");
    var address = prompt("5. Nhập địa chỉ Customers :");
    var typeCustomers = prompt("6. Nhập loại Customers : ");
    var discount = prompt("7. Nhập giảm giá :");
    var numBerOfCompanying = prompt("8. nhập số lượng đi kèm :");
    var rentdays = prompt("9. Nhập số ngày thuê :");
    var typeSevice = prompt("10. Nhập loại dịch vụ :");
    var typeRoom = prompt("11. Nhập loại phòng thuê :");

    customers.push(name);//1
    customers.push(cmnd);//2
    customers.push(birthday);//3
    customers.push(email);//4
    customers.push(address);//5
    customers.push(typeCustomers);//6
    customers.push(discount);//7
    customers.push(numBerOfCompanying);//8
    customers.push(rentdays);//9
    customers.push(typeSevice);//10
    customers.push(typeRoom);//11

    arrListCusTomers.push(customers);

    displayMainMenu();

}