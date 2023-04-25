public class BmiService {

    public double calculate(double height, double weight) {
        double bmiIndex;
        bmiIndex = weight / (height * height);
        return bmiIndex;
    }
}