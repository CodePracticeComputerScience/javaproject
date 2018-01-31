package javaproject;

import java.util.ArrayList;

public class Mot2 {

	public ArrayList<String> generator(int n) {
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
			ArrayList<String> nodes2 =generator(n-2-k);
			   for(String node1: nodes1) {
				for(String node2: nodes2) {
					result.add("binary(" + node1 + "," + node2 + ")");
				}
			}
		}
		return result;
		
	}
	
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		Mot2 m = new Mot2();
		for(int i = 0;i<6;i++)	{
				al = m.generator(i);
				System.out.println(al.toString());
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