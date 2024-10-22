import java.util.Scanner;
//input olarak girilen işlemin sonucunu ekrana yazdıran kod.örnek olarak 5 + 7 şeklinde yazılan işlemin sonucu için 12 verir.

public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İşlemi girin:");
        String str = scanner.nextLine(); //işlemi aldık.
        String[] words = str.split(" "); // sayı1,işlem,sayı2 diye ayırıp dizinin içine attık.
        String top = "+";
        String çık = "-";
        String çarp = "*";
        String böl = "/";
        // işlem operatörlerini yazdık.

        // sayıları string halden int hale getiriyoruz.
        int sayi1 = Integer.valueOf(words[0]);
        int sayi2 = Integer.valueOf(words[2]);
        

        //işlem operatörünü karşılaştırıp istenen işlemi yapıp sonucu yazdırıyoruz.
        if(words[1].equals(top)){
            System.out.println("Cevap: "+(sayi1 + sayi2));
        }else if(words[1].equals(çık)){
            System.out.println("Cevap: "+(sayi1 - sayi2));
        }else if(words[1].equals(çarp)){
            System.out.println("Cevap: "+(sayi1 * sayi2));
        }else{
            System.out.println("Cevap: "+(sayi1 / sayi2));
        }

    }
}
