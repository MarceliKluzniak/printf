package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {

        // printf() = an optional method to control, forat, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversation-character]

        boolean myBoolean = true;
        char myChar = '$';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

//        System.out.printf("%b", myBoolean);
//        System.out.println();
//        System.out.printf("%c", myChar);
//        System.out.println();
//        System.out.printf("%s", myString);
//        System.out.println();
//        System.out.printf("%d", myInt);
//        System.out.println();
//        System.out.printf("%f", myDouble);
//        System.out.println();

        //[width]
        //minimum number of characters to be written as output
        //System.out.printf("Hello %10s",myString); //sample of width

        //[precision]
        //set number of digits of precision when outputting floating-point values
        //System.out.printf("Youhave this much money %.1f", myDouble); //sample of precision

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        System.out.printf("Youhave this much money %20f", myDouble); //samples of flags
        System.out.println(); //line space between every command
        // + : output a plus (+) or a minus (-) sigh for a numeric value
        System.out.printf("Youhave this much money %+f", myDouble);
        System.out.println();
        // 0 : numeric value are zero-padded
        System.out.printf("Youhave this much money %020f", myDouble);
        System.out.println();
        // , : comma grouping separator if numbers > 1000
        System.out.printf("Youhave this much money %,f", myDouble);


    }
}
