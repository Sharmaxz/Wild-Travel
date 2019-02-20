<div id="signIn" class="container-login-center">
    <div class="container-login shadow p-3 mb-5 rounded">
        <form id="formLogin">
            <div class="form-group">
                <label>SIGN IN</label>
            </div>
            <div class="form-group">
                <label for="InputEmail">Email</label>
                <input type="email" class="form-control" id="InputEmail">
            </div>
            <div class="form-group">
                <label for="InputPassword">Password</label>
                <input type="password" class="form-control" id="InputPassword" >
            </div>
            <div class="form-group">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="invalidCheck3">
                    <label class="form-check-label">
                        Remember me
                    </label>
                </div>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
            <div class="card-footer" >
                <div class="d-flex justify-content-center links">
                    <a style="color: white"> Don't have an account? &nbsp;</a><a id="signUp" href="" onclick="return false;">Sign Up</a>
                </div>
                <div class="d-flex justify-content-center">
                    <a href="#">Forgot your password?</a>
                </div>
            </div>
        </form>
        <form id="formRegistration">
            <div class="form-group">
                <a href="" class="fas fa-chevron-left" onclick="return false;"></a>
                <label>REGISTRATION</label>
            </div>
            <div class="form-group">
                <label for="InputRName">Fullname</label>
                <input type="text" class="form-control" id="InputRName" onkeyup="this.value=this.value.replace(/([^a-zA-Z \u00C0-\u00FF])/g,'');">
            </div>
            <div class="form-group">
                <label for="InputREmail">Email</label>
                <input type="email" class="form-control" id="InputREmail" onkeyup="this.value=this.value.replace(/ /,'');">
            </div>
            <div class="form-group">
                <label for="InputRPassword">Password</label>
                <input type="password" class="form-control" id="InputRPassword" >
            </div>
            <div class="form-group">
                <label for="InputRCPassword">Confirm Password</label>
                <input type="password" class="form-control" id="InputRCPassword" >
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
</div>




