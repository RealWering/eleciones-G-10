/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class ClsJdbc {

    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenia = "";
    String bd = "bd_elecciones_r3-5";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;

    public Connection conexion;

    public void CrearConexion() {

        try {
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, usuario, contrasenia);
            if (this.conexion != null) {
                System.out.println("conexion exitosa");
            }
        } catch (Exception error) {
            System.out.println("Error" + error.getMessage());
        }

    }

}
