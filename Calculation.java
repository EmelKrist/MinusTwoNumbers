package minustwonumbers;

class Calculation {

    static float number1;
    static float number2;
    static float razn1;
    static float razn2;

    Calculation(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
        Calculations();
    }

    /**
     * Метод,отвечающий за выисление разности заданных чисел.
     */
    public static void Calculations() {

        razn1 = number1 - number2;
        razn2 = number2 - number1;

        System.out.println(number1 + " - " + number2 + " = " + razn1);
        System.out.println(number2 + " - " + number1 + " = " + razn2);
    }

}
