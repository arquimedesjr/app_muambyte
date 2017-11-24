package br.com.muambyte.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.muambyte.jdbc.dao.usuario.UsuarioDao;
import br.com.muambyte.modelo.Usuario;

@WebServlet("/adicionaUsuario")
public class AdicionaUsuarioServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String d_e_l_e_t_e = request.getParameter("d_e_l_e_t_e");

		Usuario login = new Usuario();
		login.setUsuario(usuario);
		login.setSenha(senha);
		login.setD_e_l_e_t_e("0");

		UsuarioDao dao = new UsuarioDao();
		dao.adiciona(login);

		out.println("<html>");
		out.println("<body>");
		out.println("Usuario " + login.getUsuario() + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}
}
