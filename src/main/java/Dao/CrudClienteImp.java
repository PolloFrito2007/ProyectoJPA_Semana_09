package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iclienteable;
import modelo.TblCliente;

public class CrudClienteImp implements Iclienteable{

	@Override
	public void RegistrarCliente(TblCliente tblcli) {
		// Establecemos conexión con la unidad de persistencia
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		// Inicializar la transacción
		emanager.getTransaction().begin();
		// Registramos
		emanager.persist(tblcli);
		// Confirmamos
		emanager.getTransaction().commit();
		// Cerramos
		emanager.close();
	}

	@Override
	public void ActualizarCliente(TblCliente tblcli) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarCliente(TblCliente tblcli) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblCliente> ListadoCliente() {
		// Establecemos conexion con la unidad de persistencia
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager = factory.createEntityManager();
		emanager.getTransaction().begin();
		// Listado
		List<TblCliente> listado = emanager.createQuery("select e from TblCliente e",TblCliente.class).getResultList();
		// Confirmamos
		emanager.getTransaction().commit();
		// Cerramos
		emanager.close();
		//
		return listado;
	}

	@Override
	public TblCliente BuscarCliente(TblCliente tblcli) {
		return null;
	}

	
	
}
