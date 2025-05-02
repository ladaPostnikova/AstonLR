public class Dog extends Animals {
    public Dog (String name) {
        super(name);
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) System.out.println(name + " пробежал " + distance + " м.");
        else System.out.println(name + " не может бежать больше 500 м.");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 100) System.out.println(name + " пробежал " + distance + " м.\n");
        else System.out.println(name + " не может плавть больше 100 м.\n");


    }
}
