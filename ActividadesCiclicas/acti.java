import java.util.Scanner;

class Ejercicio_dieciséis{
  static Scanner sc = new Scanner(System.in);

  public static void main(String [] arg){

    int total, n;
    System.out.println("Ingrese el total de numeros: ");
    total = sc.nextInt();

    while (total > 0)
    {
      System.out.println("Ingrese un numero: ");
      n = sc.nextInt();
      if (n > 0)
      {
        System.out.println("El numero " + n + " elevado al cubo es: " + (n*n*n));
      }
      total--;
    }    
  }
}