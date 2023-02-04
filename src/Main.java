public class Main {
    public static void main(String[] args) {
        //1
        int year = 2021;
        leapYear(year);

        //2
        MyPhone(2, 2015);

        //3
        int kilometer = 110;
        int days = Days(kilometer);
        if (days == -1) {
            System.out.println(" Доставка невозможна на расстояние " + kilometer + " киллометров.");
        } else {
            System.out.print(" Время доставки " + days + " д..");
        }
    }


    private static void leapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    private static void MyPhone(int os, int productionYear) {
        if (productionYear <= 2015 && os <= 1) {
            System.out.println(" Необходимо установить облегченную версию приложения для iOS по ссылке. ");
        } else  {
            System.out.println("Необходимо установить облегченную версию приложения для Android по ссылке");
            if (productionYear > 2014) {
                System.out.println(" Для пользователей телефонов " + productionYear +
                        " года выпуска и позже необходимо " +
                        "установить обычные версии приложений для iOS и Android по ссылке");
            }
        }
    }

    private static int Days(int kilometer) {
        if (kilometer >= 0 && kilometer <= 20) {
            return 1;
        } else if (kilometer > 20 && kilometer <= 60) {
            return 2;
        } else if (kilometer > 60 && kilometer <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}