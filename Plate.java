package Homework2;

public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("на тарелке " + food);
    }
    public void addFood(int food) {
        this.food = getFood() + food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
