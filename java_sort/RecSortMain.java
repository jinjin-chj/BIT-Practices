package java_sort;

public class RecSortMain {

	public static void main(String[] args) {
		Rectangle recArr = (new Rectangle(6,6));
		
		Rectangle.getSortingRec(recArr);
		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
			
		}

	}

}
