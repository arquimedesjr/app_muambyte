package br.com.muambyte.controller.Cliente;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.muambyte.dao.cliente.ClienteDao;
import br.com.muambyte.dao.cliente.JpaClienteDao;
import br.com.muambyte.modelo.Cliente;

@Transactional
@Controller
public class ClienteController {
	@Autowired
	  ClienteDao dao;
	
	@RequestMapping("/adicionaCadasto")
	  public String execute() {
	      System.out.println("Executando o cadastro do cliente");
	      return "formulario";
	  }
	@RequestMapping("adicionaCadastros")
	  public String adiciona() {
	    JpaClienteDao dao = new JpaClienteDao();
	    Cliente cliente = new Cliente();
	    dao.adiciona(cliente);
	    return "CadastroCliente";
	  }
}
