/* HEXA DECIMAL TO DECIMAL */


import java.util.Scanner;
class HextoDec
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");
     String hex=sc.next();
     int dec=0,pw=1,d=0;
      for(int i=hex.length()-1;i>=0;i--)
         {
             char ch=hex.charAt(i);
            if(ch>='a' && ch<='f')
             d=ch-87;
            else if(ch>='A' && ch<='F')
             d=ch-55;
            else if(ch>  ='0' && ch<='9')
             d=ch-48;
            dec=dec+d*pw;
             pw=pw*16;
        }
     System.out.println(dec);
   }
}