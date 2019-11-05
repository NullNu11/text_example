package MyFarm.NullObject;

public class RealProduct extends AbstractProduct {
    //2��������չ�����������ʵ����
    public RealProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}