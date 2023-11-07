package marathon.Shop.models;

public class Notebook extends Computer {
    private String display;
    private int batteryCapacity;
    private double weight;

    public Notebook(String cpu, int ram, int hdd, String brand, int strichcode,String display, int batteryCapacity, double weight) {
        super(cpu, ram, hdd, brand, strichcode);
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        super.toString();
        return "Notebook{" +
                "display='" + display + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                '}'+ super.toString();
    }
}
