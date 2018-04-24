package laboratorio4;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PedidoInsumo{
        private int idPedido;
	private estadoPedido estadoPed;
	
	private Date fechaRegPed;
	private Date fechaEntrPed;
    
	private ArrayList<Ingrediente> listaInsumoPedido;
	private Almacen almacenOrigen;
	private Almacen almacenFin;
	
	public PedidoInsumo(Almacen almacenOrigen,Almacen almacenFin){
		this.almacenOrigen=almacenOrigen;
		this.almacenFin=almacenFin;		
		listaInsumoPedido=new ArrayList<Ingrediente>();
	}
	public PedidoInsumo(){
		listaInsumoPedido=new ArrayList<Ingrediente>();
	}
	
	public void setidPedido(int idPedido){
		this.idPedido=idPedido;
	}
	public int getidPedido(){
		return this.idPedido;
	}
	
	public void setestadoPedo(estadoPedido estadoPed){
		this.idPedido=idPedido;
	}
	public estadoPedido getestadoPed(){
		return this.estadoPed;
	}
	public void setfechaRegPed(String fechaRegPed)throws Exception{
		SimpleDateFormat formt=new SimpleDateFormat("dd/MM/yyyy");
		this.fechaRegPed=formt.parse(fechaRegPed);
	}
	public Date getfechaRegPed(){
		return this.fechaRegPed;
	}
	
	public void setfechaEntrPed(String fechaEntrPed)throws Exception{
		SimpleDateFormat formt=new SimpleDateFormat("dd/MM/yyyy");
		this.fechaEntrPed=formt.parse(fechaEntrPed);
	}
	public Date getfechaEntrPed(){
		return this.fechaEntrPed;
	}
	public void setlistaInsumoPedido(ArrayList<Ingrediente> listaInsumoPedido){
		this.listaInsumoPedido=listaInsumoPedido;
	}
	public ArrayList<Ingrediente> getlistaInsumoPedido(){
		return this.listaInsumoPedido;
	}
	
	public void setalmacenOrigen(Almacen almacenOrigen){
		this.almacenOrigen=almacenOrigen;
	}
	public Almacen getalmacenOrigen(){
		return this.almacenOrigen;
	}
	
	public void setalmacenFin(Almacen almacenFin){
		this.almacenFin=almacenFin;
	}
	public Almacen getalmacenFin(){
		return this.almacenFin;
	}
	
	public void realizarPedidoInsumo(int codInsumo,int cant){
	}
}