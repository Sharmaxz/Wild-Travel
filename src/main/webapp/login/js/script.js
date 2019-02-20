$(function(){
    function runEffect() {
        $("#signIn").animate({
            opacity: 0.5
        });
    }

    $( "#signUp" ).on("click", function() {
        runEffect();
        return false;
    });
});