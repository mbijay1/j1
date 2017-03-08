// RetailItem- abstract superclass


 //Abstract superclass for RetailItem  hierarchy

public abstract class RetailItem{
  
  protected String name;
  

 //Initializes RetailItem data  
  public RetailItem(String name) {
    
      this.name = name;
  }

 //Returns name of RetailItem 
   
  public final String getName() {
    return name;
  }

 // Returns cost of RetailItem 
  public abstract int getCost();

}
   
  
  
   
   
