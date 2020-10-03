import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

public class Nearest{
	public static void main(String args[])
	{
		int arr[] = {1,3,5,24,52,5,2,52,5,25,3};
		ArrayList<Integer> res = nearestGreatestRight( arr);
		printArr("Original",arr);

		printArr("Nearest Greatest to Right", res);
		printArr("Nearest smallest to right", nearestSmallestRight(arr));
		printArr("Nearest greatest to left", nearestGreatestLeft(arr));
	}
	static ArrayList<Integer> nearestGreatestLeft(int arr[])
	{
		ArrayList<Integer>al = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		for(int i = 0;i<arr.length;i++)
		{
			if(st.empty())
				al.add(-1);
			else if(!st.empty() && arr[i] < st.peek())
				al.add(st.peek());
			else if(!st.empty() && arr[i] >= st.peek())
			{
				while(!st.empty() && arr[i] >= st.peek())
					st.pop();
				if(st.empty())
					al.add(-1);
				else if(arr[i] < st.peek())
					al.add(st.peek());
			}
			st.add(arr[i]);
		}
		return al;
	}	
	static ArrayList<Integer> nearestSmallestRight(int arr[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Integer> st = new Stack<>();

		for(int i=arr.length-1;i>=0;i--)
		{
			if(st.empty())
				al.add(-1);
			else if(!st.empty() && arr[i]>st.peek())
				al.add(st.peek());
			else if(!st.empty() && arr[i] <=st.peek())
			{
				while(!st.empty() && arr[i] <=st.peek())
					st.pop();
				if(st.empty())
					al.add(-1);
				else if(arr[i] > st.peek())
					al.add(st.peek());
			}
			st.add(arr[i]);
		}
		Collections.reverse(al);
		return al;
	}
	static ArrayList<Integer> nearestGreatestRight(int arr[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Integer> st = new Stack<>();

		for(int i = arr.length-1;i>=0;i--)
		{
			//if stack is empty
			if(st.empty()){
				al.add(-1);
			}
			else if(!st.empty() && arr[i]<st.peek()){

				al.add(st.peek());
			}
			else if(!st.empty() && arr[i]>=st.peek()){
				while(!st.empty() && arr[i] >= st.peek()){
					st.pop();
				}
				if(st.empty()){
					al.add(-1);
				}
				else if(arr[i]<st.peek()){
					al.add(st.peek());
				}		
			}

			st.add(arr[i]);
		}

		Collections.reverse(al);	
		return al;
	}

	static void printArr(String message, int[] arr)
	{
		System.out.println("");
		System.out.println(message); 
		for(int i=0;i<arr.length;i++)
		{ 
			System.out.print(arr[i] +  " ," );
		}

	}

	static void printArr(String message, ArrayList<Integer> arr)
	{
		System.out.println("");
		System.out.println(message); 
		for(int i=0;i<arr.size();i++)
		{ 
			System.out.print(arr.get(i) +  " ," );
		}
		System.out.println("");
	}

}

