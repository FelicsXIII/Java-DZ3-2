public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.75;
        int weight = 57;
        int bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bmi);
    }
}