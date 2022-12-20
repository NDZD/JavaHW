package HW1;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1000;
        primeNumber(a, b);
    }
    public static void primeNumber(int a, int b){
        for (int i = a; i <= b; i++){
            int count = 0;
            for (int j = a; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }

        }

    }

}

