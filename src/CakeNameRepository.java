import java.util.Arrays;
///
// Implementing CakeName Class which implements the Container interface,  the inner class NameIterator implements the Iterator interface
///
public class CakeNameRepository implements Container{
	public String names[] = {"vanilla", "chocolate"};
	public String fillings[] = {"chocolate", "vanilla"};
	public String decorations[] = {"flower", "birthday"};
	@Override
	public Iterator getIterator() {
		return new CakeNameIterator();
	}
	
	private class CakeNameIterator implements Iterator {
		int index;
		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
		   if (this.hasNext()) {
			   return names[index++];
		   }
		   return null;
		}		
	}
	
	public Cake GenerateCake(int quantity, int size, String type, String filling, String decoration) {
		if(CakeEnum.values().length <= size || size < 0) {
			System.out.println("Cakes not made in that size");
			return null;
		}
		if(!Arrays.asList(names).contains(type.toLowerCase())) {
			System.out.println("No "+type+" cakes found");
			return null;
		}
		if(!Arrays.asList(fillings).contains(filling.toLowerCase())) {
			System.out.println("No "+filling+" filling found");
			return null;
		}
		if(!Arrays.asList(decorations).contains(decoration)) {
			System.out.println("No "+decoration+" decoration found");
			return null;
		}
		ShapeFactory sf = new ShapeFactory();
		Cake toReturn = (Cake) sf.getBake("CAKE", quantity, size, type, decoration, filling);
		return toReturn;
	}
	
}
