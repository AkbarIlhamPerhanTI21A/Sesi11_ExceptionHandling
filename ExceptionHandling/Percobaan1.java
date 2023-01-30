
/**
 * PBO Session 11
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 * */

package ExceptionHandling;

public class Percobaan1 {

    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memori");
        }
    }
}