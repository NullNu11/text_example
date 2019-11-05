package MyFarm.animals;

import MyFarm.animalState.FullState;
import MyFarm.creature.Creature;

public class Duck extends BaseAnimal {

    public Duck() {

        this.isSaled = false;
        this.isMature = false;
        this.appetite = 3;
        this.value = 1;
        this.name = "Duck";

    }

    public double cost() {
        return this.value;
    }


    public Creature clone() {
        return new Duck();
    }

    public String getName() {
        return this.name;
    }

    public void timeChange(int currentTime) {
        if (lastSupplyTime > currentTime) {
            if (currentTime + 24 - lastSupplyTime > 5) {
                // 鸭子饿了
                state.getHungry(this);
            } else {
                state.gainExperience(this);
            }
        } else {
            if (currentTime - lastSupplyTime > 5) {

                state.getHungry(this);
                System.out.println("Pig becomes hungry");
            } else {
                state.gainExperience(this);
            }
        }
        if (this.experience >= 144) {
            this.isMature = true;
        }
    }


    // 喂食重写-猫
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    public void add() {
        System.out.println("鸭子");
    }

    public void tick() {

    }

    @Override
    public void attribute() {

    }
}
