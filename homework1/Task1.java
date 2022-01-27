package homework1;

public class Task1 {

    public static void main(String[] args) {
        int n = 7;
        int sumBezN = 0;
        int[] cromeN = {7, 8, 6, 5, 2, 9, 23, 1, 3, 7};
        for (int i = 0; i < cromeN.length; i++) {
            if (cromeN[i] == n) {
                continue;
            }
            sumBezN += cromeN[i];
        }
        System.out.println("Сумма без n = " + sumBezN);
    }
}
