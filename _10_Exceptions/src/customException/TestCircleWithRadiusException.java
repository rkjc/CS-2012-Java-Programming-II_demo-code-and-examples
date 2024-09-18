package customException;

public class TestCircleWithRadiusException {

  public static void main(String[] args) throws Exception {
	  
		System.out.println("running -> TestCircleWithRadiusException");
	  
    try {
      CircleWithRadiusException c1 = new CircleWithRadiusException(-2);
      
      CircleWithRadiusException c3 = new CircleWithRadiusException(0);
      c1.setRadius(-5);
    }
    catch (InvalidRadiusException ex) {
      System.out.println(ex);
    }

    
    System.out.println("Number of objects created: " +
      CircleWithRadiusException.getNumberOfObjects());
    
    
  }
}
