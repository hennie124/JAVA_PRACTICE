const date = document.querySelector("h2#date");
const clock = document.querySelector("h2#clock");


function getDate(){
    const year = new Date();
   date.innerHTML = `${year.getFullYear()} - 
   ${('0' + (year.getMonth() + 1)).slice(-2)} -
   ${('0' + year.getDate()).slice(-2)}`;
    
}

function getClock(){
    const time = new Date();
    const hours = String(time.getHours()).padStart(2,"0"); 
    const minutes = String(time.getMinutes()).padStart(2,"0"); 
    const seconds = String(time.getSeconds()).padStart(2,"0"); 
    let J = "AM";
    let h = time.getHours();
    //clock.innerHTML = `${('0' + (time.getHours())).slice(-2)}:${('0' + (time.getMinutes())).slice(-2)}:${time.getSeconds()}`;
    //clock.innerHTML = `${hours} : ${minutes} : ${seconds}`;

    if(hours < 12){
        J = "AM";
        h = String(h).padStart(2,"0"); 
        clock.innerHTML = `${J} ${h} : ${minutes} : ${seconds}`;
    }else{
        J = "PM";
        h = String(h - 12).padStart(2,"0"); 
        clock.innerHTML = `${J} ${h} : ${minutes} : ${seconds}`;
    }
}

getDate();
getClock();
setInterval(getClock,1000);
