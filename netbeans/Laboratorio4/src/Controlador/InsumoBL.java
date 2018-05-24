package Controlador;

/**
 *
 * @author Sebastian
 */

import AccesoData.InsumoAD;
import Modelo.*;
import java.util.ArrayList;

public class InsumoBL {
    private InsumoAD accesoDatos;
    
    public InsumoBL(){
        accesoDatos= new InsumoAD();
    }
    
    public int obtenerID(){
        return accesoDatos.id_correlativo();
    }
    
    public ArrayList<String> listarMedidas(){
        return accesoDatos.listarMedidas();
    }
    
    public ArrayList<Insumo> listarInsumo(){
        return accesoDatos.listarInsumos();
    }
    
    public void registrarInsumo(int id,String nombre,int medida){
        accesoDatos.registarUsuario(id, nombre, medida);
    }
}
