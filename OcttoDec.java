/* OCTAL TO DECIMAL */

import java.util.Scanner;
class OcttoDec
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");
     int oct=sc.nextInt();
     int dec=0,pw=1;
       do{
            int b=oct%10;
            dec=dec+b*pw;
            pw=pw*8;
            oct=oct/10;
         }while(oct!=0);
      System.out.println(dec);
   }
}