import java.util.Scanner;

public class lesson23 {

    public static class Product {
        private String name;
        private String date;
        private String manufacturer;
        private String country_of_origin;
        private int coast;
        private boolean reservation;

        public Product (String name, String date, String manufacturer, String country_of_origin, int coast, Boolean reservation) {
            this.name = name;
            this.date = date;
            this.manufacturer = manufacturer;
            this.country_of_origin = country_of_origin;
            this.coast = coast;
            this.reservation = reservation;
        }
        public static void main (String[] args) {
            Product product1 = new Product("пример товара:" + "Samsung S25 Ultra", "01.02.2025",

                    "Samsung Corp.", "Korea", 5599, false);
            System.out.println(product1.name + product1.date + product1.manufacturer +
                    product1.country_of_origin + product1.coast + product1.reservation);


            Product[] productsArray = new Product[5];
            productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
            productsArray[1] = new Product("Samsung Galaxy S25 Ultra", "01.01.2025", "Samsung Corp.", "Korea", 3150, true);
            productsArray[2] = new Product("Xiaomi 15 Ultra", "01.02.2025", "Xiaomi", "China", 3550, true);
            productsArray[3] = new Product("Realme GT7 Pro", "01.01.2025", "Realme Chongqing Mobile Telecommunications Corp., Ltd", "China", 2470, false);
            productsArray[4] = new Product("iPhone 16 Pro Max", "01.03.2025", "Apple Inc.", "USA", 3999, true);

            Scanner scanner = new Scanner(System.in);
            System.out.println("индекс записи массива ТОВАРОВ от 0 до 4:");
            int num = scanner.nextInt();

            System.out.println(productsArray[num].name + productsArray[num].date + productsArray[num].manufacturer+
                    productsArray[num].country_of_origin+ productsArray[num].coast+ productsArray[num].reservation);
        }
    }
    public static class Park {
        private Attraction attraction;
        public class Attraction {
            private String id;
            private String hour;
            private int coast;

            public Attraction (String id, String hour, int coast) {
                this.id = id;
                this.hour = hour;
                this.coast =  coast;
            }
        }
        public static void main (String[] args) {
            Park.Attraction attraction1 = new Park(). new Attraction("1 - карусель", "9-17", 5);
            attraction1.id = "1 - карусель";
            attraction1.hour = "9-17";
            attraction1.coast = 5;

            System.out.println("ПРИМЕР аттракциона: " + "название" + attraction1.id +
                    ", время работы - " + attraction1.hour + ", стоимость, руб. - "+ attraction1.coast);

            Park.Attraction[] attractionArray = new Park.Attraction[10];//например, 10 аттракционов в парке
            attractionArray[0] = new Park(). new Attraction("1 - карусель", "8-17", 5);
            attractionArray[1] = new Park(). new Attraction("2 - качель", "10-17", 8);
            attractionArray[2] = new Park(). new Attraction("3 - ракушки", "10-17", 10);

            Scanner scanner = new Scanner(System.in);
            System.out.println("номер аттракциона: ");
            int num_attr = scanner.nextInt();

            System.out.println("аттракцион: " + attractionArray[(num_attr-1)].id +
                    ", время работы: "+attractionArray[(num_attr-1)].hour +
                    ", стоимость: "+attractionArray[(num_attr-1)].coast);

        }
    }
}

