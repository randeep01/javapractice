import java.util.*;

class GFG
{

	static void go(String str)
	{
		if (str.isEmpty())
			return;

		HashSet<String> visit = new HashSet<String>();
		Queue<String> q = new LinkedList<>(); 
		String temp;
		boolean level = false;

		q.add(str);
		visit.add(str);
		while (!q.isEmpty())
		{
			str = q.peek(); q.remove();
			//System.out.println(str);
			for (int i = 0; i < str.length(); i++)
			{
			//	System.out.println(i);
				String temp1 = str.substring(0,i);
				String temp2 = str.substring(i+1);
				System.out.println(temp1 + "," + temp2);
				temp = str.substring(0, i) + str.substring(i + 1);
				if (!visit.contains(temp))
				{
					q.add(temp);
					visit.add(temp);
				}
			}
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		String expression = "randeep";
		go(expression);
	}
}

