function checkValidate_sdt(str) {
    var check = /^\([0-9]{2,2}\)-(\(0[0-9]{9,9}\))$/;
    if (check.test(str)) {
        alert("sdt hop le !");
    } else {
        alert("sdt khong hop le !");
    }
}