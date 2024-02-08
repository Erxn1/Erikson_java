import java.util.Scanner;
public class  Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Строку a");
        String a = scanner.nextLine();
        System.out.print("Введите Строку b");
        String b = scanner.nextLine();;

        if (a.equals(b)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }


    }

}
