import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class BalancedParen2107{

	public static void main(String args[])
	{
		new BalancedParen2107().bal("((a+b))(d+f))");
	}

	public void bal(String str){
		HashSet<String> hs = new HashSet<>();
		Queue<String> q = new LinkedList<>();

		hs.add(str);
		q.add(str);

		while(q.isEmpty()!=true)
		{
			String val = q.poll();
			if(isBalanced(val)){
				// printit
				System.out.println(val);
				break;
			}
			else{
				for(int i =0;i<val.length();i++)
				{
					String temp = val.substring(0,i)+val.substring(i+1);
					if(!hs.contains(temp)){
						hs.add(temp);
						q.add(temp);
					}


				}

			}

		}

	}
	public boolean isBalanced(String str)
	{
		int bal = 0;
		for(int i =0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c == ')')
			{
				bal--;
				if(bal<0){
					return false;
				}
			}
			else if(c=='(')
			{
				bal++;
			}
		}
		return bal == 0;
	}
}

