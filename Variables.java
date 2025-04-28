public class EasyInterest {

    public static void main(String[] args) {
        double savings = 600.0;  // starting money
        double growthRate = 5.0; // interest rate in percent

        System.out.println("Initial savings: $" + savings);

        // After 1 year
        savings = savings + (savings * growthRate / 100);
        System.out.println("Savings after 1 year: $" + savings);

        // After 2 years
        savings = savings + (savings * growthRate / 100);
        System.out.println("Savings after 2 years: $" + savings);
    }
}
