package br.com.muambyte.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.muambyte.modelo.Cliente;
import br.com.muambyte.modelo.Login;

@WebServlet("/adicionaUsuario")
public class AdicionaUsuarioServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// busca o writer
		PrintWriter out = response.getWriter();

		// buscando os parâmetros no request
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String d_e_l_e_t_e = request.getParameter("d_e_l_e_t_e");
		
		
		

		// monta um objeto contato
		Login login = new Login();
		login.setUsuario(usuario);
		login.setSenha(senha);
		login.setD_e_l_e_t_e("0");

		// salva o contato
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(login);
		manager.getTransaction().commit();

		System.out.println("Gravado!");
		manager.close();

		// imprime o nome do contato que foi adicionado
		Cliente cliente = new Cliente();
		out.println("<html>");
		out.println("<body>");
		out.println("Cliente " + cliente.getNome() + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}
}
