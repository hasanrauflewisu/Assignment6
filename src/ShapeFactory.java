///
//   ShapeFactory   shape factory base class , which instantiates Cookie or Cake class given the input
/// 
public class ShapeFactory {

	 //use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("COOKIE")){
	         return new CookieShape();
	         
	      } else if(shapeType.equalsIgnoreCase("CAKE")){
	         return new CakeShape();
	         
	      } 
	      
	      return null;
	   }
	   
	   public Bake getBake(String bakeType, int bakeQuantity, int bakeSize, String flavor, String decoration, String filling) {
	      if(bakeType == null){
		         return null;
		      }		
		      if(bakeType.equalsIgnoreCase("COOKIE")){
		         return new Cookie(bakeQuantity, bakeSize, flavor, decoration);
		         
		      } else if(bakeType.equalsIgnoreCase("CAKE")){
		         return new Cake(bakeQuantity, bakeSize, flavor, decoration, filling);
		         
		      } 
		      
		      return null;
	   }

}
