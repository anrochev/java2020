package ru.example.helloworld;

public class HelloWorld {
    public static byte sumShortByte(byte b, short s) {
        return (byte)(b + s);
    }
    public static int multIntLong(int i, long l) {
        return (int)(i * l);
    }
    public static int getMaxNumber(int i1, int i2) {
        return i1 > i2 ? i1 : i2;
        //  return Math.max(i1,i2);
    }
    public static boolean isCharA(char c) {
        return c == 'A' ;
    }
    public static boolean isCharNumber(char c) {
        return Character.isDigit(c);
    }
    public static void binaryDigits() {
        int i;
        for (i=0; i<=30; i++) {
            System.out.println(Integer.toBinaryString(i));
        }}
    public static void displayMaxValue() {
        System.out.println(Integer.MAX_VALUE + ", двоичное: " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.MAX_VALUE + 1 + ", двоичное: " + Integer.toBinaryString(Integer.MAX_VALUE + 1));

    }
    public static int getCharCode(char c) {
        return c;
    }
    public static String getIntStr(int i) {
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 50, resInt, i2=60;
        long l = 100;
        byte resByte;
        char a='A', bb='B';
        boolean bool;
        System.out.println("Hello, World!");

           /* 4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
        Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.*/
        resByte = sumShortByte(b,s);
        System.out.println("Результат \"byte "+ b + " + short " + s + "\" = " + resByte);

       /* 5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
       Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.*/
        resInt = multIntLong(i,l);
        System.out.println("Результат \"int "+ i + " * long " + l + "\" = " + resInt);

        /* 6. Написать метод getMaxNumber принимающий 2 параметра: int и int.
        Метод должен сравнить переданные параметры между собой и вернуть максимальный.
        Для решения необходимо использовать IF или тернарный оператор ?:.*/
        resInt = getMaxNumber(i,i2);
        System.out.println("Наибольшее из "+ i +", "+ i2 +": " + resInt);

        /*7. Написать метод isCharA принимающий 1 параметр типа char.
        Если передана буква 'А', то возвращать true, а в остальных случаях false  */
        bool = isCharA(a);
        System.out.println("Проверка на A, передана "+a+", результат "+ bool);
        bool = isCharA(bb);
        System.out.println("Проверка на A, передана "+bb+", результат "+ bool);

        /*8. Написать метод isCharNumber принимающий 1 параметр типа char.
        Если передано число, то вернуть true, а в остальных случаях false  */
        System.out.println("Передаем число 8 = "+isCharNumber('8'));
        System.out.println("Передаем букву H = "+isCharNumber('H'));

        /*9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
        Для вывода бинарного представления использовать Integer.toBinaryString().
        Без входных параметров и не возвращающая ничего.  */
        binaryDigits();

        /*10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1. Для вывода бинарного представления использовать Integer.toBinaryString().
                Без входных параметров и не возвращающая ничего. Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти */
        displayMaxValue();

        /*11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.*/
        System.out.println("Код символа Y = "+getCharCode('Y'));
        /*12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа*/
        System.out.println("Возврат числа 745 = "+getIntStr(745));
    }
}
