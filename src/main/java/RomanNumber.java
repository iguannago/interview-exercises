class RomanNumber {
    int parse(String roman) {
        if ("I".equals(roman)) return 1;
        if ("V".equals(roman)) return 5;
        if ("X".equals(roman)) return 10;
        if ("L".equals(roman)) return 50;
        else {
            int firstChar = parse(roman.substring(0, 1));
            int secondChar = parse(roman.substring(1, 2));
            if (firstChar >= secondChar)
                return firstChar + parse(roman.substring(1));
            return parse(roman.substring(1)) - firstChar;

        }
    }
}
