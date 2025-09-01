//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Long.sum;
import java.util.Arrays;

public class Main {

    public static class Animal {
        String name;
        int CatCount;
        int DogCount;
        public static int AnimalCount = 0;
        int LenthRun;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
            this.CatCount = CatCount;
            this.DogCount = DogCount;
            this.AnimalCount = AnimalCount;
            AnimalCount++;
            this.LenthRun = LenthRun;
        }

        public static int AnimalCount() {
            return AnimalCount;
        }

        public void AnimalRun() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("длина препятствия - бег: " +
                    "кот 200 м., собака 500 м.");
            int LenthRun = scanner.nextInt();
            System.out.println(name + " пробежал " + LenthRun + " м");
        }

        public void AnimalSwim() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("длина препятствия - плавание: кот не умеет плавать, собака 10 м");
            int LenthSwim = scanner.nextInt();
            System.out.println(name + " проплыл " + LenthSwim + " м");
        }
    }

    public static class Cat extends Animal {
        private static int CatCount = 0;
        int EatInPlate;
        int LenthRun;
        boolean WellFed = false;


        public Cat(String name) {
            this.name = name;
            this.CatCount = CatCount;
            this.AnimalCount = AnimalCount;
            this.LenthRun = LenthRun;
            this.EatInPlate = EatInPlate;
            CatCount++;
        }

        public Cat(String name, int eatInPlate, boolean wellFed) {
        }

        public static int CatCount() {
            return CatCount;
        }

        public void CatInfo() {
            System.out.println("Кот с именем " + name);
        }

        public void CatEat() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("количество еды в тарелке ");
            int EatInPlate = scanner.nextInt();

            if (EatInPlate < 0) {
                System.out.println("мало еды в тарелке");
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("колько еды хочет покушать кот ");
            int EatToEat = scanner1.nextInt();

            if (EatInPlate < EatToEat) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("сколько добавить еды ");
                int EatToAdd = scanner.nextInt();
                EatInPlate = EatInPlate + EatToAdd;
                System.out.println("в тарелке получилось еды "+ EatInPlate);
                if (EatInPlate < EatToEat) {
                    System.out.println("кот останется голодным ");
                    WellFed = false;
                } else {
                    System.out.println("кот поел ");
                    WellFed = true;
                }

            } else {
                System.out.println("кот поел ");
                WellFed = true;
            }
        }

    }

    public static class Dog extends Animal {
        private static int DogCount = 0;

        public Dog(String name) {
            this.name = name;
            this.DogCount = DogCount;
            this.AnimalCount = AnimalCount;
            DogCount++;
        }

        public void DogInfo() {
            System.out.println("Собака с именем " + name);
        }

        public static int DogCount() {
            return DogCount;
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Белка");
        Dog dog2 = new Dog("Стрелка");

        cat1.CatInfo();
        cat1.AnimalSwim();
        cat1.AnimalRun();
        //cat1.CatLenthRun();
        cat1.CatEat();

        System.out.println();
        cat2.CatInfo();
        cat2.AnimalSwim();
        cat2.AnimalRun();
        //cat2.CatLenthRun();
        cat2.CatEat();

        Cat[] catArray = new Cat[2];
        catArray[0] = new Cat(cat1.name, cat1.EatInPlate, cat1.WellFed);
        catArray[1] = new Cat(cat2.name, cat2.EatInPlate, cat2.WellFed);
        System.out.println(cat1.name +  cat1.EatInPlate +   cat1.WellFed);
        System.out.println(cat2.name +  cat2.EatInPlate +   cat2.WellFed);

        System.out.println();
        System.out.println("число котов - " + Cat.CatCount());
        System.out.println("число собак - " + Dog.DogCount());
        System.out.println("число животных - " + sum(Cat.CatCount(), Dog.DogCount()));
    }
}