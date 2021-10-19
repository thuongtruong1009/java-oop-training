package thuongtruong1009;
/*
 * @author https://github.com/thuongtruong1009
 */
public class Box {
	protected int width;
	protected int height;
	private static final Box INSTANCE = new Box(30, 10);
	
	private Box(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public static Box getInstance() {
		return INSTANCE;
	}
}
