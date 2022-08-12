// alert("hi");
// console.log("hi");

// const a = 6;
// const b = 2;

// console.log(a+b);
// console.log(a*b);
// console.log(a/b);

// const amIFat = null;
// let something;
// console.log(something);

// const mon = "mon";
// const tue = "tue";
// const wed = "wed";
// const thu = "thu";
// const fri = "fri";
// const sat = "sat";
// const sun = "sun";

// const daysOfWeek = ["mon","tue","wed","thu","fri","sat","sun"];
// console.log(daysOfWeek);

// const daysOfWeek = ["mon","tue","wed","thu","fri","sat"];
// //get item from array
// console.log(daysOfWeek[5]);
// //add one more day to the array
// daysOfWeek.push("sun");
// console.log(daysOfWeek);
// console.log(daysOfWeek[7]);

// const nonsense = [1,2,"hello",false,null,true,undefined];
// console.log(daysOfWeek,nonsense);

// const apple = "apple";
// const potato = "potato";
// const toBuy = ["potato","tomato","pizza"];
// toBuy.push("kimbab");
// console.log(toBuy[909394820]);


// const player = {
//     name = "hennie",
//     point = 1212212,
//     pretty = false,
// };

// console.log(player);
// console.log(player.name);
// console.log(player);

// player.lastName = "potato";
// console.log(player);

function sayHello(nameOfPerson,age){
    // console.log(nameOfPerson);
    console.log("Hello my name is " + nameOfPerson + " and i'm "+ age)
}

//순서가 중요하다 
//숫자가 아닌 문자 -> firstNumber = 60, secondNumber = 8
function plus(firstNumber,secondNumber){
    console.log(firstNumber + secondNumber);
}
console.log(firstNumber); // firstNumber에 대해 정의한 것이 없기 때문에 오류가 남 

function divide(a,b){
    console.log(a/b);
}
plus(60,8);
divide(98,20);

const player = {
    name = "hennie",
    sayHello : function(otherPersonName){
        console.log("hello!" + otherPersonName + "nice to meet you!");
    }, 
};
console.log(player.name);
player.sayHello("lynn");
player.sayHello("hennie");

// alert();
//console.log 는 출력해주는 애들
// console.log("hello");

//데이터를 보내는 방법
sayHello("hennie",24);
sayHello("josuha",30);
sayHello("lynn",44);
