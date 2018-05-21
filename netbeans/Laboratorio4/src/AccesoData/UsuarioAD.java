/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kathy Ruiz :)
 */
package AccesoData;

import Modelo.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UsuarioAD {
    public void registrar(Empleado emp){
        try{
            //Registrar el Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g7", "inf282g7", "0mvK88");
            
            CallableStatement cs
                    = con.prepareCall("{call "
                            + "CANT_NOMBRE_MED_ESP(?,?,?,?,?,?,?,?,?,?)}"
                    );
            
            String nomE1, nomE2;
            cs.setString(2,Integer.toString(emp.getDNI()));
            cs.setString(3, emp.getNombre());
            cs.setString(4, emp.getApellido());
            cs.setString(5, String.valueOf(emp.getSexo()));
            cs.setString(6, emp.getFechaNac());
            cs.setString(7, emp.getUsuario().getnombreUsuario());
            cs.setString(8, emp.getUsuario().getcontrasenha());
            cs.setString(9, emp.getUsuario().getpermise().getNombre());
            cs.setString(10, emp.getTurno().toString());

            cs.executeUpdate();
            int numM1;
            numM1 = cs.getInt(1);
            
            System.out.println("El Usuario %d ha sido registrado correctamente");
            con.close();
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}