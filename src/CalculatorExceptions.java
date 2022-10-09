public class CalculatorExceptions extends Exception{

    public CalculatorExceptions(String message){
        super(message);
    }
    public static void oneToTen (int num) throws CalculatorExceptions{
        if (num<1||num>10)
            throw new CalculatorExceptions("Число не в диапазоне 1-10");
    }
    public static void negativRoman(int s) throws CalculatorExceptions{
        if (s<0)
            throw new CalculatorExceptions("В римской системе нет отрицательных");
    }
    public static void isNotFractional(String str) throws CalculatorExceptions {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '.', ',' -> throw new CalculatorExceptions("Нельзя дробное");
                case '+', '-', '*','/' -> throw new CalculatorExceptions("Формат математической операции не " +
                        "удовлетворяет заданию - два операнда и один оператор");
            }
        }
    }
}
