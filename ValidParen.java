
import java.util.*;
public class ValidParen
{
	public static void main(String args[])
	{
		String str[] = {"(())","","))((",")()(()"};

		printValid(str);
	}

	static void printValid(String arr[]){
		for(String str:arr){
			printValid(str);
		}
	}

	static void printValid(String str)
	{

		HashSet<String> hash = new HashSet<>();
		Queue<String> q = new LinkedList<>();
		boolean level = false;

		hash.add(str);
		q.add(str);
		String temp ;
		while(q.isEmpty()){

			str  = q.poll();
			if(isValidParen(str)){
				System.out.println(str);
				level = true;
			}
			if(level==true)
				continue;
			for(int i =0;i<str.length();i++)
			{
				temp = str.substring(0,i)+str.substring(i+1);

				if(!hash.contains(temp)){
					q.add(temp);
					hash.add(temp);
				}
			}


		}
	}

	static boolean isValidParen(String str)
	{
		int res = 0;

		for(Character c:str.toCharArray())
		{
			if(c == ')')
			{
				res--;
				if(res < 0)
					return false;
			}
			if(c == '(')
			{
				res ++;
			}

		}

		return res==0;
	}


}

