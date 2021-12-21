package pe.edu.upeu.app;

import pe.edu.upeu.modelo.InventarioTO;


public class App{

    public static InventarioTO[] cliente;

    public static void main( String[] args ){    
        MenuPrincipal mp=new MenuPrincipal();
        mp.mainLogin();
    }

}
