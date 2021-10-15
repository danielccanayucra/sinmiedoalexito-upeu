import java.util.Scanner;

public class tareasupeu{
 static Scanner sc = new Scanner(System.in);

 static void botacionE(){
    //declaracion de variables de inicializacion
    int edad=0;
    //datos de entrada
        
        System.out.println("Ingrese su edad:");
        edad=sc.nextInt();
    //proceso
     if(edad>=18){
       System.out.println("usted si es apto para votar");
     }else{
        System.out.println("usted no es apto para votar");
     }
    }
 static void Sueldo_S(){
     //declaracion de variables
    double  sueldo, Htrabaj, pagoH;
    //datos de entrada
    System.out.print("Ingresar horas de trabajo: ");
    Htrabaj = sc.nextDouble();
    sc.nextLine();
    System.out.print("Ingresar pago por hora: ");
    pagoH = sc.nextDouble();
    sc.nextLine();
    //proceso
    sueldo=0;
    if(Htrabaj<=40)
        sueldo=Htrabaj*pagoH;
    if(Htrabaj>40)
        sueldo=((Htrabaj-40)*2*pagoH)+(pagoH*40);
    //datos de salida
    System.out.println(" el pago semanal es: " + sueldo);
   }

 static void horasdeEst(){
  int pago=0, horas=0;
  System.out.println("ingresar horas estacionadas:");
  horas=sc.nextInt();
   
    if(horas<=2){
     pago=horas*5;
   }else if(horas>2 && horas<=5){
     pago=(2*5)+((horas-2)*4);
   }else if(horas>5 && horas<=10){
     pago=(2*5)+(3*4)+((horas-5)*3);
   }else{
     pago=(2*5)+(3*4)+(5*3)+((horas-10)*2);
   }
   
   System.out.println("el pago sera de "+ pago+ " soles por estacionarse " + horas + " horas");
 }
 static void comRegalo(){
     int presupuesto;
        System.out.print("Ingresa el valor de presupuesto: ");
        presupuesto = sc.nextInt();
        sc.nextLine();
        if(presupuesto<=10)
            System.out.println("usted puede adquirir una Tarjeta");
        if(presupuesto>=11&&presupuesto<=100)
            System.out.println("usted puede adquirir unos Chocolates");
        if(presupuesto>=101&&presupuesto<=250)
            System.out.println("usted puede adquirir  Flores");
        if(presupuesto>=251)
            System.out.println("usted puede adquirir un Anillo");
    }

  
 static void persona_M(){
   String nom1, nom2, nom3, nomF="";
   int edadf, edad1, edad2, edad3;

   System.out.print(" ingrese el 1er nombre: ");
   nom1=sc.next().toUpperCase();
   System.out.println("ingresar su edad: ");
   edad1=sc.nextInt();
   System.out.print(" ingrese el 2do nombre: ");
   nom2=sc.next().toUpperCase();
   System.out.println("ingresar su edad: ");
   edad2=sc.nextInt();
   System.out.print(" ingrese el 3er nombre: ");
   nom3=sc.next().toUpperCase();
   System.out.println("ingresar su edad: ");
   edad3=sc.nextInt();
   edadf=0;
   if(edad1<edad2 && edad1<edad3){
      nomF=nom1;
      edadf=edad1;
   }
   if(edad2<edad1 && edad2<edad3){
      nomF=nom2;
      edadf=edad2;
   }
   if(edad3<edad1 && edad3<edad2){
      nomF=nom3;
      edadf=edad3;
   }
  System.out.println("la persona menor es: " +nomF+ " con "+ edadf +" años ");
  }
 
 static void viajedeE(){
        
    int costo_P = 0;
    int numero_A = 0;
    System.out.print("Ingresa el numero de alumnos: ");
    numero_A = sc.nextInt();
    sc.nextLine();
    costo_P=0;
    if(numero_A >100);
        costo_P=20;
    if(numero_A <50 && numero_A >100);
        costo_P =35;
    if(numero_A  <20 && numero_A >49);
        costo_P=40;
    if(numero_A >20);
        costo_P=70;

        System.out.println("el  costo del pasaje: " + costo_P);
    }

