class RomanNumber {
    int parse(String roman) {
        if ("I".equals(roman)) return 1;
        if ("V".equals(roman)) return 5;
        if ("X".equals(roman)) return 10;
        else {
            if (roman.startsWith("II"))
                return 1 + parse(roman.substring(1));
            if (roman.startsWith("IV"))
                return parse(roman.substring(1)) - 1;
            if (roman.startsWith("VI"))
                return 5 + parse(roman.substring(1));
            return parse(roman.substring(1)) - 1;
        }
    }
}
