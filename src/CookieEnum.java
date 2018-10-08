
public enum CookieEnum {
	boxOf8,
	boxOf16;
	
	@Override
	public String toString() {
		switch (this){
			case boxOf8: return "8-count box";
			case boxOf16: return "16-count box";
			default: throw new IllegalArgumentException();
		}
	}
}
