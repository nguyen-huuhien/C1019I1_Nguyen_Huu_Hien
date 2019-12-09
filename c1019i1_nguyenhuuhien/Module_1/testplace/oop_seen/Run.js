let inputName = document.getElementById("inputName");
let inputAge = document.getElementById("inputAge");

let arrPerson = [];
function save() {
    let person = new Person();
    person.setName(inputName.value);
    person.setAge(inputAge.value);
    arrPerson.push(person);
}
function show() {
    let drawHTML="";
    for(let i = 0 ; i < arrPerson.length ; i++){
        drawHTML += "<div>Name: "+ arrPerson[i].getName() +"</div>" +
            "<div>Age: "+ arrPerson[i].getAge() +"</div>";
    }
    document.getElementById("show").innerHTML = drawHTML;
}