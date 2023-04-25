public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.75;
        double weight = 103.2;
        int index = (int) service.calculate(height, weight);
        System.out.println(index);
    }
}