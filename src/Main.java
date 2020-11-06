public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 60;
        float growth = 1.64f;
        float BMI = service.calculate(weight, growth);
        System.out.println(BMI);
    }
}
