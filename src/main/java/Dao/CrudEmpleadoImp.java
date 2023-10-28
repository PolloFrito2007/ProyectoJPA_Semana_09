package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iempleadoable;
import modelo.TblEmpleado;

public class CrudEmpleadoImp implements Iempleadoable {

	@Override
	public void RegistrarEmpleado(TblEmpleado tbemp) {
		// Establecemos conexión con la unidad de persistencia
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		// Inicializar la transacción
		emanager.getTransaction().begin();
		// Registramos
		emanager.persist(tbemp);
		// Confirmamos
		emanager.getTransaction().commit();
		// Cerramos
		emanager.close();
	}

	@Override
	public void ActualizarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblEmpleado> ListadoEmpleado() {
		// Establecemos conexion con la unidad de persistencia
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		// Listado
		List<TblEmpleado> listado = emanager.createQuery("select e from TblEmpleado e", TblEmpleado.class).getResultList();
		// Confirmamos
		emanager.getTransaction().commit();
		// Cerramos
		emanager.close();
		//
		return listado;
	}

	@Override
	public TblEmpleado BuscarEmpleado(TblEmpleado tbemp) {
		return null;
	}

}
