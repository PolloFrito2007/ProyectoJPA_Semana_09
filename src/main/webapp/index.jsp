<%@page import="java.util.*"%>
<%@page import="modelo.TblEmpleado" %>

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
				<td>Sexo</td>
				<td colspan="1">
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

	<h1 align="center">Listado de empleados</h1>
	
	<table border="1">
		<tr>
			<th>Codigo</th>
			<th>Nombres</th>
			<th>Apellidos</th>
			<th>Sexo</th>
			<th>Email</th>
			<th>Fec.Nacimiento</th>
			<th>Telefono</th>
			<th>Dni</th>
		</tr>
		<!-- scriptles -->
		<%  
			// Recuperamos los datos del controlador
			List<TblEmpleado> listado = (List<TblEmpleado>)request.getAttribute("listado");
			// Aplicamos la condicion
			if(listado != null){
				// Aplicamos bucle for
				for(TblEmpleado tbemp:listado){
		%>
		<tr>
			<td><%=tbemp.getIdempleado()%></td>
			<td><%=tbemp.getNombre()%></td>
			<td><%=tbemp.getApellido()%></td>
			<td><%=tbemp.getSexo()%></td>
			<td><%=tbemp.getFechanac()%></td>
			<td><%=tbemp.getDni() %></td>
			<td><%=tbemp.getEmail()%></td>
			<td><%=tbemp.getTel()%></td>
		</tr>
		<%		
				} // Cerramos el bucle for
			} // Cerramos el bloque if
		%>
	</table>

</body>
</html>
