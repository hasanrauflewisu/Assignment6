///
//   Cookie Class inherits from the Bake Base class
///
public class Cookie implements Bake {
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public CookieEnum getBoxSize() {
		return boxSize;
	}

	public void setBoxSize(CookieEnum boxSize) {
		this.boxSize = boxSize;
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int count;
	public CookieEnum boxSize;
	public String decoration;
	public String flavor;
	
	public Cookie() {
		this(1,0,"chocolate chip","smilie");
	}
	
	public Cookie(int count, int boxSize, String flavor, String decoration) {
		setCount(count);
		setBoxSize(CookieEnum.values()[boxSize]);
		setFlavor(flavor);
		setDecoration(decoration);
	}

	   @Override
	   public void bake_350degrees() {
	      System.out.println("Dough Shape Type: Cookie");
	   }
   
	  public void print() {
		  System.out.println(toString());
	  }
   
	  public String toString() {
		  return(count +" "+ boxSize.toString() +" of "+flavor+" cookies with a "+ decoration +" decoration.");
	  }
}
