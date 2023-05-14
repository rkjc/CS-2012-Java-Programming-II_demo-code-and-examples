package enumpractice;

public class SpaceShip extends Vehicle{

	public enum ShipColor {
	    BLERG, MABEV, TULLOP, FLEEM
	}  
	
	private ShipColor sc;
	
	public SpaceShip(ShipColor inclr) {
		sc = inclr;
	}
	
	@Override
	public ShipColor getColor() {
		return sc;
	}
	
	public double getColorCost() {
		if(sc == ShipColor.BLERG) {
			return 0.0;
		} else if(sc == ShipColor.MABEV) {
			return 23.0;
		} else if(sc == ShipColor.TULLOP) {
			return 199.00;
		} else {
			return 23000.02;
		}
		
	}
	
}


