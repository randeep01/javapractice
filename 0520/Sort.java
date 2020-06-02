public class Sort{
	public static void main(String args[]){
		int arr[] = {-5,-4,0,1,3};

		arr = squareSort(arr);
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int[] squareSort(int[] arr){
		int pP = 0;
		int nP = 0;
		for(int i = arr.length-1;i>=0;i--)
		{
			if(arr[i]<0){
				nP = i;
				break;
			}
		}
		pP = nP + 1;


		int result[] = new int[arr.length];
		int p = 0;
		while(nP>=0 && pP<arr.length){
			if(arr[nP]*arr[nP] > arr[pP]*arr[pP]){
				result[p] = arr[pP] * arr[pP];
				pP++;
			}else{
				result[p] = arr[nP] * arr[pP];
				nP--;
			}
			p++;
		}

		while(pP<arr.length)
		{
			result[p] = arr[pP]*arr[pP];
			p++;
			pP++;
		}
		while(nP>=0)
		{
			result[p] = arr[nP]*arr[nP];
			p++;
			nP--;
		}
		return result;
	}

}

