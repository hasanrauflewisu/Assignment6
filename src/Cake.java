///
//   Cake  Base class inherites bake base class
///
public class Cake implements Bake {
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CakeEnum getSize() {
		return size;
	}

	public void setSize(CakeEnum size) {
		this.size = size;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getFilling() {
		return filling;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int quantity;
	public String type;
	public CakeEnum size;
	public String border;
	public String filling;
	
	public Cake() {
		this(1,0,"vanilla","flower","chocolate");
	}
	
	public Cake(int quantity, int size, String type, String border, String filling) {
		setQuantity(quantity);
		setSize(CakeEnum.values()[size]);
		setType(type);
		setBorder(border);
		setFilling(filling);
	}
	
	  @Override
	   public void bake_350degrees() {
	      System.out.println("Dough Shape Type: Cake");
	   }
	  
	  public void print() {
		  System.out.println(toString());
	  }
	  
	  public String toString() {
		  return(quantity +" " + size.toString()+" "+ type +" cake with a "+ border +" border and "+ filling +" filling.");
	  }

}
