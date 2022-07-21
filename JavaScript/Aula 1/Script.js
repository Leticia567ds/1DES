// var a = 20;
// var b = 20;
// var c = 5;
// if (a == b && b == c) {
//   console.log("Equilatero");
// }
// if (a != b && b != c) {
//   console.log("Escaleno");
// }
// if (a == b && b != c) 
// console.log("Isósceles");

var salario = [1500,3000, 4000];
 salario.forEach((salarios) => {
    if(salarios > 2826.66){
        console.log(salarios-(salarios*7,5)/100)
    }else if(salarios > 3751.05){
        console.log(salarios-(salarios*15)/100)
    }else if(salarios > 4664.68){
        console.log(salarios-(salarios*22,5)/100)
    }else if(salarios > 4664.68 ){
        console.log(salarios-(salarios*27,5)/100)
    }else{
   console.log(salarios);
    }
})
