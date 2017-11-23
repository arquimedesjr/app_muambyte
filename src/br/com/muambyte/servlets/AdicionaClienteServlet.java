package br.com.muambyte.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.muambyte.dao.cliente.JpaClienteDao;
import br.com.muambyte.modelo.Cliente;

@WebServlet("/adicionaCliente")
public class AdicionaClienteServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws IOException, ServletException {
        // busca o writer
        PrintWriter out = response.getWriter();
                        
        // buscando os parâmetros no request
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
      /*  String sexo = request.getParameter("sexo");*/
        /*String dataEmTexto = request
                .getParameter("dataNascimento");
        Calendar dataNascimento = null;
        
        // fazendo a conversão da data
        try {
            Date date = 
                     (Date) new SimpleDateFormat("dd/MM/yyyy")
.parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
        } catch (ParseException e) {
            out.println("Erro de conversão da data");
            return; //para a execução do método
        }*/
        
        // monta um objeto contato
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        /*cliente.setSexo(sexo);*/
        /*cliente.setDataNascimento(dataNascimento);*/
        cliente.setD_e_l_e_t_e("0");
        
        // salva o contato
        JpaClienteDao dao = new JpaClienteDao();
        dao.adiciona(cliente);
        
        // imprime o nome do contato que foi adicionado
        out.println("<html>");
        out.println("<body>");
        out.println("Cliente " + cliente.getNome() +
                " adicionado com sucesso");
        out.println("</body>");
        out.println("</html>");
    }
}
