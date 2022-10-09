public class Calculation {
    public static int calculation(String[] exp) throws CalculatorExceptions  {
        int res;
        CalculatorExceptions.oneToTen(Integer.parseInt(exp[0]));
        CalculatorExceptions.oneToTen(Integer.parseInt(exp[1]));

         res = switch (exp[2]) {
            case "+" -> Integer.parseInt(exp[0]) + Integer.parseInt(exp[1]);
            case "-" -> Integer.parseInt(exp[0]) - Integer.parseInt(exp[1]);
            case "*" -> Integer.parseInt(exp[0]) * Integer.parseInt(exp[1]);
            case "/" -> Integer.parseInt(exp[0]) / Integer.parseInt(exp[1]);
            default -> 0;
        };

        return res;
    }
}
