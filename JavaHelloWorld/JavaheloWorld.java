package JavaHelloWorld;

import java.util.Scanner;

public class JavaheloWorld {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Hello World!");
        // int a = 1;
        // float tall = 1.78f;
        // char c = '2';
        // boolean b = true;
        // String str = "Hello World!";
        // byte b1 = 127; // 1 byte
        // short s = 32767; // 2 byte
        // long l = 9223372036854775807L; // 8 byte
        // double d = 1.7976931348623157E308; // 8 byte
        // System.out.println("a = " + a);
        // System.out.println("tall = " + tall);
        // System.out.println("c = " + c);
        // System.out.println("b = " + b);
        // System.out.println("str = " + str);

        int id;
        String name;
        float tall;

        System.out.println("Enter your id :");
        id = input.nextInt();
        System.out.println("Enter your name :");
        name = input.nextLine();
        System.out.println("Enter your tall :");
        tall = input.nextFloat();

        System.out.println("Your id is : " + id + ".....");
        System.out.println("Your name is : " + name);
        System.out.println("Your tall is : " + tall);

    }
}

/*
 * 
 * javac -> byte code jvm -> iterpreting bytecode -> machine code
 * 
 * 
 */