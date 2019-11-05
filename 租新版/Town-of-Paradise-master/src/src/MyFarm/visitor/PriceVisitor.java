package MyFarm.visitor;

import MyFarm.friends.Friends;
import MyFarm.friends.Man;
import MyFarm.friends.Woman;

public class PriceVisitor implements MyVisitor {


    @Override
    public void visit(Friends friends) {


    }

    @Override
    public void visit(Man man) {
        System.out.println("男性的年龄为" + man.age);
    }

    @Override
    public void visit(Woman woman) {
        System.out.println("女性的名称为" + woman.age);
    }
}
