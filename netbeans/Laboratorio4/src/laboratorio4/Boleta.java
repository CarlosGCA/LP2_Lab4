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
public class Boleta extends DocumentoPago{
    
    public Boleta(String idDoc,float total,int idPedido,Cliente cliente,boolean registrada, int ruc){
        super(idDoc, total, idPedido, cliente, registrada);
    }
    /**
     * @return the ruc
     */
    
}
