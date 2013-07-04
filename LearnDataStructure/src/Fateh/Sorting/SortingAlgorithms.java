/**
 * 
 */
/**
 * @author dhillona
 *
 */
package Fateh.Sorting;
//SORTING ALGORITHMS
public class SortingAlgorithms
{

public void InsertionSort(int[] data)
{
//Array with one element is already sorted.
//So start from 1.
//Sorting is restricted only to a fraction of array in each iteration
// Only in last pass the whole array is considered.
 for(int i=1, j; i<data.length;i++)
	 {
	   int temp = data[i];
	   for(j=i; j>0&& temp < data[j-1]; j--)
	      data[j] = data[j-1];
	   data[j] = temp;
	 }
}

public void SelectionSort(int[] data)
{
  int j, least = 0;
  for(int i=0; i< data.length; i++)
	{
	 for(j=i+1, least = i; j< data.length; j++)
    {
	    if(data[j] < data[least])
		least = j;
	  }
		if(i != least)
		Swap(data, least, i);
	 
	}
}

public void BubbleSort(int[] data)
{
 for(int i = 0; i<data.length - 1; i++)
  for(int j = data.length - 1; j > i; --j)
	  if(data[j] < data[j-1])
	   Swap(data, j, j-1);
}

public void Swap(int[] data, int least, int i)
{
  if(data[i] > data[least])
	{
	 int temp = data[i];
	 data[i] = data[least];
	 data[least] = temp;
	}
} 



}