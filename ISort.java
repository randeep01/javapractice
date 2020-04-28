class ISort{
    static void sort(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;++i)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,3,6,2,9,5,7};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " " );
        }


    }
}

