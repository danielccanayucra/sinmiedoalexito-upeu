
import java.util.Scanner;

public class Becasestudiante {
 static Scanner sc = new Scanner(System.in);

  static void becaPresEst(){
     //Declaracion de variables e inicializacion
     int edad =0;
     double promedio=0, montoBeca=0;
     //Datos de entrada
     System.out.print("ingrese su edad :");
     edad=sc.nextInt();
     System.out.print("\nDia de llamada:");
     dia=sc.next().toUpperCase();
     System.out.print("\nturno de llamada:");
     turno=sc.next().toUpperCase();
     //Proceso
     if(edad>18){
       if(promedio>=9){
         montoBeca=2000;
       }else if(promedio>=7.5 && promedio<9){
         montoBeca=1000
       }else if(promedio>=6 && promedio<7.5){
         montoBeca=500
       }else 
         
     }

     //Datos de salida
     if(montoBeca==0){
       System.out.println("esforzarse para el proximo ciclo...
     }


  }
  static void suma20numerospares(){
  //declaracion de variable 
  int numInit=1, sumaNumPar=0;
  //proceso
    while (numInit <=20){
      if(numInit%2==0){
       sumaNumPar=sumaNumPar+numInit;
      }
      numInit++;//numInit=numInit+1;
    }
  //datos de salida
    System.out.println("la suma de numeros pares entre 1 al 20 en:"+sumaNumPar);

  }
  
  public static void main(String[] args) {
    
    suma20numerospares
  }

}