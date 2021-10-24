package pe.edu.upeu.modulo;

public class SubPrograma{

  public String nombre="Daniel";
  public String DNI="";

  public void saludo(){
    System.out.println("hola"+nombre);
  }

  public void  otrosaludo(String nombrex){
    this.nombre=nombrex;                           
    System.out.println("hola"+nombre);
  }
}