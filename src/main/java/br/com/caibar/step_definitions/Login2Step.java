package br.com.caibar.step_definitions;

import br.com.caibar.pages.actions.LoginPageAction;
import br.com.neoway.firefly.support.Log;
import cucumber.api.java.pt.Dado;

public class Login2Step {

	private LoginPageAction loginPageAction;

	public Login2Step(LoginPageAction loginPageAction) {
		this.loginPageAction = loginPageAction;
	}


	@Dado("^que o usuário esteja na página de principal da Aplicação$")
	public void queOUsuarioEstejaNaPaginaDePrincipalDaAplicacao() throws Exception {
		loginPageAction.enterSite();
		Log.info(System.getProperty("browser"));
		Log.info(System.getProperty("remote"));
		Log.info(System.getProperty("connectionURL"));
	}
	
}
