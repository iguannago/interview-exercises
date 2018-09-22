public class RomanNumber {
    public int parse(String romanNumber) {
        if ("I".equals(romanNumber)) return 1;
        if ("V".equals(romanNumber)) return 5;
        else {
            if (romanNumber.startsWith("II"))
                return 1 + parse(romanNumber.substring(1));
            return parse(romanNumber.substring(1)) - 1;
        }
    }
}
