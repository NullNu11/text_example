package MyFarm.menu;

import MyFarm.plants.BasePlant;

import java.util.ArrayList;
import java.util.List;

public class PlantMenu extends BaseMenu {
    public List<BasePlant> Plants;

    public PlantMenu() {
        Plants = new ArrayList<BasePlant>();
    }

    /**
     * Adds an Plant into the group
     *
     * @param Plant The Plant to be added
     */
    public void addPlant(BasePlant Plant) {
        Plants.add(Plant);
    }

    /**
     * Return the Plant in the Plant list by index
     *
     * @param index The index of the Plant
     * @return The Plant in the list
     */
    public BasePlant getPlant(int index) {
        return Plants.get(index);
    }

    /**
     * Remove the Plant in the Plant list by index
     *
     * @param index The index of the Plant
     */
    public void removePlant(int index) {
        Plants.remove(index);
    }

    /**
     * Remove the Plant in the Plant list
     *
     * @param Plant The Plant you want to remove
     */
    public void removePlant(BasePlant Plant) {
        Plants.remove(Plant);
    }

    /**
     * Get the size of the group
     *
     * @return The size of the group
     */
    public int size() {
        return Plants.size();
    }

    public  void memo(){Plants.remove(Plants.size()-1);}

    public void displayInfo(){
        for(int i=0;i<Plants.size();++i)
        {
        System.out.println(Plants.get(i).getName());
        }
    }

    /**
     * Get a iterator of plant list
     * @return A iterator
     */

}