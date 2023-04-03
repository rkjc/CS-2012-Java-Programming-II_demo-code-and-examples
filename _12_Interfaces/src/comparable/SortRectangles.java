package comparable;

public class SortRectangles {
	  public static void main(String[] args) {
		  

	    Rectangle[] rectangles = {
	  	      new Rectangle(3.4, 5.4), 
	  	      new Rectangle(13.24, 55.4),
	  	      new Rectangle(7.4, 35.4),
	  	      new Rectangle(1.4, 25.4)		  	      
	    	};
 
	    for (Rectangle rectangle: rectangles) {
		      System.out.print(rectangle + " "); 
		      System.out.println();
		    }
	    System.out.print("------------------------\n");
	    
	    java.util.Arrays.sort(rectangles);
	    
	    for (Rectangle rectangle: rectangles) {
	      System.out.print(rectangle + " "); 
	      System.out.println();
	    }
	  }
	}
