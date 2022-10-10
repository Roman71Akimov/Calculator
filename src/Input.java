import java.util.Scanner;

class Input {
    public static String[] input() throws CalculatorExceptions{
        Scanner scanner = new Scanner(System.in);
        String expression =scanner.nextLine().replaceAll("\\s","");
        String [] expr = new String[0];
        String [] exp = new String[3];
        //разделяем строку по оператору и записываем в массив информацию о операндах и операторе

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i)=='+'){
                    expr = expression.split("\\+");
                    exp [2]="+";}
            else if (expression.charAt(i)=='-'){
                expr = expression.split("-");
                exp [2]="-";}
            else if (expression.charAt(i)=='*') {
                expr = expression.split("\\*");
                exp [2]="*";}
            else if (expression.charAt(i)=='/'){
                expr = expression.split("/");
                exp [2]="/";}
            }
        System.arraycopy(expr, 0, exp, 0, expr.length);
        CalculatorExceptions.isNotFractional(exp[0]);
        CalculatorExceptions.isNotFractional(exp[1]);
        return exp;
    }
}
