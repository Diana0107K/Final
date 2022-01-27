package homework1;

public class Task2 {

    public static void main(String[] args) {
        int m = 7;
        int[] Fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int sumChetn = 0;
        for (int j = 0; j < m; j++) {
            if (Fib[j] % 2 == 0) {
                sumChetn += Fib[j];
            }
        }
        System.out.println("Сумма четных до " + m + " = " + sumChetn);
    }
}
