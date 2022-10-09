import java.util.TreeMap;
 class ArabToRoman {
    public static String intToRoman(int num) {
        String result = "";
        TreeMap<Integer, String> arab = new TreeMap<>();
        arab.put(1, "I");
        arab.put(4, "IV");
        arab.put(5, "V");
        arab.put(9, "IX");
        arab.put(10, "X");
        arab.put(50, "L");
        arab.put(100, "C");
        for (Integer key : arab.descendingKeySet()) {
            while (num >= key) {
                num -= key;
                result += arab.get(key);
            }
        }
        return result;
    }
}
