package dp;
public class SubsetSum1 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5 };
        int sum = 30;
        boolean flag = subset(arr, sum, arr.length);
        System.out.println(flag);

    }
    static boolean subset(int[] arr, int sum, int n)
    {
        if(sum==0) return true;
        if(n==0) return false;

        if(arr[n-1]<=sum){
            return subset(arr,sum-arr[n-1],n-1) ||subset(arr, sum,n-1);
        }else{
            return subset(arr,sum,n-1);
        }

    }
}