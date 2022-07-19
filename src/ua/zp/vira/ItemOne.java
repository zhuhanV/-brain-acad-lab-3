package ua.zp.vira;

import java.util.Scanner;

/**
 * This is a simple class to study variables
 */
public class ItemOne {
    public static void main(String[] args) {

        /*1. Написати програму, де оголошено та проініціалізовано всі примітивні типи даних.
        (byte, short, int, long, float, double, char, boolean)
        Необхідно вивести на екран усі значення цих змінних.
        */

        System.out.println("Ex. 1");
        byte b = 1;
        System.out.println("type byte value =" + b);
        short sh = 350;
        System.out.println("type short value =" + sh);
        int i = 2500000;
        System.out.println("type int value =" + i);
        long l = 1328477230;
        System.out.println("type long value =" + l);
        float f = 5.2222f;
        System.out.println("type float value =" + f);
        double d = 5.6666666666666;
        System.out.println("type double value =" + d);
        char ch = 'c';
        System.out.println("type char value =" + ch);
        boolean bo = true;
        System.out.println("type boolean value =" + true);

        /*2. Застосувати практично можливі перетворення без втрати точності.
        byte -> short -> int -> long
        int -> double
        short -> float -> double
        char -> int
        */
        System.out.println('\n' + "Ex. 2");
        short sh1 = (short) b;
        System.out.println("byte -> short = " + sh1);
        i = (int) sh;
        System.out.println("short -> int= " + i);
        l = (long) i;
        System.out.println("int -> long= " + l);
        i = (int) d;
        System.out.println("int -> double= " + i);
        i = (int) Math.round(d);
        System.out.println("int -> double with Math.round = " + i);
        f = (float) sh;
        System.out.println("short -> float= " + f);
        d = (double) f;
        System.out.println("float -> double= " + d);
        i = (int) ch;
        System.out.println("char -> int= " + i);

        /* Застосувати практично автоматичне перетворення, але з втратою точності: int -> float
        1. Проініціалізувати змінну типу int максимальним значенням
        2. Присвоїти її значення змінної типу float.
        3. Вивести обидва числа на екран.
        */
        System.out.println('\n' + "Ex. 3");
        int i1 = 2147483647;
        float f1 = (float) i1;
        System.out.println("int= " + i1);
        System.out.println("float= " + f1);

        /*Перевірити роботу переповнення мантиси числа в java.
        1.Створити змінну типу byte та проініціалізувати її максимальним значенням.
        2.Виконати операцію "інкремент" для цієї змінної.
        3. Вивести значення на екран
        */

        System.out.println('\n' + "Ex. 4");
        byte b1 = 127;
        b1++;
        System.out.println(b1);

        /*Написати тернарну операцію, яка визначає парність числа та формує
        відповідний рядок, який виводиться на екран
        */

        System.out.println('\n' + "Ex. 5");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a % 2 == 0 ? "number is even" : "odd number");

    }
}
