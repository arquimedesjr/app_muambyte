<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,
        br.com.muambyte.jdbc.dao.cliente.ClienteDao,
        br.com.muambyte.modelo.Cliente" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table>
      <%
      ClienteDao dao = new ClienteDao();
      List<Cliente> clientes = dao.getLista();
      
      for (Cliente cliente : clientes ) {
      %>
        <tr>
        <td><%=cliente.getIdCliente() %></td> 
          <td><%=cliente.getNome() %></td> 
          <td><%=cliente.getCpf() %></td> 
          <td><%=cliente.getEmail() %></td> 
          <td><%=cliente.getRg() %></td> 
          <td><%=cliente.getSexo() %></td> 
          <td><%=cliente.getTelefone() %></td> 
          <td><%=cliente.getD_e_l_e_t_e()%></td> 
          <td><%=cliente.getEndereco() %></td>
          <td><%=cliente.getDataNascimento().getTime() %></td>
        </tr>
      <%
      }
      %>
    </table>

</body>
</html>