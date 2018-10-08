
public enum CakeEnum {
	smallCake,
	largeCake;
	
	@Override
	public String toString() {
		switch(this) {
			case smallCake : return "small sized";
			case largeCake : return "large sized";
			default : throw new IllegalArgumentException();
		}
	}
}
