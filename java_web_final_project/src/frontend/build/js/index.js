const elem = document.getElementById("element");

elem.innerText = "that was dynamically added with JS";

async function getDj() {
  const djElem = document.getElementById("dj");
  try {
    const response = await fetch("http://localhost:8080/api/djs");
    const responseJSO = await response.json();
    djElem.innerText = `My favorite dj is ${responseJSO[2].name} they are from ${responseJSO[2].originCountry}`;
  } catch (e) {
    console.log(e);
  }
}

getDj();
