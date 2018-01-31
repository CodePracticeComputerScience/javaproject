package javaproject;

import java.util.ArrayList;

public class Mot2 {
	ArrayList<String>  generator(int n) {
		//TODO 
		ArrayList<String> result = new ArrayList<String>();
		if(n==0) {
			result.add("leaf");
			return result;
		}
		
		ArrayList<String> nodes = generator(n-1);
		for(String node: nodes) {
			result.add("unary(" + node + ")");
		}
		for(int k = 0;k < n-2;k++) {
			ArrayList<String> nodes1 = generator(k);
			   for(String node1: nodes1) {
				ArrayList<String> nodes2 =generator(n-2-k);
				for(String node2: nodes2) {
					result.add("binary(" + node1 + "," + node2 + ")");
		//return result;
				}
			}
		}
		return nodes;
		
	}
	
	
	
	
	
	public static void main() {
		Mot2 m = new Mot2();
		for(int i = 0;i<6;i++)	{
				m.generator(6);
		}
	}

}


//ArrayList<String> mot2(int n){
//ArrayList<String> result = new ArrayList<String>();
//if(n == 0) {
//	 result.add("leaf");
//	 return result;
//}
//ArrayList<String> nodes = mot2(n-1);
//for(String node: nodes) {
//	 result.add("unary(" + node + ")");
//}
//
//}
//}
//}