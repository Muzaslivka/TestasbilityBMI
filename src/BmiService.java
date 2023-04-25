public class BmiService {

    public double calculate(double height, double weight) {
        double bmiIndex;
        int a = 2;
        bmiIndex = weight / Math.pow(height, a);
        return bmiIndex;
    }
}