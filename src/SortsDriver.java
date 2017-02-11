import java.util.concurrent.ThreadLocalRandom;
/**
 * 
 * @author Connor Thompson-Hebert
 * 
 * Simple driver program to run and time test various sorting
 * algorithms on an unsorted, randomized array of 100,000 ints
 *
 */

public class SortsDriver{
	public static void main(String[] args){
		
		/**
		 * numElements is the total number of
		 * ints in the array to be sorted. Change
		 * this variable value if you want to 
		 * increase or decrease the size of the
		 * array to be sorted. Default value is
		 * 100,000.
		 */
		int numElements = 100000;
		
		int[] array = new int[numElements];		//create array to be sorted
		long startTime, endTime;				//used to track time of algorithms
		int[] temp = new int[numElements];      //a temp array to store the unsorted original
		
		//initialize the array to be sorted with random ints {0, 1000}
		for(int i=0; i<numElements; i++){
			array[i] = ThreadLocalRandom.current().nextInt(0, 1001);
		}
		
		/***********************************************************
		 * NOTE: IT CAN TAKE A WHILE FOR THESE SORTING ALGORITHMS  *
		 * TO COMPLETE, DEPENDING ON HOW MANY ELEMENTS YOU SORT    *
		 * AND THE NUMBER OF ALGORITHMS YOU RUN. ALLOW UP TO OR    *
		 * OVER A MINUTE FOR THE PROGRAM TO FINISH RUNNING. SIMPLY *
		 * COMMENT OUT ALGORITHMS THAT YOU DO NOT WISH TO TEST     *
		 ***********************************************************/
		
		//BubbleSort
		BubbleSort bs = new BubbleSort();
		System.arraycopy(array, 0, temp, 0, numElements);
		startTime = System.currentTimeMillis();
		bs.bubbleSort(array);
		endTime = System.currentTimeMillis();
		System.out.println("BubbleSort: " + (endTime-startTime) / 1000.0 + " seconds");
		array = temp;
	}
	
	/**
	 * @param array
	 * 
	 * Prints an array 60 elements to a line
	 * 
	 */
	static void print(int[] array){
		for(int i=0; i<array.length; i++){
			if(i%60 == 0) System.out.println();
			System.out.print(array[i] + " ");
		}
	}
}