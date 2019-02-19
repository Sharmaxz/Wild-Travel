$(function(){
    function runEffect() {
        $("#signUp").animate({
            opacity: 0.5
        });
    }


    $( "#signIn" ).on("click", function() {
        runEffect();
        return false;
    });
});