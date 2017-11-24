
<!DOCTYPE html>
<html>
<head>
<title>Cadastro</title>
<meta charset="ISO-8859-1" name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

	<header class="w3-container w3-teal">
		<h1>Cadastra-se</h1>
	</header>

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
				<input class="w3-radio" type="radio" name="sexo" value="female">
				<label>Feminino</label>
			</p>

			<p>
				<input class="w3-radio" type="radio" name="sexo" value="female">
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