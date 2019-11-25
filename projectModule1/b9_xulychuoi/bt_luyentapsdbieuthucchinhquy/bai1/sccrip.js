
function check_ngaythangnam(str) {
    var check = /^((^00)|[0-2][0-9]|30|31)\/([0-9]|10|11|12)\/((19|20)(([6-9][0-9])|(0[0-9])))$/;
    if (check.test(str)) {
        alert("Ngày sinh hợp lệ");
    } else {
        alert("ngày sinh không hợp lệ");
    }
}