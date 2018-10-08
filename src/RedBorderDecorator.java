///
//  RedBorder Decorator Extends base BorderDecorator class
///
public class RedBorderDecorator extends BorderDecorator {

   public RedBorderDecorator(Bake mdecoratedBorder) {
      super(mdecoratedBorder);		
   }

   @Override
   public void bake_350degrees() {
	   decoratedBorder.bake_350degrees();	       
      setRedBorder(decoratedBorder);
   }

   private void setRedBorder(Bake decoratedShape){
      System.out.println("Border Color: Red");
   }
}