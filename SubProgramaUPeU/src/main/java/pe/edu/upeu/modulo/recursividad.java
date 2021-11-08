package pe.edu.upeu.modulo;
import java.math.BigInteger;

public class recursividad{


  public long factorial(int numero){
    if(numero>1){
      return factorial(numero-1)*numero;
    }
    return 1;
  } 
    public BigInteger factorial(long  numero){
    if(numero>1){
      return factorial(numero-1).multiply(new BigInteger(String.valueOf(numero)));
    
    }
    return new BigInteger(String.valueOf(1));
  } 

 public int fibonacci(int n){
   if(n>=2){
     return fibonacci(n-1)+fibonacci(n-2);
   }else{
     return n;
   }
 }

 public BigInteger fibonacciNrecurBig(int numero){
   BigInteger valAnt=new BigInteger("0"), valNew=new BigInteger("1"),numAux=new BigInteger("0");

   if(numero>1){
     for(int con=1;con<numero;con++){
       numAux=valNew;
       valNew=valAnt.add(valNew);
       valAnt=numAux;
     }
     return valNew;
   }
   return new BigInteger(String.valueOf(1));
 }
} 