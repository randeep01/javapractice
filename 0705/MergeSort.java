public class MergeSort{

	static	int aux[] = new int[100];
	public static void merge(int arr[],int l,int m,int h){

		for(int i =l;i<=h;i++)
		{
			aux[i] = arr[i];

		}
		int pi = l;
		int lp = l;
		int rp = m+1;

		while(lp<=m && rp<=h){
			if(aux[lp] < aux[rp])
				arr[pi++] = aux[lp++];
			else
				arr[pi++] = aux[rp++];

			while(lp<=m){
				arr[pi++] = aux[lp++];

			}
			while(rp<=h)
			{
				arr[pi++] = aux[rp++];
			}


		}



	}
	public static void sort(int arr[],int l,int h){
		if(l==h)
			return;

		int m = (l+h)/2;

		sort(arr,l,m);
		sort(arr,m+1,h);
		merge(arr,l,m,h);
	}
	public static void main(String args[])
	{
		int arr[] = {1,5,3,8,2,4};
		sort(arr,0,5);

		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);

	}
}

