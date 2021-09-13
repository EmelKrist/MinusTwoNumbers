package minustwonumbers;

import java.util.Scanner;

class Start {

    static float number1;
    static float number2;
    static Scanner INPUT = new Scanner(System.in);

    public Start() {

        inputNumbers(); //вызываем метод для вода данных    
    }

      /**
     * Метод,отвечающий за ввод чисел с консоли.
     */
    public static void inputNumbers() throws NumberFormatException {

        try { // блок обработки ошибок

            System.out.println("\nEnter the values of numbers: ");

            System.out.print("Number №1:");
            number1 = INPUT.nextFloat();
            System.out.print("Number №2:");
            number2 = INPUT.nextFloat();

        } catch (Exception e) { //в случае ошибки выводится сообщение
            System.out.println("Допустим ввод только целых чисел!");
            System.exit(0); //программа завершается 
        }
        //создаем объект класса  Calculation для проведения выслений
        Calculation calc = new Calculation(number1, number2);

    }

}
