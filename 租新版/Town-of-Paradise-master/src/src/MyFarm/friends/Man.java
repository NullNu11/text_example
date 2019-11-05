package MyFarm.friends;

import MyFarm.visitor.MyVisitor;

public class Man implements MyAccept {
    public String name;
    public int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void accept(MyVisitor myVisitor) {
        myVisitor.visit(this);
    }
}
