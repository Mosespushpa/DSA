class CharExample{
    public static void main(String mos[]){
        // Alphabets A - Z
        for(int i=65;i<=90;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        // Alphabets a - z
        for(int i=97;i<=122;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        // Digits 0 - 9
        for(int i=48;i<=57;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println();
        // Built-in Char Functions
        // 1# To check is the character is Alphabetic
        System.out.println("Is the \'A\' is Alphabetic - "+Character.isAlphabetic('A'));
        System.out.println("Is the \'a\' is Alphabetic - "+Character.isAlphabetic('a'));
        System.out.println("Is the \'1\' is Alphabetic - "+Character.isAlphabetic('1'));

        System.out.println();
        // 2# To check is the character is Digit
        System.out.println("Is the \'A\' is Digit - "+Character.isDigit('A'));
        System.out.println("Is the \'a\' is Digit - "+Character.isDigit('a'));
        System.out.println("Is the \'1\' is Digit - "+Character.isDigit('1'));

        System.out.println();
        // 3# To check is the character is lowercase
        System.out.println("Is the \'A\' is LowerCase - "+Character.isLowerCase('A'));
        System.out.println("Is the \'a\' is LowerCase - "+Character.isLowerCase('a'));
        System.out.println("Is the \'1\' is LowerCase - "+Character.isLowerCase('1'));

        System.out.println();

        // 4# To check is the character is UpperCase
        System.out.println("Is the \'A\' is UpperCase - "+Character.isUpperCase('A'));
        System.out.println("Is the \'a\' is UpperCase - "+Character.isUpperCase('a'));
        System.out.println("Is the \'1\' is UpperCase - "+Character.isUpperCase('1'));

        System.out.println();
        // 5# To check is the character is Whitespace
        System.out.println("Is the \'A\' is WhiteSapce - "+Character.isWhitespace('A'));
        System.out.println("Is the \'a\' is WhiteSapce - "+Character.isWhitespace('a'));
        System.out.println("Is the \'1\' is WhiteSapce - "+Character.isWhitespace('1'));
        System.out.println("Is the \' \' is WhiteSapce - "+Character.isWhitespace(' '));

    }
}