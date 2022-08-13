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

// function sayHello(nameOfPerson,age){
//     // console.log(nameOfPerson);
//     console.log("Hello my name is " + nameOfPerson + " and i'm "+ age)
// }

// //순서가 중요하다 
// //숫자가 아닌 문자 -> firstNumber = 60, secondNumber = 8
// function plus(firstNumber,secondNumber){
//     console.log(firstNumber + secondNumber);
// }
// console.log(firstNumber); // firstNumber에 대해 정의한 것이 없기 때문에 오류가 남 

// function divide(a,b){
//     console.log(a/b);
// }
// plus(60,8);
// divide(98,20);

// //연결되는 정보들을 넣을 때 묶기
// const player = {
//     name = "hennie",
//     sayHello : function(otherPersonName){
//         console.log("hello!" + otherPersonName + "nice to meet you!");
//     }, 
// };
// console.log(player,console);
// console.log(player.name);
// console.log(player.name = "hyunjin")
// player.sayHello("lynn");
// player.sayHello("hennie");

// // alert();
// //console.log 는 출력해주는 애들
// // console.log("hello");

// //데이터를 보내는 방법
// sayHello("hennie",24);
// sayHello("josuha",30);
// sayHello("lynn",44);

// //데이터타입!
// //const 는 데이터를 업데이트를 할 수 없음 <-> let
// const a = 5; 
// console.log(a);
// //true , false는 boolean이므로 " "을 안 써도 됨
// //null은 아무것도 없는 비어있는 상태를 보여주는 수식
// //undefined 는 정의 X 
// //undefined의 예시:
// let hello; 
// console.log(hello);

// //let 예시
// let isHennieFat = true;
// let isHennieFat = false;

// // var 는 구문을 사용할 수 없음

// const days = [1,2,false,true,null,undefined,"text",me];

// const toBuy = ["potato","tomato","pizza"];
// console.log(toBuy[2]);
// toBuy[2] = "water";
// console.log(toBuy);

// function plus(){
//     console.log(2+2);
// }
// plus(); // 괄호를 해놔야 실행할 수 있음

// const calculator = {
//     add : function(a,b){
//         //console.log(a+b);
//         //alert(a+b);
//         return a+b; 
//         // return 하는 동시에 그 뒤는 안하고 return 부분까지만 작동하고 넘어간다.
//     },
//     sub : function(a,b){
//         //console.log(a-b);
//         //alert(a-b);
//         return a-b;
//     },
//     div : function(a,b){
//         //console.log(a/b);
//         //alert(a/b);
//         return a/b;
//     },
//     pow : function(a,b){
//         //console.log(a**b);
//         //alert(a**b);
//         return a**b;
//     },
// };
// //const,let,var 결과 타입만 알려줌
// const plusResult = calculator.add(3,4);
// //console.log(plusResult);
// //const subResult = calculator.sub(4,3);
// const subResult = calculator.sub(plusResult,3);
// //console.log(subResult);
// // const devResult = calculator.div(6,2);
// const devResult = calculator.div(10,subResult);
// //console.log(devResult);
// //const powResult = calculator.pow(4,3);
// const powResult = calculator.pow(devResult,subResult);
// //console.log(powResult);

// const age = 96;
// //2번째부분 ageOfForeigner 는 age와 값이 같음
// function calculateKrAge(ageOfForeigner){
//     //return을 해주면서 96+2가 됨 
//     return ageOfForeigner + 2;
// }

// //1번째로 넘어와서 age = 96;
// const krAge = calculateKrAge(age);
// console.log(krAge);

// const age = prompt("How are you?");
// //function은 내부에서 외부로 실행시키는 방법을 사용한다.
// //parseInt(15);
// console.log(typeof age);
// //console.log(parseInt(15));
// console.log(isNaN(age)); //a is not number인지 확인하는 구문

// if(isNaN(age) == true){
//     // condition === true
//     //console.log("Please write a number")
//     alert("Please write a number")
// }else{
//     // condition === false
//     console.log("Thank you for a writting your age!")
//     alert("Thank you for a writting your age!")
// }

// if(isNaN(age) || age < 0 ){
//     alert("Please write a real positive number")
//     console.log("Please write a real positive number")
// }else if(age < 18){
//     alert("You are too young!")
//     console.log("You are too young!")
// }else if(age >= 18 && age <= 50){
//     console.log("You can drink")
//     alert("You can drink")
// }
// else if(age >= 51 && age <= 80){
//     console.log("You should exercise")
//     alert("You should exercise")
// }
// else if(age >80){
//     console.log("You can do whatever you want")
//     alert("You can do whatever you want")
// }
// else{
//     alert("Finish")
//     console.log("Finish")
// }

// //true || true === true
// //true || false === true
// //false || true === true
// //false || false === false

// //true && true === true --> other status is all false

// // if((a && b) || (c && d)){
// // }

// //html h1부분과 일맥상통한 부분
// const title = document.getElementById("title");
// console.dir(title);
// title.innerText = "Allergy Insider";

// const title = document.getElementsByTagName("h1");
// console.log(title);

const title = document.querySelector("div.Allergy:first-child h1");
// title.innerText = "Allergy Insider";
// const title = document.getElementById("Allergy Insider");
// console.log(title);

// console.log(title.id);
// console.log(title.className);

//h1 -> color change
function handleTitleClick(){
    const currentColor = h1.style.color;
    let newColor;
    if(currentColor === "black"){
        newColor = "pink";
    }else{
        newColor = "black";
    }
    // console.log(h1.style.color);
    // title.style.color = "white";
    // console.log(h1.style.color);
    h1.style.color = newColor;
}
h1.addEventListener("click",handleTitleClick);
// function handleMouseEnter(){
//     console.log("Mouse is here!");
// }
// function handleMouseLeave(){
//     title.innerText = "Mouse is gone!";
// }
// function handleWindowCopy(){
//     alert("copier!");
// }
// //background color change --> 화면조절 할 때 색상 변경
// function handleWindowResize(){
//     document.body.style.backgroundColor = "pink"
// }
// function handleWindowOffline(){
//     alert("SOS no WIFI");
// }
// function handleWindowOnline(){
//     alert("ALL GOOD");
// }
// title.addEventListener("click",handleTitleClick);
// title.addEventListener("mouseenter",handleMouseEnter);
// title.addEventListener("mouseleave",handleMouseLeave);

// title.onClick = handleTitleClick;
// title.addEventListener("mouseenter",handleMouseEnter);
// title.addEventListener("mouseleave",handleMouseLeave);

// window.addEventListener("resize",handleWindowResize);
// window.addEventListener("copy",handleWindowCopy);
// window.addEventListener("offline",handleWindowOffline);
// window.addEventListener("online",handleWindowOnline);