public class SortedRot{
	public static int find(int arr[],int key,int l, int h)
	{
		if(l>h)
		{
			return -1;
		}
		int mid = (l+h)/2;
		if(arr[mid] == key)
			return mid;
		if(arr[l]<=arr[mid])
		{
			if(key>=arr[l] &&  key<=arr[mid])
			{
				return find(arr,key, l,mid-1);
			}
			return find(arr, key,mid+1,h);
		}
		if(key>=arr[mid] && key<= arr[h])
		{
			return find(arr,key, mid+1,h);
		}
		return find(arr,key,l,mid-1);
	}

	public static void main(String args[])
	{
		int arr[] = {5,2,3,4,1};

		System.out.println(find(arr,1,0,4));
	}

}

