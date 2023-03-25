public class Vehicle extends TaxableItem {
   
    //declares P.I.Vs to use in class
   private double c, m;
   
   //creates a constructor that takes 3 parameters
   public Vehicle(double cost, double markup, double taxRate)
   {
      //call to super
      super(cost + markup,taxRate);
      c = cost;
      m = markup;
   }
   
   //method that allows for a change of the dealer markup
   public void changeMarkup(double num) {
      super.changeListPrice(c + num);
      m = num;
   }
}