import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Color;

import util.Basket;
import util.Ball;

public class Main {

	public static void main(String[] args){
		Math(1,1);
		Coordinates(-7,-3);
		TableTan(1,10,2);
		int[] array = {5,7,0,4,8};
		NumPrime(array);
		NumberOfElementsToThrowAway(array);
		double[] array1 = {5,7,2,4,8};
		Matrix(array1);
		Sort(array);
		PrintLocationInsert(new int[]{1,2,3,3,4,4,5,5,11}, new int[]{-1,3,4,4,5,5,5,6,7,7,9,9,9});
		ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
				new Ball(Color.BLACK, 0.3),
				new Ball(Color.BLUE, 0.5),
				new Ball(Color.BLUE, 0.2),
				new Ball(Color.GRAY, 0.2),
				new Ball(Color.GREEN, 0.2)
				));
		
		Basket basket = new Basket(balls);
		System.out.print("The weight of the balls is " + basket.BallWeight() +
				". Number of blue balls " + basket.NumberOfBlueBalls() + ".");

	}
	
	//Task_1 --------------------------------------------------------------------------------------------
		
	public static void Math(double x, double y){
		double result = (1 + Math.pow(Math.sin(x + y),2)) / 
		(2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) 
		* Math.pow(y, 2)))) + x;
		System.out.println(result);
	}
	
	//Task_2 --------------------------------------------------------------------------------------------
		
	public static void Coordinates(double x , double y){
		boolean result = false;
			
		if ((x >= -4) && (x <= 4)){
			if ((y >= 0) && (y <= 5)){
				result = true;
			}
				
		}
			else{
				if ((x >= -6) && (x <= 6)) {
					if ((y >= -3) && (y <= 0)){
						result = true;
					}
				}
				
			}
		System.out.println(result);
		}
	
	//Task_3 --------------------------------------------------------------------------------------------
		
	public static void TableTan(double a, double b, double h) {
		double result;
		System.out.println("--------------------------");
			
		while (a <= b) {
			result = Math.tan(a);
			System.out.println(a + " | " + result);
			System.out.println("--------------------------");
			a += h;
		}		
	}
		
	//Task_4 --------------------------------------------------------------------------------------------
		
	public static void NumPrime(int[] array) {
		int j;
		boolean check = true;
			
		for(int i = 0; i < array.length; i++) {
			j = 2;
				
			while(j != array[i]) {
				if (array[i] % j == 0) {
					check = false;
					j = array[i] - 1;
				}
				j++;
			}
				
			if(check == true)
				System.out.print(i + " ");
			else
				check = true;
			}
			System.out.println();
	}
		
	//Task_5 --------------------------------------------------------------------------------------------
	
	public static void NumberOfElementsToThrowAway(int[] array) {
		int j = 0, count = 0;
			
		for(int i = 0; i < array.length - 1; i++) {
			if(array[j] > array[i + 1])
				count++;
			else
				j = i;
			}
			System.out.println(count);
		}
	
	//Task_6 --------------------------------------------------------------------------------------------
	
	public static void Matrix(double[]array) {
		double[][]matrix = new double[array.length][array.length];
		int count = 0 ;
		for(int i = 0; i < array.length; i++) {
			for(int j = count; j < array.length; j++) {
				matrix[i][j] = array[j];
			}
			count++;
		}
		int countj = 1;
		count = array.length - 1;
		for(int i = count; i < 0; i--) {
			int ind = 0;
			for(int j = countj; j < array.length - 1; j++) {
				matrix[i][j] = array[ind];
				ind++;
			}
			countj++;
		}
		PrintMatrix(matrix);
	}
	public static void PrintMatrix(double[][]matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
		
	//Task_7 --------------------------------------------------------------------------------------------
		
	public static void Sort(int[] array) {
		int h = 1;
		
	    while (h*3 < array.length)
	    	h = h * 3 + 1;

	    while(h >= 1) {
	    	hSort(array, h);
	        h = h/3;
	    }
	    PrintArray(array);
	}

	private static void hSort(int[] array, int h) {
		int length = array.length;
		for (int i = h; i < length; i++) {
			for (int j = i; j >= h; j = j - h) {
				if (array[j] < array[j - h])
					Swap(array, j, j - h);
	            else
	            	break;
	        }
	    }
	}
	    
	public static void Swap(int[] array, int i, int j) {
		int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
	    
	public static void PrintArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
	    }
		System.out.println();
	}
	    
	//Task_8 --------------------------------------------------------------------------------------------
	    
	private static void PrintLocationInsert(int [] array1, int [] array2) {
		for (int i = 0; i < array1.length; i++) {
			boolean flagIns = true;
	        for (int j = 0; j < array2.length; j++) {
	        	if (array1[i] < array2[j]) {
	        		System.out.printf("%d element of the first mass. insert up to %d elem. second\n", i, j);
	                flagIns = false;
	                break;
	            }
	        }
	        if (flagIns)
	        	System.out.printf("%d element of the first mass. insert after the last elem. second\n", i);
	    }
	}
}
