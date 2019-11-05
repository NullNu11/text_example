/**
 *
 */
package MyFarm.farmland;

import MyFarm.creature.Creature;

public class FarmLand extends BaseLand {
    /**
     *
     * @param creature
     */
    public void addCreature(Creature creature) {

    }

    public void showCrop() {
        System.out.println("该土地种下了");
        creature.add();
    }

    public BaseLand clone() {
        return null;
    }
}
