package jobsheet;

public class ticket23 {

    String airlines, destination, origin;
    int price;

    ticket23(String a, String dest, String origin, int price) {
        this.airlines = a;
        this.destination = dest;
        this.origin = origin;
        this.price = price;
    }

    void print() {
        System.out.printf("%-30s | %-40s | %-30s | %-10s%n", airlines, destination, origin, price);
    }
}

