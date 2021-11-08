import java.util.Scanner;

class extra{
  static Scanner sc = new Scanner(System.in);

  public static void main(String [] arg){
  int n, bill10, bill20, bill50, mon10, mon5, mon1, total, totalM, totalB;
  totalM=0;
  totalB=0;
  System.out.println("ingrese cantidad de monedas de 10 pesos:");
  mon10=sc.nextInt();
   System.out.println("ingrese cantidad de monedas de 5 pesos:");
  mon5=sc.nextInt();
   System.out.println("ingrese cantidad de monedas de 1 pesos:");
  mon1=sc.nextInt();
   System.out.println("ingrese cantidad de billetes de 10 pesos:");
  bill10=sc.nextInt();
   System.out.println("ingrese cantidad de billetes de 20 pesos:");
  bill20=sc.nextInt();
   System.out.println("ingrese cantidad de billetes de 50 pesos:");
  bill50=sc.nextInt();
  System.out.println("\t1.- total de dinero en monedas");
  System.out.println("\t2.- total de dinero en billetes");
  System.out.println("\t:");
  total=sc.nextInt();
  sc.nextLine();
  do{
    if(total<1||total>2){
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
    }
  }while(total<1||total>2);
  if(total==1){
    totalM=(mon10*10)+(mon5*5)+(mon1*1);
    System.out.println("el dinero total en monedas es de: S/"+totalM);
  }
  if(total==2){
    totalB=(bill10*10)+(bill20*20)+(bill50*50);
    System.out.println("el dinero total en billetes es de: S/"+totalB);
  }
  }
  }