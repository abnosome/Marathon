package marathon.Shop.models;

import marathon.Shop.dao.Shop;

public class Computer  {
    private String cpu;
    private int ram;
    private int hdd;
    private String brand;
    private int Strichcode;

    public Computer(String cpu, int ram, int hdd, String brand, int strichcode) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
        Strichcode = strichcode;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStrichcode() {
        return Strichcode;
    }

    public void setStrichcode(int strichcode) {
        Strichcode = strichcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        return Strichcode == computer.Strichcode;
    }

    @Override
    public int hashCode() {
        return Strichcode;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", brand='" + brand + '\'' +
                ", Strichcode=" + Strichcode +
                '}';
    }
}
