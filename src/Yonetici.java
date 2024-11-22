import java.util.ArrayList;
import java.util.Scanner;

public class Yonetici { static ArrayList<String> list = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);
    public static void addYonetici(){
        System.out.print("Lütfen eklemek istediğiniz yönetici asını giriniz:   ");
        list.add(scanner.nextLine());
        System.out.println("Task sucsesful");

    }
    public static void dellYonetici(){
        System.out.print("Lütfen silmek istediğiniz yönetici asını giriniz:   ");
        list.remove(scanner.nextLine());
        System.out.println("Task sucsesful");

    }
    public static void getYönetici(){
        for (int i=0;i<= list.size()-1;i++){
            System.out.println("yönetici-> "+list.get(i));


        }


    }


}
