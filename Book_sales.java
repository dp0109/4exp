// File: Book_sales.java

public class Book_sales {
    private String salerName;
    private int numberOfSales;
    private String salerId;

    public Book_sales(String salerName, int numberOfSales, String salerId) {
        this.salerName = salerName;
        this.numberOfSales = numberOfSales;
        this.salerId = salerId;
    }

    public void displaySales() {
        System.out.println("Saler Name: " + salerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Saler ID: " + salerId);
    }

    public static void main(String[] args) {
        Book_sales sale = new Book_sales("John Doe", 120, "S123");
        sale.displaySales();
    }
}
