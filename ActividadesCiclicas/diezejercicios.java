import java.util.Scanner;

public class diezejercicios{
 static Scanner sc = new Scanner(System.in);

 static void salario(){
   //declaracion de variables
   double salario=1500, salariofin=0, aumento, salarioT=0, salarioA=0;
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
       salarioA = salarioT+salariofin;
       salarioT=salarioA;
        System.out.println(" el salario total asta el momento es de: "+salarioT);
       

     } else {
       salariofin=salario*12;
       System.out.println("en 6 años tuvo un salario de "+ salariofin);
       System.out.println(" Y   su salario mensual es "+ salario);
       salarioA = salarioT+salariofin;
       salarioT=salarioA;
      
     }
    }
    System.out.println("el  total que gano durante los 6 años es de: "+salarioT);
        
  }

 static void hamburguesa(){
   //declaracion de variables
   int Hsencilla=0, Hdoble=0, Htriple=0;
   double pagoTr=0, totalP=0, pago1=0,  pago2=0,  pago3=0, compra=0;
   //datos de entrada
   System.out.println("ingrese la cantidad de hamburguesas sencillas que quiere adquirir: ");
   System.out.println("tiene un precio de s/20 ");
   Hsencilla =sc.nextInt();
   sc.nextLine();
   System.out.println("ingrese la cantidad de hamburguesas dobles que quiere adquirir: ");
   System.out.println("tiene un precio de s/25 ");
   Hdoble =sc.nextInt();
   sc.nextLine();
   System.out.println("ingrese la cantidad de hamburguesas triples que quiere adquirir: ");
   System.out.println("tiene un precio de s/28 ");
   Htriple =sc.nextInt();
   sc.nextLine();
   System.out.println("ingrese el metodo de pago: ");
    System.out.println("\t1.- pago por tarjeta");
    System.out.println("\t2.- pago al contado");
    System.out.print("\t: ");
    compra =sc.nextInt();
    sc.nextLine();
    do {

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
 static void problemaconcero(){
   int i, numero, cantidadN, igualA=0, mayorA=0, menorA=0;

   System.out.println("ingrese la cantidad de numeros a comparar:");
   cantidadN=sc.nextInt();

   for(i = 1; i <= cantidadN; i++){
     
     System.out.println("ingrese el numero de su preferencia: ");
     numero=sc.nextInt();

     if(numero == 0){
       igualA++;
     }
     if(numero < 0){
       menorA++;
     }
     if(numero > 0){
       mayorA++;
     } 
   }
    System.out.println("la cantidad de numeros que son iguales a 0 son:"+igualA);
    System.out.println("la cantidad de numeros que son mayores a 0 son:"+mayorA);
    System.out.println("la cantidad de numeros que son menores a 0 son:"+menorA);
 }
 static void ahorrodinero(){
   //declaracion de variables
   long dinero, i=1;
   double suma = 0; 
   dinero = 3;
   //proceso
   for(i=0; i<= 365; i++){
     suma=suma + Math.pow(dinero, i);
     System.out.println("El ahorro en el dia " + i + " es:" + Math.pow(dinero, i)+" pesos");
   }
   System.out.println("La cantidad total que va a ahorrar en todo el año es: " + suma+ " pesos");
 } 
 
 static void ciclosejercicio1(){
   //declaracion de variables
   double salario=1500, salariofin=0, aumento;
   int i = 1, año=0;
   //proceso
   System.out.println("serie con while:");
   System.out.println("-------------------------------");
   while( i <= 6){
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
     i++;
    }
    
    System.out.println("");
    //declaracion de variables
      salario=1500;
      salariofin=0;
      aumento=0;
      i = 1; 
      año=0;
   //proceso
     System.out.println("serie con do-while:");
     System.out.println("-------------------------------");
     do{
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
     i++;
      
    }while(i <= 6);
 }
  
 static void compraarticulos(){
 int i, N_articulos;
 double precio, descuento=0, total=0, total1=0;

 System.out.println("ingrese la cantidad de articulos que desea comprar:");
 N_articulos=sc.nextInt();

 for(i=1; i<=N_articulos; i++){
   System.out.println("ingrese el precio del articulo " +i+ " a adquirir:");
   precio=sc.nextInt();

   if(precio >= 200){
     descuento=precio*0.15;
   }
   if(precio > 100 && precio < 200){
     descuento=precio*0.12;
   }
   if(precio <= 100){
     descuento=precio*0.10;
   }
   total1=precio-descuento;
   System.out.println("el descuento aplicado es: S/"+descuento);
   System.out.println("el precio del articulo con el descuento aplicado es: S/" +total1);
   
   total=total+ total1;
  
 }
 System.out.println("el total que pagara usted es: S/"+total);
 }
static void deposito(){
   //declaracion de variables
   double depositoT=0, ahorro, interesA=0, interesF=0, invercionF=0;
   int año, i, x;
   System.out.println("ingrese los años de ahorro:");
   año = sc.nextInt();
   //proceso
   for(x=1; x<=año; x++){
     for(i=1; i<=12; i++){

     System.out.println("ingrese el ahorro del mes " +i + ":");
     ahorro=sc.nextInt();
     depositoT=depositoT+ahorro;
     
   }
    interesA =depositoT * 0.10;
    invercionF=depositoT + interesA;
  
  System.out.println("durante el  año "+x+ " genero un interes de: S/" + interesA);
  System.out.println("la invercion del año es de: S/"+ invercionF);
  depositoT=invercionF;
  }
 }
 static void promediodeE(){
   int n, i, salones, edad, alumnos;
   double total, suma;
   
   salones=0;
   total=0;
   alumnos=0;

   System.out.println("ingrese el numero de salones de la escuela:");
   salones=sc.nextInt();
   
   while(salones > 0){
     System.out.println("ingrese el numero de alumnos:");
     n=sc.nextInt();
     suma=0;
     for(i=1; i<=n; i++){
       System.out.println("ingrese la edad del alumno "+i+" :");
       edad=sc.nextInt();
    
       suma = suma+edad;

     }
     System.out.println("el promedio del salon " + salones+ " es: "+(suma / n)+" años.");
     alumnos=alumnos+n;
     total=total+suma;
     salones--;

   }
   System.out.println("el promedio en toda la escuela es: " +(total / alumnos) +" años");

 } 
 static void exponencial(){
   int total, n, expo=0;
   
   System.out.println("ingresa el total de numeros:");
   total=sc.nextInt();

   while(total > 0){
     System.out.println("ingrese un numero:");
     n=sc.nextInt();
     if(n > 0){
       expo=n*n*n;
       System.out.println("el numero "+ n +" elevado al cubo es:" + expo);
     }
     total--;
   }
 }
 static void tablademultiplicar(){
   int i, n, x, resultado=0;
   System.out.println("ingrese un numero a multiplicar:");
   n=sc.nextInt();
   System.out.println("ingrese el numero asta donde quiere miltiplicar:");
   x=sc.nextInt();

   while(x > 0){
   for(i=1; i<=x; i++){
     resultado=n*i;
     System.out.println(+n+" x "+i+" = "+resultado);
   }
   x--;
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
  String msg3="ejercicio3:";
  System.out.println(msg3);
  String msg4="ejercicio4:";
  System.out.println(msg4);
  String msg5="ejercicio5:";
  System.out.println(msg5);
  String msg6="ejercicio6:";
  System.out.println(msg6);
  String msg7="ejercicio7:";
  System.out.println(msg7);
  String msg8="ejercicio8:";
  System.out.println(msg8);
  String msg9="ejercicio9:";
  System.out.println(msg9);
  String msg10="ejercicio10:";
  System.out.println(msg10);
  opcionesA=sc.nextInt();  
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: salario();break;
        case 2: hamburguesa();break;
        case 3: problemaconcero();break;
        case 4: ahorrodinero();break;
        case 5: ciclosejercicio1();break;
        case 6: compraarticulos();break;
        case 7: deposito();break;
        case 8: promediodeE();break;
        case 9: exponencial();break; 
        case 10: tablademultiplicar();break;     
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
 