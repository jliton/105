package interview;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;


public class ReserseArray {
	public static void main(String[] args) {
		
	
	String[] assetClasses = {"bond", "equity", "gold", "real estate"};
    System.out.println("Array before reversing: " + Arrays.toString(assetClasses));
    ArrayUtils.reverse(assetClasses);
    System.out.println("Array after reversing: " + Arrays.toString(assetClasses));
		
	}
	//another way to reverse Array is to swap in half way of rray
//	for(int i=0; i<array.length/2; i++){
//		  int temp = array[i];
//		  array[i] = array[array.length -i -1];
//		  array[array.length -i -1] = temp;
//		}

}
