package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    public static final int CAPACITY = 20;

    private List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        if (CAPACITY >= ((fishList.size() * 5) + 5)) {
            fishList.add(fish);
        } else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed() {
        for (Fish fish : fishList) {
            fish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> overWeights = new ArrayList<>();
        for (Fish fish : fishList) {
            if (fish.getWeight() > maxWeight) {
                overWeights.add(fish);
            }
        }
        fishList.removeAll(overWeights);
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish : fishList) {
            result.add(fish.getStatus());
        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int result = 0;
        for (Fish fish : fishList) {
            if (fish.hasMemoryLoss()) {
                result++;
            }
        }
        return result;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish fish : fishList) {
            if (fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = fishList.get(0);
        for (Fish fish : fishList) {
            if (fish.getWeight() < smallestFish.getWeight()) {
                smallestFish = fish;
            }
        }
        return smallestFish;
    }

}
