
 class RomanToArab{
    public static String[] convertToArab(String[] exp) throws CalculatorExceptions {
        String [] convertNum = new String[3];
        convertNum [2] = exp [2];
        for (int j = 0; j <= 1; j++) {
            String str = exp[j];
            int[] number = new int[str.length()];

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'I')
                    number[i] = 1;
                else if (str.charAt(i) == 'V')
                    number[i] = 5;
                else if (str.charAt(i) == 'X')
                    number[i] = 10;
                else if (Character.isDigit(str.charAt(i)))
                    throw new CalculatorExceptions("Используются одновременно разные системы счисления");
                else {throw new CalculatorExceptions("Некорректное выражение"); }
            }
            int num = 0;
            for (int i = 0; i < number.length; i++) {
                if (i == number.length - 1) {
                    num +=number[i];
                } else if (number[i] >= number[i + 1]) {
                    num +=number[i];
                } else if (number[i] < number[i + 1]) {
                    num -=number[i];
                }
            }
            convertNum [j] = String.valueOf(num);
        }
    return convertNum;
    }
}
