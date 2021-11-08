import java.util.Scanner;

public class funcionExpo{
   public static void main(String [] arg){
   Scanner sc = new Scanner(System.in);
   //datos de entrada
   int i, n;
   double resultado=0;
   double anguloEnGrados=0;
   double anguloEnRadianes=0; 
   System.out.println("ingrese la cantidad de angulos:");
   n=sc.nextInt();  
   for(i = 0; i < n; i++){
     System.out.println("ingrese los angulos:");
     anguloEnGrados=sc.nextInt();
     anguloEnRadianes=Math.toRadians(anguloEnGrados);
     resultado=Math.sin(anguloEnRadianes);
     anguloEnGrados=Math.toDegrees(anguloEnRadianes);
     System.out.println("Seno de " + anguloEnGrados + "° = " +resultado+ " rad");
     
   }
   }
}