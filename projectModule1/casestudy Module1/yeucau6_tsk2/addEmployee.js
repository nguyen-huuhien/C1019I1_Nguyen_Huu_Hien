let arrEmployees = [];

function addEmployee() {
    var name = prompt("1. Nhập tên Employee :");
    var birthday = prompt("2. Nhập ngày sinh Employee :");
    var cmnd = prompt("3. Nhập số cmnd Employee :");
    var phonenumber = prompt("4. Nhập sdt Employee :");
    var email = prompt("5. Nhập email Employee :");
    var trinhdo = prompt("6. Nhập trình độ Employee (Trung cấp, Cao đẳng, Đại học, sau đại học)");
    var vitri = prompt("7. Nhập vị trí Employee (Sale – Marketing, Hành Chính, Phục vụ, Quản lý)");


    var employee = new Employee();

    employee.setName(name);
    employee.setBirthDay(birthday);
    employee.setCMND(cmnd);
    employee.setPhoneNumber(phonenumber);
    employee.setEmail(email);
    employee.setTrinhDo(trinhdo);
    employee.setLuong(0);
    employee.setViTri(vitri);


    arrEmployees.push(employee);
    displayMainMenu()

}