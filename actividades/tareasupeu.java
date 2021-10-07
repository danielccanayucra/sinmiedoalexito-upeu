import java.util.Scanner;
public class tareasupeu{
 static Scanner sc = new Scanner(System.in);
 static void ejercicio1(){
    //declaracion de variables de inicializacion
    int edad=0;
    //datos de entrada
        
        System.out.println("Ingrese su edad:");
        edad=sc.nextInt();
    //proceso
     if(edad>=18){
       System.out.println("usted si puede votar");
     }else{
        System.out.println("usted no puede votar");
     }

 }
 static void menuOpciones(){ 
  int opcionesA=0;
  System.out.println("-------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares:";
  System.out.println(msg);
  opcionesA=sc.nextInt();  
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: ejercicio1();break;
        
        default:
          System.out.println("El Algoritmo no existe!");
      }   
    System.out.println("------------------------------");  
    System.out.println(msg);
    opcionesA=sc.nextInt();        
  }
}
public static void main(String[] args) {
  menuOpciones();
 }
} 
     