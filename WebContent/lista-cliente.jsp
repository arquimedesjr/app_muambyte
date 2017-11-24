<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,
        br.com.muambyte.jdbc.dao.cliente.ClienteDao,
        br.com.muambyte.modelo.Cliente"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Relatorio de Cliente</title>
<meta charset="ISO-8859-1" name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

	<header class="w3-container w3-teal">
	<h1>Relatorio de Cliente</h1>
	</header>

	<table style="width: 100%">
		<div>
			<tr>
				<th>Id Cliente</th>
				<th>Nome</th>
				<th>CPF</th>
				<th>RG</th>
				<th>Sexo</th>
				<th>Telefone</th>
				<th>Data de Nascimento</th>
				<th>Email</th>
				<th>Endereço</th>
			</tr>
		</div>

		<%
			ClienteDao dao = new ClienteDao();
			List<Cliente> clientes = dao.getLista();

			for (Cliente cliente : clientes) {
		%>

		<tr>
			<td class="w3-container w3-teal"><%=cliente.getIdCliente()%></td>
			<td class="w3-container w3-teal"><%=cliente.getNome()%></td>
			<td class="w3-container w3-teal"><%=cliente.getCpf()%></td>
			<td class="w3-container w3-teal"><%=cliente.getRg()%></td>
			<td class="w3-container w3-teal"><%=cliente.getSexo()%></td>
			<td class="w3-container w3-teal"><%=cliente.getTelefone()%></td>
			<td class="w3-container w3-teal"><%=cliente.getDataNascimento().getTime()%></td>
			<td class="w3-container w3-teal"><%=cliente.getEmail()%></td>
			<td class="w3-container w3-teal"><%=cliente.getEndereco()%></td>
		</tr>


		<%
			}
		%>

		<p>
			<a class="w3-bar-item w3-button w3-teal" href="http://localhost:8081/LojaMuambyte/">Voltar</a>
		</p>
	</table>

</body>
</html>