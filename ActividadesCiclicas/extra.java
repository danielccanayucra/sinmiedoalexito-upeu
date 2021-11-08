import java.util.Scanner;

class extra{
  static Scanner sc = new Scanner(System.in);

  public static void main(String [] arg){
    int i;
    double inversion=1500, inversionT=0;

    for(i=1; i <= 60; i++){
      inversionT=inversion*0.15+inversion;
      System.out.println("la inversion en el año" +i+" es de: S/" + inversionT);
      inversion=inversionT;

    }

    System.out.println("inversion total obtuvido hasta la actualidad es de: S/" +inversionT);
  }

    
} 