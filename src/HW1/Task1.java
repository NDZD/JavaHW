package HW1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: "  );
        int num = Integer.parseInt(sc.nextLine());
        rect(num);
    }
    public static String rect(int recNum){
        String str = "1";
        for (int i = 2; i <= recNum ; ++i) {
            String string = Integer.toString(i);
            str = str + " + " + string;
            System.out.println(str);
        }
        return str;

    }


}
