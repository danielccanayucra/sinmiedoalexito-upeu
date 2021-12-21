package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.InventarioTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class ProductoDao extends AppCrud{
    
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    final String RECURSOS_TURISTICOS="Inventario.txt";

    LeerArchivo leerArch;
    InventarioTO inveTO;

    

    public Object[][] crearProducto() {
        util.clearConsole();
        leerArch=new LeerArchivo(RECURSOS_TURISTICOS);    
        inveTO=new InventarioTO();
        inveTO.setIdRT(generarId(leerArch, 0, "p", 1));
        inveTO.setNombre(leerTecla.leer("", "Ingrese nombre del Recurso Turistico"));
        inveTO.setCategoria(leerTecla.leer("", "Ingrese el tipo de categoria"));
        inveTO.setTipoC(leerTecla.leer("", "Ingrese el tipo de categoria"));
        inveTO.setUbicacion(leerTecla.leer("", "Ingrese la ubicacion"));
        leerArch=new LeerArchivo(RECURSOS_TURISTICOS);           
        return agregarContenido(leerArch, inveTO); 
    }

    public void reportarProductos(){
         leerArch=new LeerArchivo(RECURSOS_TURISTICOS);
        Object[][] data= listarContenido(leerArch);
        util.pintarLine('H', 58);
        util.pintarTextHeadBody('H', 7, "id,Nombre,categoria,ubicacion");
        System.out.println("");        
        util.pintarLine('H', 58);
        String dataPrint1="";
        String dataPrint="";
        int util1=0;
        for (int i = 0; i < data.length; i++) {           
            dataPrint=data[i][0]+","+data[i][1]+","+data[i][2]+","+data[i][4];

            util.pintarTextHeadBody('B', 7, dataPrint);
      }
      util.pintarLine('H', 58);
    }
    public void reportarProductos(Object[][] data) {
        util.pintarLine('H', 58);
        util.pintarTextHeadBody('H', 7, "id,Nombre,categoria,ubicacion");
        System.out.println("");        
        util.pintarLine('H', 58);
        String dataPrint="";
        for (int i = 0; i < data.length; i++) {            
             dataPrint=data[i][0]+","+data[i][1]+","+data[i][2]+","+data[i][4];
             util.pintarTextHeadBody('B', 7 , dataPrint);   
        }
        util.pintarLine('H', 58);
        System.out.println();
     }  
    public void updateProducto() {  
        util.clearConsole();
        reportarProductos();      
        String dataId=leerTecla.leer("", "Ingrese el Id del R.T.");        
        inveTO=new InventarioTO();
        inveTO.setNombre(leerTecla.leer("","ingrese el nuevo nombre"));
        inveTO.setCategoria(leerTecla.leer("","ingrese la nueva categoria"));
        inveTO.setTipoC(leerTecla.leer("","ingrese el nuevo tipo de Categoria"));
        inveTO.setUbicacion(leerTecla.leer("","ingrese la nueva ubicacion"));
        leerArch=new LeerArchivo(RECURSOS_TURISTICOS);
        Object[][] data= editarRegistro(leerArch, 0, dataId, inveTO);
        util.clearConsole();
        reportarProductos(data);
    }
    public void deleteProducto() {
        util.clearConsole();
        reportarProductos();  
        String dataId=leerTecla.leer("", "Ingrese el Id del Producto"); 
        leerArch=new LeerArchivo(RECURSOS_TURISTICOS);
        Object[][] data= eliminarRegistros(leerArch, 0, dataId);
        util.clearConsole();
        reportarProductos(data);
    }
    



}
