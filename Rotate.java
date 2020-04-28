class Rotate
{
	void leftRotate(int ar[],int n,int c){

		for(int i =0;i<c;i++){
			rotateByone(ar,n);
		}
	}
	void rotateByone(int arr[],int n)
	{
		int temp = 0;
		int i =0;
		for( i =0;i<n-i;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		Rotate r = new Rotate();
		r.leftRotate(arr,6,1);
		for(int i =0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

