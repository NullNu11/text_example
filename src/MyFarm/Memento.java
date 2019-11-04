package MyFarm;

public class Memento {
    public int num=0;
    public int foodCourt = 100;  // 初始食槽有100食物
    public void setnum(int num){this.num=num;}
    public int getstate(){return foodCourt;}

    public void displayInfo(int num){System.out.println("种子的数目为"+num);}

}

