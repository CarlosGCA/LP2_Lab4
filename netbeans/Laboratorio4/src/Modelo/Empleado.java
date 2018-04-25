package Modelo;
public class Empleado{
	private int ID;
	private String nombre;
	private Turno turno;
	private CuentaUsuario usuario;

	public Empleado(int ID, String nombre, Turno turno, CuentaUsuario usuario){
		setID(ID);
		setNombre(nombre);
		setUsuario(usuario);
		setTurno(turno);
	}

	public Empleado(){
	}
	
	public void setUsuario(CuentaUsuario usuario){
	    this.usuario=usuario;
	}

	public CuentaUsuario getUsuario(){
	    return usuario;
	}
	

	public void setID(int ID){
	    this.ID=ID;
	}
	
	public int getID(){
	    return ID;
	}
	
	public void setNombre(String nombre){
	    this.nombre=nombre;
	}
	
	public String getNombre(){
	    return nombre;
	}

	public void setTurno(Turno turno){
	 	this.turno=turno;   
	}

	public Turno getTurno(){
	    return turno;
	}
	
}