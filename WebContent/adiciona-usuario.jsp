
<!DOCTYPE html>
<html>
<head>
<title>Cadastro Usuario</title>
<meta charset="ISO-8859-1" name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

	<header class="w3-container w3-teal">
		<h1>Cadastro de Usuario</h1>
	</header>

	<div class="w3-container w3-half w3-margin-top">

		<form action="adicionaUsuario" class="w3-container w3-card-4"
			method="POST">

			<p>
				<input name="usuario" class="w3-input" type="text"
					style="width: 90%" required> <label>Usuario: </label>
			</p>

			<p>
				<input name="senha" class="w3-input" type="password"
					style="width: 90%" required> <label>Senha: </label>
			</p>
			<p>
				<input class="w3-input" type="password"
					style="width: 90%" required> <label>Senha: </label>
			</p>


			<input type="submit" value="Gravar"
				class="w3-button w3-section w3-teal w3-ripple" />
			</p>

		</form>

	</div>

</body>
</html>