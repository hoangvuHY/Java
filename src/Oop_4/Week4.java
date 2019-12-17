package Oop_4;
/**
 * Created by CCNE on 24/09/2019.
 */
public class Week4 {
    /**
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return (Math.max(a, b));
    }

    /**
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     * <p>
     * Nếu BMI dưới 18.5 thì trả về “Thiếu cân”
     * <p>
     * Nếu BMI từ 18.5 đến 22.9 thì trả về “Bình thường”
     * <p>
     * Nếu BMI từ 23 đến 24.9 thì trả về “Thừa cân“
     * <p>
     * Nếu BMI >= 25 thì trả về “Béo phì”
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        double res = (double)Math.round(BMI * 100) / 100;
        if (res < 18.5) {
            return "Thiếu cân";
        }if (res >= 18.5 && res <= 22.9) {
            return "Bình thường";
        }if (res >= 23 && res <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }

    public static void main(String[] args) {

    }
}
