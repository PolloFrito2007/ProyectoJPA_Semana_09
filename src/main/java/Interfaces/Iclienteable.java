package Interfaces;

import java.util.List;

import modelo.TblCliente;

public interface Iclienteable {

	// Declaramos los metodos
	public void RegistrarCliente(TblCliente tblcli);
	public void ActualizarCliente(TblCliente tblcli);
	public void EliminarCliente(TblCliente tblcli);
	public List<TblCliente> ListadoCliente();
	public TblCliente BuscarCliente(TblCliente tblcli);
	
} // Fin de la interface
