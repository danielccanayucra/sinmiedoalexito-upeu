import java.util.Scanner;

public class diezejercicios{
 static Scanner sc = new Scanner(System.in);

 static void salario(){
   //declaracion de variables
   double salario=1500, salariofin=0, aumento;
   int i = 0, año=0;
   //proceso
   for(i = 1; i <= 6; i++){
     if(i<6){
        año=i;
        
        salariofin=salario*12;
       
       System.out.println("en " + año + " años tuvo un salario de "+ salariofin);
       System.out.println(" Y su salario mensual es "+ salario);

       aumento = salario*0.10+salario;
       salario = aumento;
       

     } else {
       salariofin=salario*12;
       System.out.println("en 6 años tuvo un salario de "+ salariofin);
       System.out.println(" Y   su salario mensual es "+ salario);
      
     }
    }
        
  }

 static void hamburguesa(){
   //declaracion de variables
   int Hsencilla=0, Hdoble=0, Htriple=0;
   double pagoTr=0, totalP=0, pago1=0,  pago2=0,  pago3=0, compra=0;
   //datos de entrada
   System.out.println("ingrese la cantidad de hamburguesas sencillas que quiere adquirir: ");
   Hsencilla =sc.nextInt();
   sc.nextLine();
   System.out.println("ingrese la cantidad de hamburguesas dobles que quiere adquirir: ");
   Hdoble =sc.nextInt();
   sc.nextLine();
   System.out.println("ingrese la cantidad de hamburguesas triples que quiere adquirir: ");
   Htriple =sc.nextInt();
   sc.nextLine();
   System.out.println("ingrese el metodo de pago: ");
    System.out.println("\t1.- pago por tarjeta");
    System.out.println("\t2.- pago al contado");
    System.out.print("\t: ");
    do {
        compra =sc.nextInt();
        sc.nextLine();
        if(compra<1||compra>2){
            System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
        }
    }while(compra<1||compra>2);     
   
    if(compra==1){
    pago1=Hsencilla*20;
    pago2=Hdoble*25;
    pago3=Htriple*28;
    totalP=pago1+pago2+pago3;
    pagoTr=totalP*0.05+totalP;
     System.out.println("el pago total es de :" +pagoTr);
    }
    if(compra==2){
    pago1=Hsencilla*20;
    pago2=Hdoble*25;
    pago3=Htriple*28;
    totalP=pago1+pago2+pago3;
  
   System.out.println("el pago total es de :" +totalP);
   } 
 }
 
 static void menuOpciones(){ 
    int opcionesA=0;
    String msg="\n que deseas realizar ";
    System.out.println(msg);
    String msg1= " selecione salario anual (1)";
    System.out.println(msg1);
    String msg2= " selecione adquirir hamburguesas (2)";
    System.out.println(msg2);
    String msg3= "seleccionar vacuna (3)";
    System.out.println(msg3);
    String msg4= " selecionar operacion (4)"; 
    System.out.println(msg4);
      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
          case 1: salario();break;
          case 2:hamburguesa();break;
          //case 3:TipVacuna();break;
          //case 4:OperBasicas();break;

          default:
          System.out.println("El Algoritmo no existe!");
        }
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  } 
    public static void main(String[] args) {
    menuOpciones();
  } 
}
 