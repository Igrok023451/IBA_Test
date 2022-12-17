package steps;

import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    public SearchResulLoginSteps changeLang() {
        loginPage.changeLanguageEng();
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps setUserAndPasswordValue(String user, String psw){
        loginPage.sendTextToUserField(user);
        loginPage.sendTextToPasswordField(psw);
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps pastUserAndPasswordValue(String user, String psw) {
        loginPage.pastLogin(user);
        loginPage.pastPassword(psw);
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps pushButtonSignInEnter() {
        loginPage.passEnter();
        return new SearchResulLoginSteps();
    }
    public SearchResulLoginSteps clickButtonSignIn(){
        loginPage.clickToButtonSignIn();
        return new SearchResulLoginSteps();
    }


}
