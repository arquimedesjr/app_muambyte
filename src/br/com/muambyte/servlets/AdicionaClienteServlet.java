package br.com.muambyte.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.muambyte.jdbc.dao.cliente.ClienteDao;
import br.com.muambyte.modelo.Cliente;

@WebServlet("/adicionaCliente")
public class AdicionaClienteServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String dataEmTexto = request.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		String d_e_l_e_t_e = request.getParameter("d_e_l_e_t_e");
		try {
			java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return;
		}

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setEmail(email);
		cliente.setSexo(sexo);
		cliente.setDataNascimento(dataNascimento);
		cliente.setD_e_l_e_t_e("0");

		ClienteDao clienteDao = new ClienteDao();
		clienteDao.adiciona(cliente);

		out.println("<html>");
		out.println("<body>");
		out.println("Cliente " + cliente.getNome() + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}
}