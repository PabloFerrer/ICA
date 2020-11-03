/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoica.ejem05modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author German
 */
public class DerbyDBUsuario {
	
	private static final String STR_CONEX = "jdbc:derby:C:\\Users\\pable\\Documents\\GitHub\\db_ica;create=true";
	
    public DerbyDBUsuario() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(DerbyDBUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    	Connection con = null;
        try {
        	con = DriverManager.getConnection(STR_CONEX);
        	Statement stmt = con.createStatement();
        	//stmt.executeUpdate("DROP TABLE Usuario");
        	stmt.executeUpdate("CREATE TABLE Usuario("
        			+ " id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),"
        			+ " nombre varchar(255),"
        			+ " edad int,"
        			+ " email varchar(255),"
        			+ " password varchar(255))");
        	/*
        	stmt.executeUpdate("INSERT INTO Usuario (nombre,edad,email,pass) Values"
        			+ "('Pablo', 24, 'pablo.ferrer@grupoica.com','patata')");*/
        	con.close();
        } catch (SQLException ex) {
        	System.out.println("Error SQL " + ex.getMessage());
        	try {
        		con.close();	
        	}catch (Exception ex2) {
        		System.out.println("Error " + ex2.getMessage());
        	}
        	
        }
        
    }

    public ArrayList<Usuario> listar() {
        try (Connection con = DriverManager.getConnection(
                STR_CONEX)) {

            ArrayList<Usuario> listaUsu = new ArrayList<>();
            String consultaSQL = "SELECT id, nombre, edad, email, password FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consultaSQL);
            while (res.next()) {    // Obtener cada uno de los registros
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String email = res.getString("email");
                String password = res.getString("password");
                int edad = res.getInt("edad");
                Usuario usu = new Usuario(nombre, password, edad, email);
                listaUsu.add(usu);
            }
            // Si todo ha ido bien:
            return listaUsu;
        } catch (SQLException ex) {
            System.err.println(" >>>>  " + ex.getMessage());
            return null;
        }
    }

    public boolean crear(Usuario persona) {

        try (Connection con = DriverManager.getConnection(
                STR_CONEX)) {
            String sqlID = "SELECT COUNT(id) AS ultId FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sqlID);
            if (res.next()) {
                int ultId = res.getInt("ultId");
                ultId++;
                String sqlInsert = "INSERT INTO usuario (id, nombre, edad, email, password) VALUES ("
                        + ultId + ", '" + persona.getNombre() + "' ,  "
                        + persona.getEdad() + " ,  '"
                        + persona.getEmail() + "' ,  '"
                        + persona.getPassword() + "' )";
                System.err.println(" >>>>  " + sqlInsert);
                sentencia = con.createStatement();
                sentencia.executeUpdate(sqlInsert);  
                return true;              
            }
            return false;
        } catch (SQLException ex) {
            System.err.println(" >>>>  " + ex.getMessage());
            return false;
        }
    }
}
