import java.util.*;

public class Substrs
{
	public static void main(String args[]){
		String str = "randeep";
		substrs(str);
	}
	public static void  substrs(String str)
	{
		Queue<String> q = new LinkedList<>();
		HashSet<String> hash = new HashSet<>();
		q.add(str);
		hash.add(str);
		int count = str.length();
		while(!q.isEmpty())
		{
			String s = q.poll();
			System.out.println(s);

			for(int i =0;i<s.length();i++)
			{
				String temp = s.substring(0,i) + s.substring(i+1);

				if(!hash.contains(temp)){
					q.add(temp);
					hash.add(temp);
				}
			}
		}
	}
}

