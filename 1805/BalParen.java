import java.util.*;

public class BalParen{
	public static void main(String args[])
	{
		System.out.println("---" + bal("()(()"));
	}
	public static String bal(String str)
	{
		System.out.println("ori:"+str);
		if(str==null){
			return null;
		}
		if(checkBal(str) == 0)
		{
			return str;
		}
		Queue<String> q = new LinkedList<>();
		HashSet<String> hs = new HashSet<>();
		q.add(str);
		hs.add(str);

		while(q.isEmpty()!=true)
		{
			String val = q.poll();
			System.out.println(val);
			if(checkBal(val) == 0)
			{
//				System.out.println("result" + val);
				return val;
			}else{
				for(int i = 0;i<val.length();i++)
				{
					String temp = val.substring(0,i) + val.substring(i+1);
					if(hs.contains(temp)==false){
//						System.out.println(temp);
						q.add(temp);
						hs.add(temp);

					}
				}
			}
		}
		return null;
	}

	public static int checkBal(String str)
	{
		int val = 0;
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i) == ')'){
				val--;
				if(val<0)
					return val;
			}
			else if(str.charAt(i) == '('){
				val++;
			}
			else{
				val = val;
			}

		}

		return val;
	}
}

