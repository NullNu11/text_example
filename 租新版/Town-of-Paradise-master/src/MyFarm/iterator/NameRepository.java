package MyFarm.iterator;

import MyFarm.menu.BaseMenu;

public class NameRepository implements Container {
    //2������ʵ����Container�ӿڵ�ʵ���࣬������ʵ����Iterator�ӿڵ��ڲ���
    BaseMenu basemenu;
    String[] product_names = getString();

    public String[] getString() {
        int size = BaseMenu.creatures.size();
        String[] names = new String[10];
        for (int i = 0; i < size; i++) {
            names[i] = BaseMenu.creatures.get(i).name;
        }
        return names;
    }

    //String[] product_names = {"Pig1","Pig2","Dog1"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < product_names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return product_names[index++];
            }
            return null;
        }
    }
}