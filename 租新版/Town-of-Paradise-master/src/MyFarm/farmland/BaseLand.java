/**
 * 表示农场所有的养动物、种植的空间
 * 空间需要靠 clone 来复制，实现原型模式？
 */
package MyFarm.farmland;

import MyFarm.creature.Creature;

import java.io.Serializable;

public abstract class BaseLand implements Serializable {
    protected Creature creature;//作物

    public void plant(Creature _creature) {
        this.creature = _creature;

    }

    //显示该土地的作物
    public abstract void showCrop();

    // 通过 clone 来复制对象
    protected abstract BaseLand clone();
}
