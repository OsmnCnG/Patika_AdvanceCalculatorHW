
import java.util.Scanner;

import static java.lang.Math.pow;


public class Main {



    static int toplama(int a,int b){
        int result = a+b;
        return result;
    }

    static int cikarma(int a,int b){
        int result = a-b;
        return result;
    }

    static int carpma(int a,int b){
        int result = a*b;
        return result;
    }

    static int bolme(int a,int b){
        if (b==0)
            throw new RuntimeException("HATA!");
        return a/b;
    }

    static double us(int a,int b){
        return pow(a,b);
    }
    static int faktoriyel(int x){
        if (x==0)
            return 1;
        else if (x==1)
            return 1;
        else
        return x* faktoriyel(x-1);
    }
    /*f(1)=1
       f(2)=2*1
       f(3)=3*2*1 =f(2)*3
     */

    static int mod(int g){
        return g%=10;
    }

    static void rectangularCalc(int t,int y){
        int alan=t*y;
        int cevre=(t+y)*2;
        System.out.println("Cevap:"+"\nalan:"+alan +"\nçevre:"+ cevre);
    }

    public static void main(String[] args) {
        String Menu= "1.Toplama İşlemi\n"
                +"2.Çıkarma İşlemi\n"
                +"3.Çarpma İşlemi\n"
                +"4.Bölme İşlemi\n"
                +"5.Üslü Sayı Hesaplama\n"
                +"6.Faktoriyel Hesaplama\n"
                +"7.Mod Alma\n"
                +"8.Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0.Çıkış yap.\n";

        Scanner keyboard= new Scanner(System.in);
        System.out.println(Menu);
        int select;

        do {
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            select = keyboard.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Toplama yapmak istediğiniz değerleri giriniz:");
                    int deger1= keyboard.nextInt();
                    int deger2= keyboard.nextInt();
                    System.out.println("Cevap:"+toplama(deger1,deger2));
                    break;
                case 2:
                    System.out.println("Çıkarma yapmak istediğiniz değerleri giriniz:");
                    int var1= keyboard.nextInt();
                    int var2= keyboard.nextInt();
                    System.out.println("Cevap:"+cikarma(var1,var2));
                    break;
                case 3:
                    System.out.println("Çarpımını yapmak istediğiniz değerleri giriniz:");
                    int var3= keyboard.nextInt();
                    int var4= keyboard.nextInt();
                    System.out.println("Cevap:"+carpma(var3,var4));
                    break;
                case 4:
                    System.out.println("Bölümünü yapmak istediğiniz değerleri giriniz:");
                    int var5= keyboard.nextInt();
                    int var6= keyboard.nextInt();

                    try{
                        System.out.println("Cevap:"+bolme(var5,var6));
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Üssünü almak istediğiniz değerleri sırası ile giriniz: ex:a^b");
                    int var7= keyboard.nextInt();
                    int var8= keyboard.nextInt();
                    System.out.println("Cevap:"+us(var7,var8));
                    break;
                case 6:
                    System.out.println("Faktoriyelini almak istediğiniz değeri giriniz:");
                    int var9= keyboard.nextInt();
                    if (var9<0)
                        System.out.println("Negatif sayıların faktöriyeli alınamaz!");
                    else
                    System.out.println("Cevap:"+var9+"!="+faktoriyel(var9));
                    break;
                case 7:
                    System.out.println("Modunu almak istediğiniz değeri giriniz:");
                    int var10= keyboard.nextInt();
                    System.out.println("Cevap:"+mod(var10));
                    break;
                case 8:
                    System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz:");
                    int var11= keyboard.nextInt();
                    System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz:");
                    int var12= keyboard.nextInt();
                    rectangularCalc(var11,var12);
                    break;
                case 0:
                    break;

                default:
                    System.out.println("HATALI TUŞLAMA YAPTINIZ!");


            }
        }while(select!=0);



    }



}