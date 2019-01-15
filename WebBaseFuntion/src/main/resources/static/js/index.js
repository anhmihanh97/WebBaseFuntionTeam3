var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2000); // Change image every 2 seconds
}
var toTop = document.getElementById("goto-topJS");
  
  toTop.addEventListener("click", function(){
  scrollToTop(4000);
});
function scrollToTop(scrollDuration) {
    var scrollStep = -window.scrollY / (scrollDuration / 15),
        scrollInterval = setInterval(function(){
        if ( window.scrollY != 0 ) {
            window.scrollBy( 0, scrollStep );
        }
        else clearInterval(scrollInterval); 
    },15);
}

function validatePhone(val) {
   var R = /(09|01[2|6|8|9])+([0-9]{8})\b$/ ;
   var t = R.exec(val.value);
   if(!t) {
     alert("Sai rùi bạn")
   }
   else {
     alert("chúc mừng bạn")
   }
}