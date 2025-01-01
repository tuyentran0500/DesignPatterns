package Interpreter;

public class Main {
    public static void main(String[] args) {
        // Represent the expression "3 + 5 - 2"

        // Terminal expressions (numbers)
        Expression number3 = new NumberExpression(3);
        Expression number5 = new NumberExpression(5);
        Expression number2 = new NumberExpression(2);

        // Non-terminal expressions (operations)
        Expression addition = new AddExpression(number3, number5); // 3 + 5
        Expression subtraction = new SubtractExpression(addition, number2); // (3 + 5) - 2

        // Interpret the final expression
        System.out.println("Result: " + subtraction.interpret()); // Output: 6
    }
}
