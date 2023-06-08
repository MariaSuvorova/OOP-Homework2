package Homework2;

public class cat {
    private String name;
    private int appetite;
    private boolean happiness;

    public cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(int food) {
        if (food >= appetite)  setHappiness(true);
        else  setHappiness(false);
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isHappiness() {
        return happiness;
    }

    public void setHappiness(boolean happiness) {
        this.happiness = happiness;
    }
    
}
