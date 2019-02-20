$(function(){
    function runEffect() {
        $("#formLogin").fadeOut(1);
        $("#formRegistration").fadeIn(450);
    }

    $( "#signUp" ).on("click", function() {
        runEffect();
        return false;
    });

    $( ".fas" ).on("click", function() {
        $("#formRegistration").fadeOut(1);
        $("#formLogin").fadeIn(450);
        return false;
    });
});