package com.grupoica.ejem05modelo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DerbyDBUsuario der = new DerbyDBUsuario();
        ArrayList<Usuario> arr = der.listar();
        /*for(Usuario us: arr) {
        	System.out.println("Usu: " + us.getNombre());
        }*/
    }
}
