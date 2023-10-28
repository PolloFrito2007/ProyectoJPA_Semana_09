<html>
<body>
<h2 align="center">Registrar Empleado</h2>

<form method="post" action="ControladorEmpleado">
	<table border="1" align="center">
		<tr>
			<td>Nombre</td>
			<td><input type="text" name="nombre"></td>
		</tr>
		<tr>
			<td>Apellido</td>
			<td><input type="text" name="apellido"></td>
		</tr>
		<tr>
			<td colspan="2">
				<select name="sexo">
					<option>Seleccione sexo</option>
					<option>M</option>
					<option>F</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>FecNac.</td>
			<td><input type="text" name="fecha"></td>
		</tr>
		<tr>
			<td>Telefono</td>
			<td><input type="text" name="telefono"></td>
		</tr>
		<tr>
			<td>DNI</td>
			<td><input type="text" name="dni"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Registrar"></td>
		</tr>
	</table>
</form>

</body>
</html>
