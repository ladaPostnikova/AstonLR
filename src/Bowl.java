public class Bowl {

    private int foodInBowl;

    public int getFoodInBowl(){
        return  foodInBowl;
    }

    public Bowl(int foodInBowl){
        this.foodInBowl = foodInBowl;
    }

    public void addToBowl(int food){
        foodInBowl += food;
        System.out.println("Еда добавлена в миску!\nЕды в миске: " + foodInBowl);
    }

    public void reductionToBowl(int food){
        if (foodInBowl >= food) foodInBowl -= food;
        else System.out.println("\nВ миске закончилась...");
    }

}
