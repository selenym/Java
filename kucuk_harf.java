import java.util.Scanner;
//Klavyeden girilen harfi fonksiyon kullanmadan büyükse küçük harfe, küçükse büyük harfe çeviren kod.

public class kucuk_harf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] upper= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] lower= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int a;

        do{
            System.out.print("Harf giriniz: ");
            String letter = scanner.next(); //input harfimizi aldık.
            
            for(int i=0;i<26;i++){
                boolean bool1 = letter.equals(upper[i]);
                boolean bool2 = letter.equals(lower[i]);
                //karşılaştırmalarımızı yazpıyoruz.
    
                if(bool1){
                    System.out.println(lower[i]);
                    break;
                }
                if(bool2){
                    System.out.println(upper[i]);
                    break;
                }
            }
            
            System.out.print("Devam etmek için 1e, çikmak için 2ye basin: ");
            a = scanner.nextByte();
        } while (a==1);
        }
    }