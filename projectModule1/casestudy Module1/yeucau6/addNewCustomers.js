function addNewCustomers() {


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