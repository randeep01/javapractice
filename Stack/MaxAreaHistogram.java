import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

class Pair{
	int val;
	int index;
	public Pair(int val,int index)
	{
		this.val = val;
		this.index = index;
	}
}

public class MaxAreaHistogram
{
	public static void main(String args[])
	{
		int arr [] = {6,2,5,4,5,1,6};
		printarr("Array", arr);
		ArrayList<Integer> left = smallestLeft(arr);
		printarr("left", left);
		ArrayList<Integer> right = smallestRight(arr);
		printarr("right", right);
		int width[] = width(left,right);
		printarr("width", width);
		int area[] = area(width, arr);
		printarr("area", area);
		System.out.println("\n Max Area" + max(area)+"\n");
	}
	public static void printarr(String str, int arr[]){
		System.out.print("\n"+ str + " ");
		for(int a:arr) System.out.print(a + " | ");
	}
	public static void printarr(String str, ArrayList<Integer>arr)
	{

		System.out.print("\n"+ str + " ");
		for(int a:arr) System.out.print(a + " | ");
	}
	public static int max(int[] area)
	{
		int max = 0;
		for(int i =0;i<area.length;i++)
		{
			if(area[i]>max) max = area[i];
		}
		return max;
	}
	public static int[] area(int[] width, int[] arr)
	{
		int[] area = new int[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			area[i] = width[i] * arr[i];
		}
		return area;
	}
	public static int[] width(ArrayList<Integer>left, ArrayList<Integer> right)
	{
		int width [] = new int[left.size()];
		for(int i = 0;i<left.size();i++)
		{
			width[i] = right.get(i) - left.get(i) -1;
		}
		return width;
	}
	public static ArrayList<Integer> smallestRight(int arr[]){
		int out  = arr.length+1;
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Pair> st = new Stack<>();
		for(int i = arr.length-1;i>=0;i--)
		{
			if(st.empty())
				al.add(out);
			else if(!st.empty() && arr[i] > st.peek().val)
				al.add(st.peek().index);
			else if(!st.empty() && arr[i] <= st.peek().val){
				while(!st.empty() && arr[i] <=st.peek().val)
					st.pop();
				if(st.empty())
					al.add(out);
				else 
					al.add(st.peek().index);

			}
			st.push(new Pair(arr[i], i));

		}	
		Collections.reverse(al);
		return al;	

	}
	public static ArrayList<Integer> smallestLeft(int arr[]){
		int out = -1;
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Pair> st = new Stack<>();
		for(int i = 0;i<arr.length;i++){
			if(st.empty()) al.add(out);
			else if(!st.empty() && arr[i] > st.peek().val) al.add(st.peek().index);
			else if(!st.empty() && arr[i] <= st.peek().val){
				while(!st.empty() && arr[i] <= st.peek().val) st.pop();
				if(st.empty()) al.add(out);
				else al.add(st.peek().index);
			}
			st.push(new Pair(arr[i], i));
		}	
		return al;	
	}
}
