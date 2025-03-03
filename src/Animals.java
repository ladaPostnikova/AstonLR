public abstract class Animals {
    String name;

    static int numberOfAnimals = 0;
    static int numberOfDog = 0;
    static int numberOfCat = 0;

    public Animals (String name){
        this.name = name;
        numberOfAnimals ++;
        counterAnimals(this);
    }

    public static void counterAnimals(Animals animal){
        if (animal instanceof Dog) numberOfDog++;
        else if (animal instanceof Cat) numberOfCat++;
    }

    public static int counterAnimal(){
        return numberOfAnimals;
    }

    public static int counterDog(){
        return numberOfDog;
    }

    public static int counterCat(){
        return numberOfCat;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);


}
