<!DOCTYPE html>
<html>
<head>
<title>Cadastro Produto</title>
<meta charset="ISO-8859-1" name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

	<header class="w3-container w3-teal">
		<h1>Produto</h1>
	</header>

	<div class="w3-container w3-half w3-margin-top">

		<form action="adicionaProduto" class="w3-container w3-card-4" method="POST">

			<p>
				<input name="nome" class="w3-input" type="text" style="width: 90%"
					required> <label>Nome do Produto</label>
			</p>

			<p>
				<input name="quantidade" class="w3-input" type="text" style="width: 90%"
					required> <label>Quantidade:</label>
			</p>

			<p>
				<input name="precoUnitario" class="w3-input" type="text" style="width: 90%"
					required> <label>Preço Unitario</label>
			</p>

			
				
				<input type="submit" value="Gravar"  class="w3-button w3-section w3-teal w3-ripple"/>
			</p>

		</form>

	</div>

</body>
</html>