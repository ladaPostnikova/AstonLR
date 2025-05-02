public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        bobik.run(400);
        bobik.swim(200);

        Cat[] cats = {
                new Cat ("Борис"),
                new Cat ("Кузя"),
                new Cat("Василий")
        };

        cats[1].run(100);
        cats[0].swim(50);

        System.out.println("\nКоличество животных: " + Animals.counterAnimal());
        System.out.println("Количество собвак: " + Animals.counterDog());
        System.out.println("Количество кошек: " + Animals.counterCat());

        System.out.println();
        for (Cat cat : cats) {
            if (cat.isHungryCat() == false) System.out.println(cat.name + " голоден");
            else System.out.println(cat.name + " сыт");
        };

        System.out.println();

        Bowl bowl = new Bowl(80);

        for (Cat cat : cats) {
            cat.eatCat(bowl, 30);
            if (cat.isHungryCat() == false) System.out.println(cat.name + " голоден");
            else System.out.println(cat.name + " сыт\n");
        }

        bowl.reductionToBowl(90);
    }
}