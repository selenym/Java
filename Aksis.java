import java.util.Scanner;
//Not Takip Sistemi için OOP kullanarak yazdığım ufak bir deneme kodudur.

class Student {
    public String full_name;
    public int id_no;
    public int year;

    public Student(String full_name,int id_no, int year) {
        this.full_name = full_name;
        this.id_no = id_no;
        this.year = year;
    }

    public String getfullname() {
        return full_name;
    }

    public int getidno() {
        return id_no;
    }

    public int getyear() {
        return year;
    }

   
}

class Course {
    public String class_name;
    public String teacher_name;
    private int vize; //0,4
    private int finnal; //0,6
    private int ort;
    private String harfnotu;

    public Course(String class_name, String teacher_name, int vize, int finnal){
        this.class_name = class_name;
        this.teacher_name = teacher_name;
        this.vize = vize;
        this.finnal = finnal;
    }

    public String getclassname() {
        return class_name;
    }

    public String getteachername() {
        return teacher_name;
    }

    public int getvize() {
        return vize;
    }

    public int getfinal() {
        return finnal;
    }

    public int getort() {
        ort = (int) (vize*0.4 + finnal*0.6);
        return ort;
    }

    public String getharfnotu() {
       if(ort >= 85){
        harfnotu = "AA";
       }
       if(ort < 85 && ort >=70){
        harfnotu = "BA";
       }
       if(ort <70 && ort >=60){
        harfnotu = "BB";
       }
       if(ort <60 && ort>=50){
        harfnotu = "CC";
       }
       if(ort <50){
        harfnotu = "FF";
       }
        return harfnotu;
    }

    public String sonuc(){
        if(harfnotu.equals("FF")){
            return "kaldi!";
        }else{
            return "gecti!";
        }
    }


}

public class Aksis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aksise Hosgeldiniz! Lutfen giris yapiniz:(handan 1234, selen 2468, yagiz 9876)\n");
        System.out.println("Kullanici adi:");
        String username = scanner.nextLine();
        System.out.println("Sifre:");
        int password = scanner.nextInt();
        String control = "back";
          
        Student student1 = new Student("Selen Günel", 414230025, 2);
        Student student2 = new Student("Yagiz Ozturk", 414230012, 2);


        Course math1 = new Course("Math 1", "Handan YILDIRIM ", 50, 46);
        Course fizik1 = new Course("Physics 1", "Caglar CETİNKAYA", 95, 100);
        Course ing1 = new Course("English", "Murat GEZER", 40, 100);

        Course math2 = new Course("Math 1", "Handan YILDIRIM ", 45, 78);
        Course fizik2 = new Course("Physics 1", "Caglar CETİNKAYA", 98, 39);
        Course ing2 = new Course("English", "Murat GEZER", 47, 64);

        while(control == "back"){
            if(username.equals("selen") && password==2468){
                System.out.println(student1.getidno() + " numarali "+ student1.getyear() +". sinif ogrencisi " + student1.getfullname() + "'in Notlari:");
                System.out.println(math1.getclassname() + " | " + math1.getteachername() + " " + math1.getvize() + "/" + math1.getfinal() + " " + math1.getort() + " " + math1.getharfnotu()+ " " + math1.sonuc());
                System.out.println(fizik1.getclassname() + " | " + fizik1.getteachername() + " " + fizik1.getvize() + "/" + fizik1.getfinal() + " " + fizik1.getort() + " " + fizik1.getharfnotu()+ " " + fizik1.sonuc());
                System.out.println(ing1.getclassname() + " | " + ing1.getteachername() + " " + ing1.getvize() + "/" + ing1.getfinal() + " " + ing1.getort() + " " + ing1.getharfnotu()+ " " + ing1.sonuc());
                control = "exit";
                
            }
            else if(username.equals("yagiz") && password==9876){
                System.out.println(student2.getidno() + " numarali "+ student2.getyear() +". sinif ogrencisi " + student2.getfullname() + "'in Notlari:");
                System.out.println(math2.getclassname() + " | " + math2.getteachername() + " " + math2.getvize() + "/" + math2.getfinal() + " " + math2.getort() + " " + math2.getharfnotu()+ " " + math2.sonuc());
                System.out.println(fizik2.getclassname() + " | " + fizik2.getteachername() + " " + fizik2.getvize() + "/" + fizik2.getfinal() + " " + fizik2.getort() + " " + fizik2.getharfnotu()+ " " + fizik2.sonuc());
                System.out.println(ing2.getclassname() + " | " + ing2.getteachername() + " " + ing2.getvize() + "/" + ing2.getfinal() + " " + ing2.getort() + " " + ing2.getharfnotu()+ " " + ing2.sonuc());
                control = "exit";

            }
            else if(username.equals("handan") && password==1234){
                System.out.println(student1.getidno() + " numarali "+ student1.getyear() +". sinif ogrencisi " + student1.getfullname() + "'in Notlari:");
                System.out.println(math1.getclassname() + " | " + math1.getteachername() + " " + math1.getvize() + "/" + math1.getfinal() + " " + math1.getort() + " " + math1.getharfnotu()+ " " + math1.sonuc());
                System.out.println(fizik1.getclassname() + " | " + fizik1.getteachername() + " " + fizik1.getvize() + "/" + fizik1.getfinal() + " " + fizik1.getort() + " " + fizik1.getharfnotu()+ " " + fizik1.sonuc());
                System.out.println(ing1.getclassname() + " | " + ing1.getteachername() + " " + ing1.getvize() + "/" + ing1.getfinal() + " " + ing1.getort() + " " + ing1.getharfnotu()+ " " + ing1.sonuc());
                
                System.out.println("---------------------------------------------------------------");
                
                System.out.println(student2.getidno() + " numarali "+ student2.getyear() +". sinif ogrencisi " + student2.getfullname() + "'in Notlari:");
                System.out.println(math2.getclassname() + " | " + math2.getteachername() + " " + math2.getvize() + "/" + math2.getfinal() + " " + math2.getort() + " " + math2.getharfnotu()+ " " + math2.sonuc());
                System.out.println(fizik2.getclassname() + " | " + fizik2.getteachername() + " " + fizik2.getvize() + "/" + fizik2.getfinal() + " " + fizik2.getort() + " " + fizik2.getharfnotu()+ " " + fizik2.sonuc());
                System.out.println(ing2.getclassname() + " | " + ing2.getteachername() + " " + ing2.getvize() + "/" + ing2.getfinal() + " " + ing2.getort() + " " + ing2.getharfnotu()+ " " + ing2.sonuc());
                control = "exit";

            }
            }
            
        }
        
    }

}
