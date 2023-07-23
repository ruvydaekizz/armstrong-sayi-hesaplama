import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        //ARMSTRONG SAYILARI BULMA

        Scanner scan = new Scanner(System.in);    //kullanıcıdan değer alma
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        //girilen sayının basamak sayısını bulma
        int basNumber = 0;
        int tempNumber = number;   //tempNumber sayısında girilen değeri tutuyoruz ki ilk ile son sayı karşılaştırılması için geçici değişkende tutarız--kullanıcıdan alınan number değerini kaybetmemiş oluyoruz
        int basValue;
        int result1 = 0;
        int basPow;     //bas üssünü alan sayılar


        while (tempNumber != 0) {  //sayı 0'a eşit olmayana kadar döngü devam edecek
            tempNumber /= 10;      //basamak numarasını bulma
            basNumber++;
        }

        System.out.println("Basamak numarası: " + basNumber);
        //girilen her sayının basamaklarının değerinin ne olduğunu verecek

        tempNumber = number;       //girilen sayının ilk değerine tekrar eşitledik tekrar ilk başta girilen değere ulaşmak için
        while (tempNumber != 0) {

            basValue = tempNumber % 10; //girilen sayının basamaklarını tek tek ekrana yazdırır
            System.out.println(basValue);
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {

                basPow *= basValue;    //basValue üzeri basNumber'ı buluyoruz burada
            }
            result1 += basPow;  //sonucun 0 olduğu yerde toplamı buluyor
            tempNumber /= 10;
        }


        if (result1 == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


        //her bir basamaktaki sayıyı toplam basamak sayısı ile üssünü alacağız

    }
}
