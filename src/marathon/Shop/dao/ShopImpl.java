package marathon.Shop.dao;

import marathon.Shop.models.Computer;
import marathon.library.model.Book;

public class ShopImpl implements Shop {
    private Computer[] items; //
    private int size; //current quantity

    public ShopImpl(int capacity){

        items = new Computer[capacity];
    }

    @Override
    public boolean addItem(Computer computer) {

        if(computer == null ||size == items.length || findItem(computer.getStrichcode())!= null){
            return false;
        }
        items[size]=computer;
        size++;
        return false;
    }

    @Override
    public Computer removeItem(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getStrichcode() == id) { //id is concured
                Computer victim = items[i];
                items[i] = items[size - 1];
                items[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Computer findItem(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getStrichcode()==id){
                return items[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {

        return quantity();
    }

    @Override
    public double totalPreis() {

        return 0;
    }

    @Override
    public void printItems() {

            for (int i = 0; i < size; i++) {
                System.out.println(items[i]);
            }
    }

    @Override
    public Computer[] findItemMoreThen(int preis) {

        return new Computer[0];
    }

    @Override
    public Computer[] findItemsWeightBetween(int minPreis, int maxPreis) {

        return new Computer[0];
    }
}
