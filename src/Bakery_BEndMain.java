///
//  The main Baker Program  illustrating the three design patterns
//  Decorator
//  Factory
//  Command
//  in the Command Pattern, all the above methods were used. 
/// State Pattern -  09/30/2018


public class Bakery_BEndMain {
	 public static void main(String[] args) 
	 {
		 System.out.println("\n Hassan Bakery  -  Java Main Program \n");
		 Bakery_BEnd_Main mBakery_BEnd_Main = Bakery_BEnd_Main.getInstance();
		 
		 mBakery_BEnd_Main.showMessage();
		 
		 mBakery_BEnd_Main.addOrders(1234, "1234:Fazil, 732244356 : 1,0,0,0,1 : 2,1,1,1,1");
		 mBakery_BEnd_Main.addOrders(1235, "1235:Imran, 732244357 : 0,0,0,0,0 : 5,1,1,1,1");
		 
		 mBakery_BEnd_Main.displayOrders();
		 mBakery_BEnd_Main.displayOrder(1234);
		 
		 //////////////////////////////////////////////
		 
		 testJavaPattern();
	 }
	 
	 
	 
	 ///-------------------------------  Design Pattern Test Code --------------------------------//
	 public static void testJavaPattern() {
		 System.out.println("\n Assignment  One -  Decorator Pattern \n");
		 //Instantiate a new Cookie Object with no decoration
	      Bake cookie = new Cookie();
	      
	      Cake cake = new Cake();

	      // instantiate a new Cookie Object with Red Border Baked using bake Decorator
	      Bake cookiewreddeco = new RedBorderDecorator(new Cookie());

	      // instantiate a new Cake Object with Red Border Baked using bake Decorator
	      Bake cakewreddeco = new RedBorderDecorator(new Cake());
	      
	      
	      System.out.println("Bake Cookie in 350degrees with normal border");
	      cookie.bake_350degrees();

	      System.out.println("\nCookie is Baked 350 degrees with red border");
	      cookiewreddeco.bake_350degrees();

	      System.out.println("\nBake Cake in 350degrees with normal border");
	      cake.bake_350degrees();
	      
	      System.out.println("\nCake is baked 350 degrees with red border");
	      cakewreddeco.bake_350degrees();
	      
	      ///
	      //
	      //  Factory Pattern Illustration using Cake and Cookie Baking Example  Assignment 2
	      //
	      ///
	      System.out.println("\n\n\n Assignment  Two  - Factory Pattern \n\n");
	      ShapeFactory shapeFactory = new ShapeFactory();
	      //get an instantiated object of CookieShape Dough
	      Shape CookieShape  = shapeFactory.getShape("COOKIE");
	      //call bake method of CookieShape
	      CookieShape.bake();
	      
	      System.out.println("\n\n");
	      Shape CakeShape  = shapeFactory.getShape("CAKE");
	      //call bake method of CookieShape
	      CakeShape.bake();
	      
	      
	      ///
	      //
	      //  Command Pattern Illustration using Cake and Cookie Baking Example and regulating the GE Oven : Assignment 3
	      //
	      ///
	      
	      System.out.println("\n\n\n Assignment  Three  - Command Pattern \n\n");
	      
	      Bakery_Appliances bakery_Appliances =  new Bakery_Appliances();
	      SwitchOnOven switchOnOven = new SwitchOnOven(bakery_Appliances);
	      SwitchOffOven switchOffOven = new SwitchOffOven(bakery_Appliances);
	      
	      BakingOvenRegulate bakingOvenRegulate = new BakingOvenRegulate();
	      bakingOvenRegulate.takeCommand(switchOffOven);
	      bakingOvenRegulate.executeCommands();
	      
	      bakingOvenRegulate.takeCommand(switchOnOven);
	      bakingOvenRegulate.executeCommands();
	      
	      CookieShape.bake();
	      CakeShape.bake();
	      
	      System.out.println("\nBake Cake in 350degrees with normal border, Oven is On");
	      cake.bake_350degrees();
	      
	      System.out.println("\nCake is baked 350 degrees with red border, Oven is On");
	      cakewreddeco.bake_350degrees();
	      
	      bakingOvenRegulate.takeCommand(switchOffOven);
	      bakingOvenRegulate.executeCommands();
	      
	      
	      ///
	      // Iterator Pattern Illustrating the type of cookies and cakes  to be used in the project: Assignment 4
	      System.out.println("\n\n\n Assignment  Four  - Iterator Pattern \n\n");
	      System.out.println("\n Cake Names \n\n");
	      
	      CakeNameRepository cakeNameRepository = new CakeNameRepository();
	      CookieNameRepository cookieNameRepository = new CookieNameRepository();
	      
	      for(Iterator iter = cakeNameRepository.getIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Cake Name : " + name);
	       }
	      
	      System.out.println("\n Cookie Names \n\n");
	      for(Iterator iter = cookieNameRepository.getIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Cookie Name : " + name);
	      }
	      ///
	      //  State Pattern Illustrated by GE Oven State before it is being fired 
	      ///
	      System.out.println("\n\n\n Assignment  Five  - State Pattern \n\n");
	      GEOvenContext  gEOvenContext = new GEOvenContext();
	      
	      OvenStartState  ovenStartState = new OvenStartState();
	      ovenStartState.findGEOven_State(gEOvenContext);
	      
	      System.out.println(gEOvenContext.getGEOvenState().toString());
	      
	      System.out.println("\n\n");
	      OvenStopState  ovenStopState = new OvenStopState();
	      ovenStopState.findGEOven_State(gEOvenContext);
	      
	      System.out.println(gEOvenContext.getGEOvenState().toString());
	      
	      ///
	      //  Proxy Pattern Illustration by showing reading file from sqllite database to the hash map and vice versa
	      ///
	      System.out.println("\n\n\n Assignment  Six  - Proxy Pattern \n\n");
	      
	      SqlLiteFile mSqlLiteFile = new LoadSqlData_ToHashTable("ordes_customers.db");
	      //load sql data to hash table
	      mSqlLiteFile.up_down_load_orders_customer_info();
	      System.out.println("-------------------");
	      
	      // sql data will not be loaded from the hash table
	      mSqlLiteFile.up_down_load_orders_customer_info();
	 }
	 
	 public static void testOrderString() {
		 BakeryOrders bakeOrders = BakeryOrders.getInstance();		 
		 
		 String testOrder = "Test Order:1:1:cookie:0:smilie:2:cake:1:birthday";
		 OrderStringReader.readOrderString(testOrder, bakeOrders);

		 bakeOrders.PrintAllOrders();

	   }
}
