package marathon.Shop.dao;


import marathon.Shop.models.Computer;

public interface Shop {
    boolean addItem(Computer item); //класс и тип переменной
    Computer removeItem(int id);
    Computer findItem(int id);
    int  quantity();
    double totalPreis();
    void printItems();
    Computer[] findItemMoreThen(int preis);
    Computer[] findItemsWeightBetween(int minPreis, int maxPreis);
}

