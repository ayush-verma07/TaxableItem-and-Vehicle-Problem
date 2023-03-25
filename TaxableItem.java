public class TaxableItem {
    
    //Creates P.I.Vs needed to implement methods
    private double taxRate;
    private double listPrice;

    //constructor that takes two paramaters and intializes the P.I.Vs
    public TaxableItem(double list, double rate) {
        listPrice = list;
        taxRate = rate;
    }

    //method which allows to change the list price
    public void changeListPrice(double list) {
        listPrice = list;
    }

    // returns the price of the item including tax
    public double purchasePrice() {
        double tax = listPrice * (taxRate/100);
        return listPrice + tax;
    }
}