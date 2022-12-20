package HW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: "  );
        int a = sc.nextInt();
        System.out.print("Введите арифметический знак: "  );
        String arithmetic = sc.next();
        System.out.print("Введите второе число: "  );
        int b = sc.nextInt();
        //System.out.println(arithmetic);
        System.out.println(result(a,arithmetic,b));
    }
    public static int result(int a, String b, int c){
       int result = 0;
       if (b.equals("+")){
        result = a + c;
           System.out.println("do+");
        }
       else if (b.equals("-") ){
           result = a - c;
       }
       else if (b.equals("*")) {
           result = a * c;
           System.out.println("do");
       }
       else if (b.equals("/") && c != 0) {
           result = a / c;
       }
       else {
           System.out.println("на ноль делить нельзя!!!");
       }
        //System.out.println(result + "finish");
       return result;
    }
}
