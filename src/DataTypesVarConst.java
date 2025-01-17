import java.io.InputStream;
import java.util.Scanner;

public class DataTypesVarConst {
    public static void  main(String[] args){
    // Easy: Declare variables of all primitive data types and print their default values.
        boolean flag = false;
        char alphabet = 'a';
        int intVal = 0;
        long longVal = 0;
        byte byteVal = 0;
        short shortVal = 0;
        float floatVal = 0.0f;
        double doubleVal = 0.0;
        System.out.format("%-30s %-10s\n" ,"DateType","Value");
        System.out.println("-----------------------------------------");
        System.out.format("%-30s %-10s\n", "boolean", flag);
        System.out.format("%-30s %-10s\n", "char", alphabet);
        System.out.format("%-30s %-10s\n", "int", intVal);
        System.out.format("%-30s %-10s\n", "long", longVal);
        System.out.format("%-30s %-10s\n", "byte", byteVal);
        System.out.format("%-30s %-10s\n", "short", shortVal);
        System.out.format("%-30s %-10s\n", "float", floatVal);
        System.out.format("%-30s %-10s\n", "double", doubleVal);

    //Medium: Write a program to calculate the area and perimeter of a rectangle using user inputs.
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of rectangle");
        int length = scan.nextInt();
        System.out.println("Width of rectangle");
        int width = scan.nextInt();
        int area = length * width;
        double perimeter = 0.5*(length + width);
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    //
    }
}
