//Code to find the element that appears only once in an array..
import java.util.Scanner;
class A{
	public static void main(String args[]){
		int array[] = {1,3,-11,-11,5,2,7,2,3,5,1};
		int result = 0;
		for(int i=0;i<array.length;i++){
			result = result ^ array[i];
		}
		System.out.println("The unique element is: "+result);
	}
}