
function checkImail(str) {
     var regexp = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
    if (regexp.test(str)) {
        alert("email hop le!");
    } else {
        alert("khong hop le");
    }
}