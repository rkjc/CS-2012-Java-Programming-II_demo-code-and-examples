package enumpractice;

import enumpractice.SpaceShip.ShipColor;

public class VehicleTestMain {

	public static void main(String[] args) {
		
		SpaceShip moonzero = new SpaceShip(ShipColor.MABEV);
		SpaceShip goldenglob = new SpaceShip(ShipColor.FLEEM);
		
		
		System.out.println("color " + moonzero.getColor() );
		
		System.out.println("class= " + (moonzero.getColor()).getClass() );
		
		
		
		
		
		
		
		
		//System.out.println("you have ordered your new Space Ship in the color " + moonzero.getColor() );
		
		//System.out.println("additional cost due to color: " + moonzero.getColorCost());
		
		//System.out.println("additional cost due to color: " + goldenglob.getColorCost());
	}

}
