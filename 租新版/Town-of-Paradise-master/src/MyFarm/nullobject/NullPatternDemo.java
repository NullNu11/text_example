package MyFarm.nullobject;

public class NullPatternDemo {
    //4��ʹ�õ������д������࣬���ڴ��ݵĲ�Ʒ���֣���ȡRealProduct��NullProduct����
    public static void FindProducts(String[] args) {
        ProductFactory pf = new ProductFactory();
        AbstractProduct Product1 = pf.getProduct("Pig1");
        AbstractProduct Product2 = pf.getProduct("Pig2");
        AbstractProduct Product3 = pf.getProduct("Crop1");
        AbstractProduct Product4 = pf.getProduct("Dog1");
        AbstractProduct Product5 = pf.getProduct("Dog2");

        System.out.println("Products List");
        System.out.println(Product1.getName());
        System.out.println(Product2.getName());
        System.out.println(Product3.getName());
        System.out.println(Product4.getName());
        System.out.println(Product5.getName());
    }
}
