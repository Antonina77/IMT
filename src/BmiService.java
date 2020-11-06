public class BmiService {
    public float calculate(float weight, float growth) {
        float BMI = weight / (growth * growth);
        return BMI;
    }
}