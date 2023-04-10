package cloneableDeepCopy;

import java.util.ArrayList;

public class ClonableMyDataClassAndColorClassMain { 

	public static void main(String[] args) throws CloneNotSupportedException {
		
		MyDataClass data1 = new MyDataClass("zondar", "red");
		
		System.out.println("------------------------------------");
		
		System.out.println("data1 => " + data1.toString());
		
		MyDataClass data2;
		MyDataClass data3;
				
		data2 = data1; 
		
		data3 =  data1.clone() ;  // Using the .clone() method
		//data3 =  new MyDataClass(data1); 
		
		System.out.println("arrData2 == arrData1 is " + (data2 == data1));
		System.out.println("arrData3 == arrData1 is " + (data3 == data1));
		
		System.out.println("data2 => " + data2.toString());
		System.out.println("data3 => " + data3.toString());
			
		System.out.println("------------------------------------");

		System.out.println("change int value in data1 =>   data1.intVal = xxxeeeoh");
		//data1.name = "xxxeeeoh";
		data1.setName("blarrg");
		
		System.out.println("data1 => " + data1.toString());	
		System.out.println("data2 => " + data2.toString());
		System.out.println("data3 => " + data3.toString());
		
		System.out.println("------------------------------------");
		
//		System.out.println("change int value in data2 =>   data2.intVal = blat");
//		data1.name = "blat";
//		
//		System.out.println("data1 => " + data1.toString());	
//		System.out.println("data2 => " + data2.toString());
//		//System.out.println("data3 => " + data3.toString());
//		
		System.out.println("------------------------------------");
		
		
		//System.out.println("change color value in data1 =>   data1.color.color = orange");
		
		//data1.color.color = "orange";
		System.out.println("change color value in data1 =>   data1.getColor().setColor(\"violet\")");
		data1.getColor().setColor("violet");
		
		System.out.println("data1 => " + data1.toString());	
		System.out.println("data2 => " + data2.toString());
		System.out.println("data3 => " + data3.toString());
		
		System.out.println("------------------------------------");

	}
	
	// ---------------- Methods -----------------------
	
//		public static void printArray(String name, MyDataClass datrrr) {
//			//System.out.println("------------------------------------");
//			System.out.print(name + " => ");
//			for (MyDataClass zork : datrrr) {
//				System.out.print(zork.intVal + " ");
//			}
//			System.out.println();
//		}

}
