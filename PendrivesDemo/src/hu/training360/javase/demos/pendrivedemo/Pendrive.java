package hu.training360.javase.demos.pendrivedemo;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        this.price = this.price + (this.price * percent / 100);
    }

    public boolean cheaperThan(Pendrive pendrive) {

      return(price<pendrive.price);
   }
    public int comparePricePerCapaccity(Pendrive pendrive){

         int rres = 0;
        double ppc1 = price / capacity;
        double ppc2 = pendrive.getPrice() / pendrive.capacity;

            if (ppc1>ppc2 ){
                rres = 1;
            }
        if (ppc1< ppc2 ){
            rres = -1;
        }



        return rres;
    }
}
