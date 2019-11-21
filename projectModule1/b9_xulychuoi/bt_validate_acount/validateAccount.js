
function validateAccount(str) {
    let check = /^[_a-z0-9]{6,}$/;
    if (check.test(str)) {
        alert("account hop le");
    } else {
        alert("account không hợp lệ");
    }

}