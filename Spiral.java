public class Spiral{
	public static void main(String args[]){
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		printSpiral(arr);

	}
	public static void printSpiral(int[][] arr){
		if(arr==null) return;
		if(arr.length==0) return;

		int rBegin =0;
		int rEnd = arr.length-1;
		int cBegin = 0;
		int cEnd = arr[0].length-1;

		while(rBegin<=rEnd && cBegin<=cEnd){
			for(int i = cBegin;i<=cEnd;i++)
				System.out.println(arr[rBegin][i]);
			rBegin++;
			for(int i = rBegin;i<=rEnd;i++)
				System.out.println(arr[i][cEnd]);
			cEnd--;
			if(rBegin<=rEnd){
				for(int i = cEnd;i>=cBegin;i--)
					System.out.println(arr[rEnd][i]);
				rEnd--;
			}
			if(cBegin<=cEnd){
				for(int i =rEnd;i>=rBegin;i--)
					System.out.println(arr[i][cBegin]);
				cBegin++;
			}

		}

	}

}

