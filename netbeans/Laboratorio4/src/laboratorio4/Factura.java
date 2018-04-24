/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author LENOVO
 */
public class Factura extends DocumentoPago {
    private int ruc;
    private String razonSocial;
    private float igv_Factura;
    
    public Factura(String idDoc,float total,int idPedido,Cliente cliente,boolean registrada, int ruc){
        super(idDoc, total, idPedido, cliente, registrada);
        setRuc(ruc);
    }
    /**
     * @return the ruc
     */
    public int getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(int ruc) {
        this.ruc = ruc;
    }
    
    
}
