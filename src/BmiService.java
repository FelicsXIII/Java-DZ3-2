public class BmiService {
    int calculate(double height, int weight) {
        return (int) (weight / (height*height));
    }
}
