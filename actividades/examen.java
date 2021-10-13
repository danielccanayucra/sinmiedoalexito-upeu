import java.util.Scanner;
class examen{ 
static Scanner sc = new Scanner(System.in);

static void NotaProm(){ 

    double nota1=0, nota2=0, nota3=0;
    double promedio=0;

System.out.println("ingrese las notas del estudiante: ");

System.out.print("ingrese la nota 1: ");
nota1 = sc.nextDouble();
System.out.print("ingrese la nota 2: ");
nota2 = sc.nextDouble();
System.out.print("ingrese la nota 3: ");
nota3 = sc.nextDouble();

  promedio = (nota1 * 0.25 + nota2 * 0.25 + nota3 * 0.50);
    if(promedio >=11){
      System.out.println("el alumno aprovo: " + promedio); 
    }else {
      System.out.println("el alumno reprovo: " + promedio); 
    }
}
static void bonoProf(){
    double  bono, puntos, S_minimo;
    System.out.print("Ingresar puntos: ");
    puntos = sc.nextDouble();
    sc.nextLine();
    System.out.print("Ingresar salario minimo: ");
    S_minimo = sc.nextDouble(); 
    sc.nextLine();
    bono=0;
    if(puntos>=100&&puntos<=200)
        bono=S_minimo*0.10;
    if(puntos>=201&&puntos<=300)
        bono=S_minimo*0.40;
    if(puntos>=301&&puntos<=400)
        bono=S_minimo*0.70;
    if(puntos>=401)
        bono=S_minimo*0.80;
    System.out.println(" su bono es de: " + bono);
}
static void TipVacuna(){
    int edad, sexo;
    System.out.print("Ingresa su edad: ");
    edad = sc.nextInt();
    sc.nextLine();
    System.out.println("Selecciona el sexo.");
    System.out.println("\t1.- mujer");
    System.out.println("\t2.- hombre");
    System.out.print("\t: ");
    do {
        sexo = sc.nextInt();
        sc.nextLine();
        if (sexo<1||sexo>2)
            System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
    } while (sexo<1||sexo>2);
    if((sexo==2&&edad>=16&&edad<70)||edad<16)
        System.out.println("usted es apto para la vacuna A");
    if(sexo==1&&edad>=16&&edad<70)
        System.out.println("usted es apto para la vacuna B");
    if(edad>=70)
        System.out.println("usted es apto para la vacuna C");

        System.out.println("\t Ingrese codigo nuevamente");

        return;
 }
static void OperBasicas(){ 
  double resultado=0;
  System.out.println("ingrese el 1er numero");
  double num1=sc.nextInt();
  System.out.println("ingrese el 2do numero");
  double num2=sc.nextInt();
  System.out.println("seleccione la operacion");
  int operacion=sc.nextInt();
  switch(operacion){
     case 1: resultado=num1+num2;
     System.out.println("la suma es:"+resultado);
     break;
     case 2: resultado=num1-num2;
     System.out.println("la resta es:"+resultado);
     break;
     case 3: resultado=num1*num2;
     System.out.println("la multiplicacion es:"+resultado);
     break;
     case 4: resultado=num1/num2;
     System.out.println("la division es:"+resultado);
     break;
    
     default:
      System.out.println("LA OPERACION NO EXISTE");
      break;

   }


}


static void menuOpciones(){ 
    int opcionesA=0;
    String msg="\n que deseas realizar ";
    System.out.println(msg);
    String msg1= " seleccione promedio (1)";
    System.out.println(msg1);
    String msg2= " seleccione bono (2)";
    System.out.println(msg2);
    String msg3= "seleccionar vacuna (3)";
    System.out.println(msg3);
    String msg4= " selecionar operacion 1=+,2=-,3=*,4=/ (4)"; 
    System.out.println(msg4);
      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
          case 1:NotaProm();break;
          case 2:bonoProf();break;
          case 3:TipVacuna();break;
          case 4:OperBasicas();break;

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



 
 