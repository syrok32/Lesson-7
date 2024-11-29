public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int salary = 15000;
        int total = 0;
        int day = 0;
        while (total <= 2_459_000) {
            total += salary;
            day++;
            System.out.println("Месяц " + day + ", сумма накоплений " + total + " рублей");
        }

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i = 10;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");

        }
        int population = 12_000_000;
        double birthRate = 0.017;
        double deathRate = 0.008;

        for (int year = 1; year <= 10; year++) {
            int born = (int) (population * birthRate);
            int died = (int) (population * deathRate);
            population = population + born - died;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        double total1 = 0;
        int salary1 = 29000;
        long month = 0;

        while (total1 <= 12_000_000) {
            total1 = (int) (total1 + salary1) * 1.07;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + total1 + " рублей");

        }
        total1 = 0;
        month = 0;
        while (total1 <= 12_000_000) {
            total1 = (total1 + salary1) * 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total1 + " рублей");
            }

            double initialDeposit = 15000;
            int years = 9;
            int halfYears = years * 12;


            double currentAmount = initialDeposit;

            for (int halfYear = 1; halfYear <= halfYears; halfYear++) {

                currentAmount += currentAmount * 0.07;
                if (halfYear % 6 == 0) {

                    System.out.println("Полугодие " + halfYear / 6 + ": сумма накоплений " + currentAmount);
                }
            }
            int dateFri = 5;
            while (dateFri <= 31) {
                System.out.println("Сегодня пятница, " + dateFri + "-е число. Необходимо подготовить отчет».");
                dateFri += 7;
            }


            int range200 = 2024 - 200;
            int range100 = 2024 + 100;

            while (range200 < range100) {

                System.out.println(range200);
                range200 += 79;


            }


        }
    }
}
