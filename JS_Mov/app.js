
//const 의 변수 이름을 잘 보고 수식에 적용할 것

const h1 = document.querySelector("div.Allergy:first-child h1");

function handleTitleClick() {
    //===이면 className이 Allergy인지 확인해준다는 것
    const clickedClass = "clicked";
    // if(h1.classList.contains(clickedClass)){
    //     h1.classList.remove(clickedClass);
    // }else{
    //     h1.classList.add(clickedClass);
    // }
    h1.classList.toggle("clicked");
    }


h1.addEventListener("click",handleTitleClick);

