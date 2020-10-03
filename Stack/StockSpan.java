import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StockSpan{
	public static void main(String args[])
	{
		int arr[] = {100,80,60,70,60,75,85};
		ArrayList<Integer> res = stockSpan(arr);
		for(int val :res)
			System.out.println(val);


	}
	static ArrayList<Integer> stockSpan(int[] arr)
	{
		class Pair{
			int val;
			int index;
			public Pair(int val, int index){
				this.val = val;
				this.index = index;
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Pair> st = new Stack<>();
		for(int i = 0;i<arr.length;i++)
		{
			if(st.empty())
				al.add(-1);
			else if(!st.empty()&&arr[i]<st.peek().val)
				al.add(st.peek().index);
			else if(!st.empty() && arr[i] >=st.peek().val)
			{
				while(!st.empty() && arr[i] >= st.peek().val)
					st.pop();
				if(st.empty())
					al.add(-1);
				else 
					al.add(st.peek().index);
			}
			st.push(new Pair(arr[i], i));
		}
		for(int i =0;i<al.size();i++)
			al.set(i,i - al.get(i));	
		return al;
	}	
}
