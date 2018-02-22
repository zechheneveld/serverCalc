$(document).ready(function () {
   var allChildren = $("#thelog").children().toArray();
   allChildren.shift();

   for (var i = 0; i < allChildren.length; i++){
       $(allChildren[i]).hide();
   }
    for (var i = 0; i < allChildren.length; i++) {
        $(allChildren[i]).delay(i * 250).fadeIn(1000);
    }
});