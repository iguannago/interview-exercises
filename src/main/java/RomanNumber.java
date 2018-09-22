public class RomanNumber {
    public int parse(String romanNumber) {
        if ("I".equals(romanNumber)) return 1;
        else {
            return 1 + parse(romanNumber.substring(1));
        }
    }
}
