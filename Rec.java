import java.util.ArrayList;

public class Rec{
	public static void main(String args[])
	{
		String str = "randeep";
		ArrayList<String> list = new ArrayList<>();

		list = rec(str);

		print(list);

	}
	public static ArrayList<String> rec(String str)
	{
		int len = str.length();
		ArrayList<String> result = new ArrayList<>();
		int idx = 0;
		char val[] = new char[len];
		boolean visited[] = new boolean[len];
		int r = 3;
		recutil(str,result,idx,visited,len,val,r);
		return result;
	}
	public static void recutil(String str, ArrayList<String> result, int idx, boolean[] visited,int len, char[] val,int r)
	{
		if(idx == r)
		{
			result.add(new String(val));
		}
		else
		{
			for(int i =0;i<len;i++)
			{
				if(visited[i]== false)
				{

					val[idx] = str.charAt(i);
					visited[i] = true;
					recutil(str,result,idx+1,visited,len,val,r);
					visited[i] = false;
				}
			}
		}
	}
	public static void print(ArrayList<String> arr){
		int i = 1;
		for(String str:arr)
		{
			System.out.println(i + ":" +str);
			i++;
		}

	}
}

