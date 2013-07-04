import java.util.Random;

import Fateh.LinkedList.LinkedListTest;
import Fateh.Sorting.*;


public class UISimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedListTest lltest = new LinkedListTest();
//		int non = lltest.Count();
//		System.out.format("The Length of List is %d", non);
//	    for(int i=0;i<10;i++)
//	    {
//	      lltest.AddNodeStart(i, i+10);
//	    }
//		non = lltest.Count();
//		System.out.format("The Length of List is %d", non);
//		lltest.DeleteNodeFromEnd();
//		non = lltest.Count();
//		System.out.format("The Length of List is %d", non);
//		lltest.DeleteNodeFromEndUsingTail();
//		non = lltest.Count();
//		System.out.format("The Length of List is %d", non);
		
		int[] data;
		data = new int[]{6, 5, 2, 3, 1, 9, 4,7, 8};
		
		System.out.println("UnSorted Data");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		System.out.println();
		
		SortingAlgorithms sorter = new SortingAlgorithms();
		sorter.InsertionSort(data);
		System.out.println("After Insertion Sort");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		System.out.println();

		data = new int[]{16, 15, 12, 13, 11, 19, 14,17, 18};

		sorter.SelectionSort(data);
		System.out.println("After Selection Sort");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		System.out.println();
		
		data = new int[]{26, 25, 22, 23, 21, 29, 24,27, 28};
		sorter.BubbleSort(data);
		System.out.println("After Bubble Sort");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
		System.out.println();
	
		
	}

}
