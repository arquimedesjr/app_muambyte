<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<!-- cria o DAO -->
	<jsp:useBean id="dao" class="br.com.muambyte.dao.cliente.JpaClienteDao" />

	<table border="1">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereço</th>
			<th>Data</th>
		</tr>
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="cliente" items="${dao.getlista}">


			<tr>
				<td>${cliente.nome}</td>

				<td><c:choose>
						<c:when test="${not empty cliente.email}">
							<a href="mailto:${cliente.email}">${cliente.email}</a>
						</c:when>
						<c:otherwise>
							E-mail não informado
      					</c:otherwise>
					</c:choose></td>
				<td>${cliente.endereco}</td>
				<td><fmt:formatDate value="${cliente.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td>
     			 <a href="mvc?logica=RemoveContatoLogic&id=${cliente.id}">Remover</a>
    </td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>