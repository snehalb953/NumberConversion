/*BINARY TO DECIMAL */

import java.util.Scanner;
class BintoDec
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");

     int bin=sc.nextInt();
     int dec=0,pw=1;
       do{
            int b=bin%10;
            dec=dec+b*pw;
            pw=pw*2;
            bin=bin/10;
         }while(bin!=0);
System.out.println(dec);
   }
}