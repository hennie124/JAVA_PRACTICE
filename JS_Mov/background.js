const img = ["allergy1.jpg","health.jpg","pill1.jpg"];

const chosenImg = img[Math.floor(Math.random()*img.length)];

//console.log(chosenImg);
const bgImg = document.createElement("img");
console.log(bgImg);
bgImg.src = `img/${chosenImg}`;
document.body.appendChild(bgImg);