package br.com.muambyte.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("adicionaLogin")
	public String form() {
		return "login/formulario";
	}

}
