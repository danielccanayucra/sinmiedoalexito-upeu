package pe.edu.upeu.app;

import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.utils.LeerTeclado;

public class MenuPrincipal {
    LeerTeclado lt=new LeerTeclado();
    ProductoDao prodDao;
    UsuarioDao uDao;
    
    public void mainLogin() {
      uDao=new UsuarioDao();
      if (uDao.login()) {

        menuOpciones();

        
      }else{
        System.out.println("Intente Nuevamente!!");
        mainLogin();
      }
    }


    

    public void menuOpciones() {        
        int opcionesA=0;
        System.out.println("**********Bienvenido al Sistema *********");
        String msg="\nEliga una Opcion"+ 
        "\n1=crear inventario"+
        "\n2=imprimir inventario"+
        "\n3=editar inventario"+
        "\n4=eliminar recurso turistico"+
        "\n5=crear nuevo usuario"+
        "\n";     
        opcionesA=lt.leer(0, msg);  
        while(opcionesA!=0){
            switch(opcionesA) {

              case 1:{ 
                    prodDao=new ProductoDao();
                    prodDao.crearProducto();
                    } break;

            
              case 2:{
                prodDao=new ProductoDao();
                prodDao.reportarProductos();
              }  break; 

              case 3:{
                prodDao=new ProductoDao();
                prodDao.updateProducto();
              }  break; 

              case 4:{
                prodDao=new ProductoDao();
                prodDao.deleteProducto();
              }  break; 

              case 5:{
                uDao=new UsuarioDao();
                uDao.crearUsuario();
              }  break; 

              default: System.out.println("La opcion ingresada no existe!");
              
            }   
          System.out.println("---------------------------------------------------------------------------------------------------------------------"); //15.511.210.043.330.985.984.000.000        
          opcionesA=lt.leer(0,msg);        
        }        
    }
}
