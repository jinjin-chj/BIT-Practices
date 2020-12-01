
public class RecMain {

	public static void main(String[] args) {
		// Rectangle Main 
		Rectangle rec = new Rectangle();
		rec.setHeight(10);
		rec.setWidth(10);
		
		System.out.println("사각형 넓이: " + rec.getArea());
		
		//
		rec.setHeight(5);
		rec.setWidth(5);
		
		System.out.println("사각형 넓이: " + rec.getArea());
		
		//
		Rectangle rec2 = new Rectangle();
		rec2.setHeight(25);
		rec2.setWidth(5);
		
		System.out.println("사각형 넓이: " + rec2.getArea());

	}

}
