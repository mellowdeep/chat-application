var menu = document.getElementById('menu'),
    panelMenu = menu.querySelectorAll('li'),
    panelBoxes = document.querySelectorAll('.panel__box'),
    signUp = document.getElementById('signUp'),
    signIn = document.getElementById('signIn'),
    errors = document.getElementsByClassName("has-danger");


function removeSelection(){
    for(var i = 0, len = panelBoxes.length; i < len; i++){
            panelBoxes[i].classList.remove('active');
      }
}

if (errors.length) {
  removeSelection();
    panelBoxes[1].classList.add('active');
    menu.classList.add('second-box');
}


signIn.onclick = function(e){
  e.preventDefault();
  removeSelection();
  panelBoxes[0].classList.add('active');
  menu.classList.remove('second-box');
}

signUp.onclick = function(e){
  e.preventDefault();
  removeSelection();
  panelBoxes[1].classList.add('active');
  menu.classList.add('second-box');
}