  static void descuento(){

    int i, n;
    double costo, descuento, pagoporT, precio;
        pagoporT = 0;
        System.out.print("Ingresa el valor de N: ");
        n = sc.nextInt();
        sc.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("COMPRA" + i);
            System.out.print("\n____________________________");
            System.out.print("\nIngrese el valor del precio : ");
            precio = sc.nextDouble();
            sc.nextLine();
            descuento=precio*0.1;
            if(precio>=200)
                descuento=precio*0.15;
            if(precio>100&&precio<200)
                descuento=precio*0.12;
            costo=precio-descuento;
            pagoporT=pagoporT+costo;
            System.out.println("Valor de costo: " + costo);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println();
        }
        System.out.println("Valor de pago por todo: " + pagoporT);
    }
   static void becadelpresidente(){
      double beca, edad, promedio;
        System.out.print("Ingresa el valor de edad: ");
        edad = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa el valor de promedio: ");
        promedio = sc.nextDouble();
        sc.nextLine();
        beca=0;

        if(edad>18&&promedio>=9)
            beca=2000;
        if(edad>18&&promedio>=7.5&&promedio<9)
            beca=1000;
        if(edad>18&&promedio>=6&&promedio<7.5)
            beca=500;
        if(edad<=18&&promedio>=9)
            beca=3000;
        if(edad<=18&&promedio>=8&&promedio<9)
            beca=2000;
        if(edad<=18&&promedio>=6&&promedio<8)
            beca=100;
        if(promedio<6)
            System.out.println("esfuerzate mas para la proxima");
            System.out.println("Valor de beca: " + beca);
    }
 static void bonoProf(){
     double bono, puntos, salario_M;
        System.out.print("Ingrese sus puntos: ");
        puntos = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese su salario minimo: ");
        salario_M = sc.nextDouble();
        sc.nextLine();
        bono=0;
        if(puntos<=100)
            bono=salario_M;
        if(puntos>100&&puntos<=150)
            bono=salario_M*2;
        if(puntos>150)
            bono=salario_M*3;
        System.out.println("usted es acreedor a un bono de: " + bono+ " por tener" +puntos+ " puntos");
 }
 static void fabricaP(){
      int modelo, talla;
        double N_pantalones, cargo_T, costo_Te, ganancia, ganancia_E;
        double mano_O, metro_T, metros_T, precio_F;
        System.out.print("Ingresa el valor de N pantalones: ");
        N_pantalones = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa el valor de metro de tela: ");
        metro_T = sc.nextDouble();
        sc.nextLine();
        System.out.println("Selecciona el valor de modelo.");
        System.out.println("\t1.- A");
        System.out.println("\t2.- B");
        System.out.print("\t: ");
        do {
            modelo = sc.nextInt();
            sc.nextLine();
            if (modelo<1||modelo>2)
                System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
        } while (modelo<1||modelo>2);
        System.out.println("Selecciona el valor de talla.");
        System.out.println("\t1.- 30");
        System.out.println("\t2.- 32");
        System.out.println("\t3.- 36");
        System.out.print("\t: ");
        do {
            talla = sc.nextInt();
            sc.nextLine();
            if (talla<1||talla>3)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (talla<1||talla>3);
        if(modelo==1)
            metros_T=1.5*N_pantalones;
        else
            metros_T=1.8*N_pantalones;
        costo_Te=metros_T*metro_T;
        if(modelo==1)
            mano_O=costo_Te*0.8;
        else
            mano_O=costo_Te*0.95;
        if(talla==2||talla==3)
            cargo_T=mano_O*0.04;
        else
            cargo_T=0;
        ganancia_E=(costo_Te+mano_O+cargo_T)*0.3;
        precio_F=costo_Te+mano_O+cargo_T+ganancia_E;
        ganancia=cargo_T+ganancia_E;
        System.out.println("Valor de cargo por talla: " + cargo_T);
        System.out.println("Valor de costo de la tela: " + costo_Te);
        System.out.println("Valor de ganancia: " + ganancia);
        System.out.println("Valor de ganancia extra: " + ganancia_E);
        System.out.println("Valor de mano de obra: " + mano_O);
        System.out.println("Valor de metros de tela: " + metros_T);
        System.out.println("Valor de precio final: " + precio_F);
        
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
        case 1: botacionE();break;
        case 2: Sueldo_S();break;
        case 3: horasdeEst();break;
        case 4: persona_M();break;
        case 5: viajedeE();break;
        case 6: descuento();break;
        case 7: becadelpresidente();break;
        case 8: comRegalo();break;
        case 9: bonoProf();break; 
        case 10: fabricaP();break;    
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
     