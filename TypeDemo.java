public class TypeDemo {
    public static void main(String args[]) {

        System.out.println("======1. Type conversion (widening)======");

        int intVal = 100;
        long longVal = intVal;
        float floatVal = longVal;

        System.out.println("Integer value: " + intVal);
        System.out.println("Automatically converted to long: " + longVal);
        System.out.println("Automatically converted to float: " + floatVal);

        System.out.println();

        System.out.println("=====2. Type casting (narrowing)=====");

        double doubleVal = 50.45;
        int castedInt = (int) doubleVal;

        int largeInt = 130;
        byte castedByte = (byte) largeInt;

        System.out.println("Original Double value: " + doubleVal);
        System.out.println("Explicitly casted to int (truncated): " + castedInt);
        System.out.println("Original casted to Byte (overflow wrap): " + castedByte);

        System.out.println();

        System.out.println("=====3. Automatic Type Promotion=====");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 1234;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println("Result of expression evaluation: " + result);
    }
}