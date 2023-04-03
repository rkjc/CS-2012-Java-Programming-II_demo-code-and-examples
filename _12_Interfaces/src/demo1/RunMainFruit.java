package demo1;

import java.util.ArrayList;

public class RunMainFruit {

	public static void main(String[] args) {
		System.out.println("--working--");
		
		Object xoor = new Object();
		
		int[] innts1 = new int[2]; 
		innts1[0] = 76;
		
		int[] innts2 =  new int[2];
		innts2[0] = 9999;
		
		System.out.println(innts1[0] + "  " + innts2[0]);
		
		//innts1 = innts2; //shallow copy
		
		//deep copy
		for(int i = 0; i < 2; i++) {
			innts1[i] = innts2[i];
		}
		
		System.out.println(innts1[0] + "  " + innts2[0]);
		
		innts2[0] = 1001;
		
		System.out.println(innts1[0] + "  " + innts2[0]);
		
		
		
		
		
		
		Peyote bob = new Peyote();
		
		
//		for(int i = 0; i < fruitArr.size(); i++) {
//			System.out.println(fruitArr.get(i));
//		}
		
		//fruitArr.sort(null);
		
		ArrayList<Fruit> fruitArr = new ArrayList<Fruit>();
		
		Apple app = new Apple();		
		Orange orr = new Orange();	
		Lemon lmm = new Lemon();
				
		fruitArr.add(lmm);
		fruitArr.add(app);
		fruitArr.add(orr);
	}

}




