package prodject;

public class Main {
    public static void main(String[] args) {
        //Task 1
        byte barrel = 12;
        byte wb = 7;
        byte back = 8;
        int sum = wb + back;
        if (sum > barrel) {
            int rem = sum - barrel;
            System.out.println("Остаток воды в ведре: " + rem);
        }

        // Task 2
        byte nat = 5;
        byte kate = 4;
        int sum1 = nat + kate;
        System.out.println("Всего прочитанных книг: " + sum1);

        //Task 3
        byte br1 = 6;
        byte br2 = 7;
        int sum2 = br1 + br2;
        System.out.println("Всего яблок: " + sum2);

        //Task 4
        byte w1 = 2;
        short w2 = 3;
        byte w3 = 1;
        int sum3 = w1 + w2 + w3;
        System.out.println("Всего цветов: " + sum3);

        //Task 5
        int excellentA = 10;
        int goodA = 14;
        int badA = 2;
        int excellentB = 8;
        int goodB = 12;
        int badB = 3;
        int excellentC = 11;
        int goodC = 11;
        int badC = 4;

        //task 5.a
        int sumEx = excellentA + excellentB + excellentC;
        int sumGood = goodA + goodB + goodC;
        int sumBad = badA + badB + badC;
        System.out.println("Всего отличников в параллели: " + sumEx);
        System.out.println("Всего хорошистов в параллели: " + sumGood);
        System.out.println("Всего троечников в параллели: " + sumBad);

        //task 5.b
        int sumAll = sumEx + sumGood + sumBad;
        double ratioEx = (double) sumEx/sumAll * 100;
        System.out.printf("Процент отличников в параллели: %.2f%%\n", ratioEx);
        double ratioGood = (double) sumGood/sumAll * 100;
        System.out.printf("Процент хорошистов в параллели: %.2f%%\n", ratioGood);
        double ratioBad = (double) sumBad/sumAll * 100;
        System.out.printf("Процент троечников в параллели: %.2f%%\n",ratioBad);

        //task 5.c
        int sumClassA = excellentA + goodA + badA;
        int sumClassB = excellentB + goodB + badB;
        int sumClassC = excellentC + goodC + badC;

        double ratioExA = (double) excellentA/sumClassA * 100;
        System.out.printf("Процент отличников в 1-А классе: %.2f%%\n",ratioExA);
        double ratioGoodA = (double) goodA/sumClassA * 100;
        System.out.printf("Процент хорошистов в 1-А классе: %.2f%%\n",ratioGoodA);
        double ratioBadA = (double) badA/sumClassA * 100;
        System.out.printf("Процент троечников в 1-А классе: %.2f%%\n",ratioBadA);

        double ratioExB = (double) excellentB/sumClassB * 100;
        System.out.printf("Процент отличников в 1-Б классе: %.2f%%\n",ratioExB);
        double ratioGoodB = (double) goodB/sumClassB * 100;
        System.out.printf("Процент хорошистов в 1-Б классе: %.2f%%\n",ratioGoodB);
        double ratioBadB = (double) badB/sumClassB * 100;
        System.out.printf("Процент троечников в 1-Б классе: %.2f%%\n",ratioBadB);

        double ratioExC = (double) excellentC/sumClassC * 100;
        System.out.printf("Процент отличников в 1-В классе: %.2f%%\n",ratioExC);
        double ratioGoodC = (double) goodC/sumClassC * 100;
        System.out.printf("Процент хорошистов в 1-В классе: %.2f%%\n",ratioGoodC);
        double ratioBadC = (double) badC/sumClassC * 100;
        System.out.printf("Процент троечников в 1-В классе: %.2f%%\n",ratioBadC);

       //Task 6
        int studentTenge= 10 +5;
        int tenge = 1;
        double crona = (3.5 * tenge);
        double studentCrona = 2 * crona;
        double grivna = crona / 0.14;
        double studentGrivna = 1* grivna;
        double studentsAmount = (studentTenge + studentCrona + studentGrivna);
        System.out.println(studentsAmount);
        int priceMarkerBig = 15;
        int priceMarkerSmall = 13;
        if (studentsAmount>=(priceMarkerBig+priceMarkerSmall)){
            System.out.println("Достаточно денег");
        }
        else{
            System.out.println("Денег не достаточно");
        }




        //Task 7
        int a = 7;
        if (a>=0){
            System.out.println("Число А является положительным");
        }
        else {
            System.out.println("Число А не является положительным");
        }

        // Task 8
        int A = 37;
        if (A%2 != 0){
            System.out.println("Число А является нечётным");
        }
        else {
            System.out.println("Число А является чётным");
        }

        //Task 9
        int b = 8;
        if (b%2 == 0){
            System.out.println("Число А является чётным");
        }
        else {
            System.out.println("Число А не является чётным");
        }

        //Task 10
        int x = 39;
        int y = 90;
        int z = 107;
        if (y>x & y<z){
            System.out.println("Число В находиться между А и С");
        }
        else {
            System.out.println("Число В НЕ находиться между А и С");
        }

        //Task 11
        String text = "\u042f \u043b\u044e\u0431\u043b\u044e \u043f\u0440\u043e\u0433\u0440\u0430\u043c\u043c\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043d\u0430 \u004a\u0061\u0076\u0061\u0021\u0021\u0021";
        System.out.println(text);

    }
}
