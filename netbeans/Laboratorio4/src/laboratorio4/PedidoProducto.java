package laboratorio4;
import java.util.ArrayList;

public class PedidoProducto extends Pedido{
	private Cliente cliente;
	private ArrayList<Integer> listproductos;
	private ArrayList<Integer> listcantidades;
	private DocumentoPago documPago;
	
	public PedidoProducto(Cliente cliente,DocumentoPago documPago){
		this.cliente=cliente;
		this.documPago=documPago;
		listcantidades= new ArrayList<Integer>();
		listproductos= new ArrayList<Integer>();
	}
	
	public void setcliente(Cliente cliente){
		this.cliente=cliente;
	}
	public Cliente getcliente(){
		return this.cliente;		
	}	
	
	public void setdocumPago(DocumentoPago documPago){
		this.documPago=documPago;
	}
	public DocumentoPago getdocumPago(){
		return this.documPago;		
	}
	
	public ArrayList<Integer> getlistproductos(){
		return listproductos;
	}
		
		
	public ArrayList<Integer> getlistcantidades(){
		return listcantidades;
	}
	
	public void RealizarPedidoProducto(int codProd,int cant){
	}
	
	public int subtotal(){
		//solo para compilar
		return 1;
	}
	
	public void registrarDocPago(){
	}
	
	public void imprimirDocPago(){
		
	}
}