import java.util.Scanner;

public class funcionExpo{
   public static void main(String [] arg){
   Scanner sc = new Scanner(System.in);
   //datos de entrada
   System.out.print("ingrese la cantidad de terminos de precision que desea: ");
   int n = sc.nextInt();
   //proceso
   System.out.println("e = " + e(n));
  }
  public static double e(int n){
    double s=0, t;

    for(int i = 0; i < n; i++){
      t = 1 / factorial(i);
      s = s+t;
    }
    return s;
  } 
  public static double factorial(int n){
    double aux = 1;
    for(int i = 2; i <= n; i++ ){
      aux = aux*i;
    }
    return aux;
  }
}