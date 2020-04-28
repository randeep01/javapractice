public class PrintAll{
	public static void main(String args[])
	{
		char str[] = {'a','b','c','d'};
		char arr[] = new char[str.length];
		boolean visited[] = new boolean[arr.length];
		go(str,arr,2,0,visited);
	}
	static void go(char[]str,char[] arr,int limit,int index,boolean[] visited){

		if(index==limit)
		{
			System.out.println(new String(arr));
			arr = new char[str.length];
			return;
		}
		for(int i = index;i<str.length;i++)
		{
			if(visited[i] == false){
				arr[index] = str[i];
				visited[i] =  true;
				go(str,arr,limit,index+1,visited);
				visited[i] = false;

			}
		}
	}
}


