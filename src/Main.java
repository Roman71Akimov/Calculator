public class Main {

    public static String calc(String input)  {
        String output = "";
        try { String [] exp;
        exp = Input.input(input);
    if (isInteger(exp[0])&&isInteger(exp[1])){
    output = String.valueOf(Calculation.calculation(exp));}
    else {
    CalculatorExceptions.negativRoman(Calculation.calculation(RomanToArab.convertToArab(exp)));
    output = String.valueOf(ArabToRoman.intToRoman(Calculation.calculation(RomanToArab.convertToArab(exp))));}}

        catch (CalculatorExceptions e){
        System.out.println(e.getMessage());}
        catch (Exception e){
            System.out.println("Некорректное выражение");}
        return output;
}
public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
}
