package day15;

import java.util.ArrayList;

public class MainClass04 {
public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>();

	for(int i=0;i<5;i++) {
	double ran = Math.random();
	int num = (int)(ran*4)+10;
		arr.add(num);
	}
	System.out.println(arr);
}
}
