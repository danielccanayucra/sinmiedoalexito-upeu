import java.util.Scanner;

public class ResoluciondeEjercicios{
 static Scanner sc = new Scanner(System.in);

 static void compañiaA(){

   int Vcategoria1, Vcategoria2, Vcategoria3;
  double precio1, precio2, precio3, pagoxA=0, pagoxA1=0, pagoxA2=0; 
  double pagoxC1=0, pagoxC2=0, pagoxC3=0, pagoT=0;

  System.out.println("ingrese la cantidad de vehiculos de categoria 1");
  Vcategoria1 = sc.nextInt();
  System.out.println("ingrese el precio");
  precio1 = sc.nextDouble();
  System.out.println("ingrese la cantidad de vehiculos de categoria 2");
  Vcategoria2=sc.nextInt();
  System.out.println("ingrese el precio");
  precio2=sc.nextDouble(); 
  System.out.println("ingrese la cantidad de vehiculos de categoria 3");
  Vcategoria3=sc.nextInt();
   System.out.println("ingrese el precio");
  precio3=sc.nextDouble();

  if( Vcategoria1 > 0){
    pagoxA=precio1*0.12;
  }
  if(Vcategoria2 > 0){
    pagoxA1=precio2*0.08;
  }
  if(Vcategoria3 > 0){
    pagoxA2=precio3*0.05;
  }
  
  pagoxC1=pagoxA*Vcategoria1;
  pagoxC2=pagoxA1*Vcategoria2;
  pagoxC3=pagoxA2*Vcategoria3;
  pagoT=pagoxC1+pagoxC2+pagoxC3;
System.out.println("el pago por un vehivulo de la categoria 1 seria de: S/" + pagoxA);
System.out.println("el pago por un vehivulo de la categoria 2 seria de: S/" + pagoxA1);
System.out.println("el pago por un vehivulo de la categoria 3 seria de: S/" + pagoxA2);
System.out.println("el pago por todo los vehivulos en la categoria 1 seria de: S/" + pagoxC1);
System.out.println("el pago por todo los vehivulos en la categoria 2 seria de: S/" + pagoxC2);
System.out.println("el pago por todo los vehivulos en la categoria 3 seria de: S/" + pagoxC3);
System.out.println("el pago total de las 3 categorias es de: S/" + pagoT);

 }

 static void tabladeM(){
 int i=1, n=0, resultado=0;
 for(n=1; n<=20;n++){
  for(i=1; i<=12; i++){
   resultado=n*i;
   System.out.println(+n+" x "+i+" = "+resultado);
   
   }
   System.out.println("--------------------");
    
  }

 }


 static void menuOpciones(){ 
  int opcionesA=0;
  System.out.println("-------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar:";
  System.out.println(msg);
  String msg1="ejercicio1:";
  System.out.println(msg1);
  String msg2="ejercicio2:";
  System.out.println(msg2);
  //String msg3="ejercicio3:";
  //System.out.println(msg3);
  //String msg4="ejercicio4:";
  //System.out.println(msg4);
  //String msg5="ejercicio5:";
  //System.out.println(msg5);
  
  opcionesA=sc.nextInt();  
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: compañiaA();break;
        case 2: tabladeM();break;
        //case 3: problemaconcero();break;
        //case 4: ahorrodinero();break;
        //case 5: ciclosejercicio1();break;
             
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