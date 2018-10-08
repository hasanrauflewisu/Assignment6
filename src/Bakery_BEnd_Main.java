
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Bakery_BEnd_Main {
	
	
	
	//create an object of SingleObject
	   private static Bakery_BEnd_Main instance = new Bakery_BEnd_Main();
	   private static HashMap<Integer, String> BakeryOrders =  new HashMap<Integer, String>();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Bakery_BEnd_Main(){}

	   //Get the only object available
	   public static Bakery_BEnd_Main getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Bakery BEEnd Main Class!");
	   }
	   
	   public void addOrders(Integer ordernumber, String orderString)
	   {
		   BakeryOrders.put(ordernumber, orderString);
	   }
	   
	   public void removeOrder(Integer ordernumber)
	   {
		   
	   }
	   public void updateOrder(Integer ordernumber)
	   {
		   
	   }
	   public void displayOrders()
	   {
		 
		   Set set = BakeryOrders.entrySet();
		  java.util.Iterator iterator =  set.iterator();
		  
		   while(iterator.hasNext()) {
			   Map.Entry mentry = (Map.Entry)iterator.next();
			   
			   System.out.println("Order Number is : " + mentry.getKey() + " & Order Details are : " + mentry.getValue());
		   }
		   
	   }
	 
	   public void displayOrder( Integer ordernumber)
	   {
		   if ( BakeryOrders.containsKey(ordernumber) ) {
			   
			   String orderDetails =  BakeryOrders.get(ordernumber );
			   System.out.println("Details for the Order: " + ordernumber.toString() + " Order is : " + orderDetails);
			   
		   } else {

			   System.out.println("ordernumber " + ordernumber + "doesnot exists");
		   }
		   
	   }


}
