/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoData;

import Modelo.Empresa;
import Modelo.Natural;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

/**
 *
 * @author Kathy Ruiz :)
 */
public class ClientesAD {

    public void registrarNat(Natural nat) {
        try {
            //Registrar el Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g7", "inf282g7", "0mvK88");

            CallableStatement cs
                    = con.prepareCall("{call "
                            + "CREAR_NATURAL(?,?,?,?,?,?)}"
                    );

            String nomE1, nomE2;
            cs.setString(1, nat.getDNI());
            cs.setString(2, nat.getNombre());
            cs.setInt(3, nat.getTelefono());
            cs.setString(4,nat.getDireccion());
            cs.setString(5,nat.getCuentaBancaria());
            int u=1;
            cs.setInt(6,u);

            cs.executeUpdate();
//            int numM1;
//            numM1 = cs.getInt(1);

            System.out.println("El Cliente ha sido registrado correctamente");
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void registrarEmp(Empresa emp) {
        try {
            //Registrar el Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g7", "inf282g7", "0mvK88");

            CallableStatement cs
                    = con.prepareCall("{call "
                            + "CREAR_EMPRESA(?,?,?,?,?,?)}"
                    );

          
            cs.setString(1, emp.getRuc());
            cs.setString(2, emp.getRazonSocial());
            cs.setInt(3, emp.getTelefono());
            cs.setString(4, emp.getDireccion());
            cs.setString(5, emp.getCuentaBancaria());
            int i=1;
            cs.setInt(6, i);

            cs.executeUpdate();
            //int numM1;
            //numM1 = cs.getInt(1);

            System.out.println("El Cliente ha sido registrado correctamente");
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
