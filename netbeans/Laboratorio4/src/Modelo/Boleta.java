/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Boleta extends DocumentoPago{
    
    private int dni;
    private String nombre;
    private float igv_Boleta;
    public Boleta(String idDoc,float total,int idPedido,Cliente cliente,boolean registrada, int ruc){
        super(idDoc, total, idPedido, cliente, registrada);
    }
    /**
     * @return the ruc
     */
    
}
