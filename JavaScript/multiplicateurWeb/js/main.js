let affichage = document.querySelector('#affichage');
let results = document.querySelector('#results');

document.querySelectorAll('#btNumber > button:not(.other)').forEach( e=>  {
    e.addEventListener('click', bt => {
        console.log(bt.target.innerText);
        affichage.innerText += bt.target.innerText;
        //affichage.innerText = +
    })
});

document.getElementById('valider').addEventListener('click', bt =>{
    if (affichage.innerText == '')
        return;
    console.log(bt.target);
    results.innerHTML ="";
    var rep = document.querySelector('#results');
    rep.innerText=("Le résultat pour la table de"
    +" "+affichage.innerText+" "+"est :"+"\r\r");
    for(let i=1; i<=10; i++)
    {
       let li = document.createElement('li');
       let em = document.createElement('em');
       em.innerText = (Number(affichage.innerText)*i);
       em.classList.add('result');
       li.innerHTML = affichage.innerText + ' x ' + i + ' = ';
       li.appendChild(em);
       results.appendChild(li);
    }
})

document.getElementById('clear').addEventListener('click',()=>{
    affichage.innerHTML="";
    results.innerHTML="";
})