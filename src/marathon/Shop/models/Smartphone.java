package marathon.Shop.models;

public class Smartphone extends Notebook{
    private int imai;
    private double thickness;

    public Smartphone(String cpu, int ram, int hdd, String brand, int strichcode, String display, int batteryCapacity, double weight,int imai,double thickness) {
        super(cpu, ram, hdd, brand, strichcode, display, batteryCapacity, weight);
        this.imai = imai;
        this.thickness = thickness;
    }

    public int getImai() {
        return imai;
    }

    public void setImai(int imai) {
        this.imai = imai;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imai=" + imai +
                ", thickness=" + thickness +
                '}'+super.toString();
    }
}
