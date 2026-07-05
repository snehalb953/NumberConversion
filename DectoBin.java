/*NUMBER CONVERSION*/

/*DECIMAL TO HEXADECIMAL
import java.util.Scanner;
class DectoHexa
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");
     int dec=sc.nextInt();
      String hx="";
      do{
           int r=dec%16;
           if(r<10)
            hx=r+hx;
           else if(r==10)
            hx='A'+hx;
           else if(r==11)
            hx='B'+hx;
          else if(r==12)
            hx='C'+hx;
          else if(r==13)
            hx='D'+hx;
          else if(r==14)
            hx='E'+hx;
         else if(r==15)
            hx='F'+hx;
          dec=dec/16;
        }while(dec!=0);
        System.out.println(hx);
   }
}






/* DECIMAL TO OCTAL
import java.util.Scanner;
class DectoOctal
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");
     int dec=sc.nextInt();
      String oct="";
      do{
           int r=dec%8;
           oct=r+oct;
           dec=dec/8;
        }while(dec!=0);
    System.out.println(oct);
   }
}
*/




/* DECIMAL TO BINARY
import java.util.Scanner;
class DectoBin
{
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter decimal number");
     int dec=sc.nextInt();
      String bin="";
      do{
           int r=dec%2;
           bin=r+bin;
           dec=dec/2;
        }while(dec!=0);
    System.out.println(bin);
   }
}
*/