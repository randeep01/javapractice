import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;
import java.lang.Math;

class Pair{
	int index;
	int val;
	public Pair(int val, int index){
		this.index = index;
		this.val = val;
	}
}
public class MaxAreaRectangle{
	public static void main(String args[])
	{
		int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0,}};
		System.out.println("Max area under rectangle" + maxArea(arr));
	}
	public static int maxArea(int[][] arr)
	{
		int result = mah(arr[0]);
		
		for(int i = 1;i<arr.length;i++){
			for(int j =0;j<arr[0].length;j++){
				if(arr[i][j] == 1){
					arr[i][j] +=arr[i-1][j];
				}
			}
			print("histo", arr[i]);
			result = Math.max(result, mah(arr[i]));
			print("########################",new int[] {});
		}
		return result;
	}
	public static void print(String str, int arr[])
	{
		System.out.print(str + " " );
		for(int a:arr) System.out.print(a +"|");
		System.out.println("");
	}	
	public static void print(String str, ArrayList<Integer> arr)
	{
		System.out.print(str+ " ");
		for(int a:arr) System.out.print(a +"|");
		System.out.println("");
	}	
	public static int mah(int arr[])
	{
		int result = 0;
		ArrayList<Integer> left = minLeft(arr);
		print("left", left);
		ArrayList<Integer> right = minRight(arr);
		print("Right" , right);
		int[] width = width(left, right);
		print("Width", width);
		int [] area = area(width, arr);
		print("Area", area);
		for(int i =0;i<area.length;i++)
		{
			result = Math.max(result,area[i]);
		}
		return result;
	}
	public static int[] area(int[] width, int[] arr){
		int area[] = new int[arr.length];
		
		for(int i = 0;i<width.length;i++){
			area[i] = width[i] * arr[i];	
		}
		return area;
	}
	public static int[] width(ArrayList<Integer> left, ArrayList<Integer> right){
		int width[] = new int[left.size()];
		for(int i = 0;i<left.size();i++){
			width[i] = right.get(i)- left.get(i) -1;
		}
		return width;
	}
	public static  ArrayList<Integer> minLeft(int arr[]){
		int out  = -1;
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Pair> st = new Stack<>();
		for(int i =0;i<arr.length;i++)
		{
			if(st.empty()) al.add(out);
			else if(!st.empty() && arr[i] >st.peek().val) al.add(st.peek().index);
			else if(!st.empty() && arr[i] <= st.peek().val){
				while(!st.empty() && arr[i] <= st.peek().val) st.pop();
				if(st.empty()) al.add(out);
				else al.add(st.peek().val);
			}
			st.push(new Pair(arr[i], i));
		}
		return al;

	}
	public static ArrayList<Integer> minRight(int arr[]){
		int out = arr.length;
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Pair> st = new Stack<>();

		for(int i = arr.length-1;i>=0;i--){
			if(st.empty()) al.add(out);
			else if(!st.empty() && arr[i]> st.peek().val) al.add(st.peek().index);
			else if(!st.empty() && arr[i] <= st.peek().val){
				while(!st.empty() && arr[i] <= st.peek().val) st.pop();
				if(st.empty()) al.add(out);
				else al.add(st.peek().index);
			} 
			st.push(new Pair(arr[i] ,i));
		}
		Collections.reverse(al);
		return al;	
	}

}
