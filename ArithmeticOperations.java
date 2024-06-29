public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;
        performOperations(num1, num2);
    }
    
    public static void performOperations(int a, int b) {
        try {
  
            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum);

            int difference = a - b;
            System.out.println(a + " - " + b + " = " + difference);

            int product = a * b;
            System.out.println(a + " * " + b + " = " + product);
            

            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int quotient = a / b;
            System.out.println(a + " / " + b + " = " + quotient);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
