package laboratorio4;
import java.util.ArrayList;
public class PedidoInsumo extends Pedido{
        
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