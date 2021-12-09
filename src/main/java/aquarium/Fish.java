package aquarium;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public abstract void feed();

    public String getStatus(){
        return name+", weight: "+weight+", color: "+color+", short-term memory loss: "+memoryLoss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }
}
