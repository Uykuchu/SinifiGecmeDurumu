import java.util.Scanner;

public class Main {
    public static int calcNote(int note, Scanner sc){
        int rNote = sc.nextInt();
        if(rNote>=0 && rNote<=100){note = rNote;}
        else {System.out.println("Geçersiz Not Girdiniz.");return 0;}
        return note;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int note=0;
        String[] lessons = {
                "Matematik",
                "Tarih",
                "Fizik",
                "Coğrafya",
                "Türkçe",
                "Uyuma",
                "Kimya"} ;
        for(String lesson:lessons) {
            System.out.print(lesson + " Notunuz: ");
            note+=calcNote(note, scanner);
        }
        note /= lessons.length;
        System.out.println("Ortalama Notunuz: " + note);
        if (note>=55){System.out.println("Geçtiniz!");}
    }

}