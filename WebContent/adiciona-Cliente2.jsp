
<!DOCTYPE html>
<html>
<head>
<title>Cadastro</title>
<meta charset="ISO-8859-1" name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3.css">
<!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/heroic-features.css" rel="stylesheet">
</head>
<body>

	    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Loja ArquIvi Modas</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Inicio
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Cadastra-se</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="http://localhost:8080/LojaMuambyte/adiciona-Cliente2.jsp">Acessar</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Contato</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" href="#">Carrinho</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

	<div class="w3-container w3-half w3-margin-top">

		<form action="adicionaCliente" class="w3-container w3-card-4"
			method="POST">

			<p>
				<input name="nome" class="w3-input" type="text" style="width: 90%"
					required> <label>Nome</label>
			</p>

			<p>
				<input name="cpf" class="w3-input" type="text" style="width: 90%"
					required> <label>CPF (sem o ".", "-", exemplo:
					12345678910)</label>
			</p>

			<p>
				<input name="rg" class="w3-input" type="text" style="width: 90%"
					required> <label>RG</label>
			</p>

			<p>
				<input name="telefone" class="w3-input" style="width: 90%" required>
				<label>Telefone</label>
			</p>

			<p>
				<input name="email" class="w3-input" type="text" style="width: 90%"
					required> <label>Email:</label>
			</p>
			<p>
				<input name="dataNascimento" class="w3-input" type="text"
					style="width: 90%" required> <label>dataNascimento:</label>
			</p>
			<p>
				<input name="endereco" class="w3-input" type="text"
					style="width: 90%" required> <label>Endereco:
					(inserir o endereço completo, logadouro, numero e cep)</label>
			</p>
			<p>
				<input class="w3-radio" type="radio" name="sexo" value="Feminino">
				<label>Feminino</label>
			</p>

			<p>
				<input class="w3-radio" type="radio" name="sexo" value="Masculino">
				<label>Masculino</label>
			</p>

			<p>

				<input type="submit" value="Gravar"
					class="w3-button w3-section w3-teal w3-ripple" />
			</p>

		</form>

	</div>

</body>
</html>