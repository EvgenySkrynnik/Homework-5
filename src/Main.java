public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();




    }public static void task1(){
        System.out.println( "задача 1 ");
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " ");}

    public static void task2() {
        System.out.println("задача 2 ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " ");
        }

    }public static void task3(){
                System.out.println("задача 3 ");
                for (int i = 0; i < 18; i ++ ){
                    if ( i % 2 ==0 ) {
                        System.out.println(i + "");

                    }}}
    public static void task4(){
        System.out.println("задача 4 ");
        for ( int i = 10; i >= - 10; i -- ){
            System.out.println(i + "");
        }}
    public static void task5(){
        System.out.println("задача 5 ");
        for ( int year  = 1904; year <= 2096; year ++){
            if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
                System.out.println(year + "год является високосным");

            }}}
            public static void task6() {
                System.out.println("задача 6 ");
                for (int i = 7; i <= 98; i += 7) {
                    System.out.println(i + "");
                }
            } public static void task7(){
                    System.out.println("задача 7 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i + "");
        }}
    public static void task8() {
        System.out.println("задача 8 ");
        int monthAmount = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += monthAmount;
            System.out.println(" месяц " + i + " сумма накоплений равна " + sum + " рублей ");
        }
    } public static void task9() {
        System.out.println("задача 9 ");
        double sum = 29_000;
        for ( int i = 1; i <= 12; ++i) {
            sum = sum + sum * 0.01;
            System.out.printf("Mесяц %d, сумма накоплений равна %.4f рублей%n", i, sum);
        }}


    public static void task10() {
        System.out.println("задача 10 ");
        for ( int i =1; i <= 10; i++ ){
            System.out.println(" 2*" + i + "=" + i * 2);
            System.out.println();
        }
    }}
