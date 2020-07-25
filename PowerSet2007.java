import java.utils.HashSet;

public class PowerSet2007
{
	public static void main (String args[]){
		String name = "Randeep";
		powerset(name);
	}
	public void powerset(String str)
	{
		HashSet<String> hs = new HashSet<>();
		Queue<String> q = new LinkedList<>();
		hs.add(str);
		q.add(str);

		while(q.poll()!=null){



		}


	}


}
