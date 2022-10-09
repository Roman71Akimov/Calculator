

 class Input {
    public static String[] input(String input) throws CalculatorExceptions{
        String expression = input.replaceAll("\\s","");
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
