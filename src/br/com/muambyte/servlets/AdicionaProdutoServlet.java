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

import br.com.muambyte.modelo.Produto;

@WebServlet("/adicionaProduto")
public class AdicionaProdutoServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// busca o writer
		PrintWriter out = response.getWriter();

		// buscando os parâmetros no request
		String nome = request.getParameter("nome");
		String quantidade = request.getParameter("quantidade");
		String precoUnitario = request.getParameter("precoUnitario");
		String d_e_l_e_t_e = request.getParameter("d_e_l_e_t_e");
			

		// monta um objeto contato
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPrecoUnitario(precoUnitario);
		produto.setQuantidade(quantidade);
		produto.setD_e_l_e_t_e("0");
		
		

		// salva o contato
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("muambyte");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();

		System.out.println("Gravado!");
		manager.close();

		// imprime o nome do contato que foi adicionado
		out.println("<html>");
		out.println("<body>");
		out.println("Produto " + produto.getNome() + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
	}
}
