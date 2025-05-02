public class Cat extends Animals {

    boolean isHungry = false;

    public Cat (String name){
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) System.out.println(name + " пробежал " + distance + " м. ");
        else System.out.println(name + " может бежать больше 200 м.");

    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать(\n");
    }

    public boolean isHungryCat(){
        return isHungry;
    }

    public void eatCat(Bowl bowl, int food){
       if (bowl.getFoodInBowl() >= food){
           bowl.reductionToBowl(food);
           isHungry = true;
           System.out.println(name + " покушал");
       } else System.out.println("В миске недостаточно еды!");

    }
}
