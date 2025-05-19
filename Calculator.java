/**
 * A simple Calculator class that provides basic arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers and returns the result.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Main method to demonstrate the Calculator functionality.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Demonstrate the add method
        double num1 = 5.0;
        double num2 = 7.0;
        double result = calculator.add(num1, num2);
        
        System.out.println("Adding " + num1 + " and " + num2 + " equals " + result);
    }
}

