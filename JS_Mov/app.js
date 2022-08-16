const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
//const loginButton = document.querySelector("#login-form button");
const link = document.querySelector("a");
// function onLoginSubmit(){
//     const username = loginInput.value;
//     // if(username === ""){
//     //     alert("Please write your name");
//     // }else if(username.length > 15){
//     //     alert("Your name is too long");
//     // }
//     console.log(username);
// }

// tomato가 되는 argument는 우리가 
// input에서 받아오는 값과 다르게 함수 내에서 임의로 준 값
//argument = tomato ==> 함수를 이용할 때 사용되는 전달값 => 근데 tomato는 임의의 값

// 우리가 공간을 제공하면 JS가 event에 대한 정보를 지닌 argument인 tomato를 채워넣는다.
function onLoginSubmit(event){
    //1 : preventDefault를 사용한 것은 새로고침 방지
    //2 : tomato 같은 argument가 없으면, 
    //함수가 JS에서 주는 정보의 preventDefault()를 부르고 싶은데 부를 수가 없다.
    event.preventDefault(); 
    //preventDefault가 기본동작을 못하게 한다.(submit되면 새로고침하게 되는 기본동작)
    //const username = loginInput.value;
    console.log(loginInput.value);
    //함수에서 입력값을 만들면 함수 사용 시 입력값과 함께 들어가야 에러가 발생
    // -> func(arg) 를 func() 이런식으로 argument 없이 호출해도, 에러가 발생하지 않을 수 있습니다. 
    //arg과 관련 없이 function func(arg) { console.log("no error"!);} 이런 식으로 말이죠
}

//함수는 1번만 실행된다.
function handleLinkClick(event){
    // event.preventDefault(); --> default 행동을 못하게 막는 것
    console.log(event);
    // alert("clicked!");
}
//submit가 되면 onLoginSubmit를 당장 실행시킨다.
loginForm.addEventListener("submit",onLoginSubmit);
//loginButton.addEventListener("click",handBtnClick);
link.addEventListener("click",handleLinkClick);