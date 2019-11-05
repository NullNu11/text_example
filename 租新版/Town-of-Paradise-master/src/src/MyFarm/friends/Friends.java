package MyFarm.friends;

import MyFarm.visitor.MyVisitor;

public class Friends implements MyAccept {
    public int size;
    MyAccept[] myAccepts;

    public Friends() {
        myAccepts = new MyAccept[]{
                new Man("张三", 23),
                new Woman("张丽", 27)
        };
    }

    @Override
    public void accept(MyVisitor myVisitor) {
        myVisitor.visit(this);
    }
}
