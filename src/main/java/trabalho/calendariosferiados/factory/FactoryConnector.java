/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.calendariosferiados.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carol
 */
public class FactoryConnector {
    private static Connection conn = null;
    
        public static Connection getConection() {

        try { conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplo_jdbc", "root", "");
                return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
