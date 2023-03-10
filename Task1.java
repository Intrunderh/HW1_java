import java.util.Random;

public class Task1 {


    public static void main(String[] args) {

        int i = new Random().nextInt(0, 2000);

        System.out.print("Случайное число от 0 до 2000: ");
        System.out.println(i);

        int n = i;

        System.out.print("Номер старшего значащего бита выпавшего числа: ");
        System.out.println(Integer.toBinaryString(n).length());


        for (; i < Short.MAX_VALUE; i++) {
            if (i % n == 0){
                int[] m1 = new int[]{i};
                for (int j = 0; j < m1.length; j++) {
                    System.out.print(m1[j] + " ");
                }
            }
        }
        System.out.println();
        for (; Short.MIN_VALUE < i; i--) {
            if (i % n != 0){
                int[] m2 = new int[]{i};
                for (int j = i; j < m2.length; j++) {
                    // System.out.print(m2[j] + " ");
                }
            }
        }
    }
}
