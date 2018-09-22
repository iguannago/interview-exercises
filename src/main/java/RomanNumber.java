class RomanNumber {
    int parse(String roman) {
        if ("I".equals(roman)) return 1;
        if ("V".equals(roman)) return 5;
        else {
            if (roman.startsWith("II"))
                return 1 + parse(roman.substring(1));
            if (roman.startsWith("IV"))
                return parse(roman.substring(1)) - 1;
            return 5 + parse(roman.substring(1));
        }
    }
}
