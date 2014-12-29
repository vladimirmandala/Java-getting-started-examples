package General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Factorial {
 public static void main(String[] args) throws NumberFormatException, IOException  {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter  the Number");
   int no=Integer.parseInt(br.readLine());
   int fact=1;
   for(int i=1;i<=no;i++){
  fact=fact*i;
  }
  System.out.println("Factorial is: "+ fact);
  }
 }