
        const book = document.getElementById('libro');
        const btn = document.getElementById("btnInserisci");
        const elenco = document.getElementById("elenco");
        const flag = document.getElementById("flag");

        const URL = 'https://restcountries.com/v3.1/region/europe';

        fetch(URL).then(e => e.json()).then(e => {
            let ul = document.createElement('ul');
            ul.setAttribute('class', 'list-group');

            for (const paese of e) {
                console.log(paese.name.official);
                let li = document.createElement('li');
                li.setAttribute('class', 'list-group-item');
                let testo = document.createTextNode(paese.name.official);
                li.appendChild(testo);
                
                li.onclick = function(){
                    trovaPaese(this.innerText);
                }

                ul.appendChild(li);
                
            }
            elenco.appendChild(ul);
        });

        function trovaPaese(paese) {
            
            fetch('https://restcountries.com/v3.1/name/' + paese)
                    .then(e => e.json())
                    .then(e => {

/*
<div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>

*/

                        let card = document.createElement("div");
                        card.setAttribute("class", 'card');
                        card.setAttribute("style", 'width: 18rem');

                        let cardBody = document.createElement("div");
                        cardBody.setAttribute("class", 'card-body');
                        
                        let cardTitle = document.createElement("h5");
                        cardTitle.setAttribute("class", 'card-title');
                        cardTitle.innerText = paese;
                        cardBody.appendChild(cardTitle);

                        let cardText = document.createElement("p");
                        cardText.setAttribute("class", 'card-text');
                        cardText.innerText = 'Popolazione ' + numberWithCommas(e[0].population);
                        cardBody.appendChild(cardText);
                        
                        let img = document.createElement("img");
                        img.setAttribute("src", e[0].flags.png);
                        img.setAttribute("class", 'card-img-top');

                        
                        card.appendChild(img);
                        card.appendChild(cardBody);
                        flag.innerHTML = '';
                        flag.appendChild(card);
                        
                    })

        }        



        btn.addEventListener('click', () => {

            let testo = book.value;
            trovaPaese(testo);            

        });

        function numberWithCommas(x) {
            return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
        }

