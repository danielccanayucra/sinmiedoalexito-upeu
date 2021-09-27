
import java.util.Scanner;

public class pagoservtelef{
  static Scanner sc = new Scanner(System.in);

  static void practica(){
    System.out.println("ingrese su nombre:");
    String nombre=sc.next();
    System.out.println("ingrese su edad:");
    int edad=sc.nextInt();
 System.out.println("nombre ingresado es:"+nombre+" y la edad es:"+edad);
 }

 static void pagoserviciotelef(){
   //Definir variables
   String dia="", turno="";
   int minL=0;
   double pagoL=0, pImpuesto=0, totalPago=0;
   //Datos de entrada
   System.out.print("ingrese Min de llamada:");
   minL=sc.nextInt();
   System.out.print("\nDia de llamada:");
   dia=sc.next().toUpperCase();
   System.out.print("\nturno de llamada:");
   turno=sc.next().toUpperCase();
   //Proceso
   if(minL<=5){
     pagoL=minL*1;
   }else if(minL>5 && minL<=8){
     pagoL=(5*1)+((minL-5)*0.8);
   }else if(minL>8 && minL<=10){
     pagoL=(5*1)+(3*0.8)+((minL-8)*0.7);
   }else{
     pagoL=(5*1)+(3*0.8)+(2*0.7)+((minL-10)*0.5);
   }
   if(dia.equals("D")|| dia.equals("S")){ //dias no habiles
       if(dia.equals("D")){
         pImpuesto=pagoL*0.03;
       } 
   }else{//dias habiles
     if(turno.equals("M")){
       pImpuesto=pagoL*0.15;
     }else{
       pImpuesto=pagoL*0.10;
     }
   }
   totalPago=pagoL+pImpuesto;
   //Datos de salida
   System.out.println("pago por llamada:"+pagoL);
   System.out.println("Impuesto:"+pImpuesto);
   System.out.println("totalpago:"+totalPago);
 }


  public static void main(String[] args) {
  practica();
  pagoserviciotelef();
  }
} 