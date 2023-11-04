package Controlador;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudEmpleadoImp;
import modelo.TblEmpleado;

/**
 * Servlet implementation class ControladorEmpleado
 */
public class ControladorEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	} // Fin del metodo doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		// Recuperamos los valores del formulario
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sexo = request.getParameter("sexo");
		String email = request.getParameter("email");
		String fecha = request.getParameter("fecha");
		String telef = request.getParameter("telefono");
		String dni = request.getParameter("dni");
		
		// Realizamos las respectivas instancias
		TblEmpleado tblemp = new TblEmpleado();
		CrudEmpleadoImp crud = new CrudEmpleadoImp();
		
		// Convertir fecha a Sql
		Date fec = new Date();
		Date fechasql = new Date(fec.getTime());
		
		// Asignamos valores
		tblemp.setNombre(nombre);
		tblemp.setApellido(apellido);
		tblemp.setSexo(sexo);
		tblemp.setEmail(email);
		tblemp.setFechanac(fechasql);
		tblemp.setTel(telef);
		tblemp.setDni(dni);
		
		// Invocamos el metodo registrar
		crud.RegistrarEmpleado(tblemp);
		
		// Recuperamos el listado
		List<TblEmpleado> listado = crud.ListadoEmpleado();
		
		// Enviamos el listado hacia la vista
		request.setAttribute("listado", listado);
		
		// Redireccionamos
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	} // Fin del metodo doPost

}
