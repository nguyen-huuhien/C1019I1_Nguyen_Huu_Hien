
function checkValidate_class(str) {
    let check = /^(C|A|P)[0-9]{4,4}(G|H|I|K|L|M)$/;
    if (check.test(str)) {
        alert("Tên Lớp Hợp Lệ !");
    } else {
        alert("Tên lớp không hợp lệ");
    }
}