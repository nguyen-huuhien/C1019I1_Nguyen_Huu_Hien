

function displayEmployee() {
    choose = prompt("Chọn Employee Cần hiển thị : \n " + getArrInfoEmployee() +" "+ arrEmployees.length + ".back");
     chonEmployeedehienthi(choose)
    displayMainMenu();
}

function getArrInfoEmployee() {
    result = "";
    for (var i = 0; i < arrEmployees.length; i++) {
        result += i + " Tên Employee : " + arrEmployees[i].getName() + " Số CMND : " + arrEmployees[i].getCMND() + "\n " +"=============== \n";
    }
    return result;
}
function chonEmployeedehienthi(choose) {
    switch (choose) {
        case (arrEmployees.length) + "":
            displayMainMenu();
            break;
        default:
            showInFoEmPloyee(choose);
    }
}
function showInFoEmPloyee() {
alert(getInFoEmPloyee(choose));
}

function getInFoEmPloyee(choose) {
    return "0. Tên Employee : " + arrEmployees[choose].getName() + "\n" +
        "1. Ngày sinh Employee : " + arrEmployees[choose].getBirthday() + "\n" +
        "2. Số CMND Employee : " + arrEmployees[choose].getCMND() + "\n" +
        "3. Số điện thoại Employee : " + arrEmployees[choose].getPhoneNumber() + "\n" +
        "4. Email Employee : " + arrEmployees[choose].getEmail() + "\n" +
        "5. Trình độ Employee : " + arrEmployees[choose].getTrinhDo() + "\n" +
        "6. Vị Trí : " + arrEmployees[choose].getViTri() + "\n" +
        "7. Lương : " + arrEmployees[choose].getLuong() ;

}