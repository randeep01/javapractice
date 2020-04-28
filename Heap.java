public class Heap{
    public void heapify(int arr[], int n ,int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n && arr[largest]<arr[l])
        {
            largest = l;
        }
        if(r<n && arr[largest]<arr[r])
        {
            largest = r;
        }
        if(largest!=i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr,n,largest);
        }
    }

    public void sort(int arr[]){

        int n = arr.length;
        for(int i =n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        for(int i =n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }

    }
    public void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1,4,2,6,7,10,3,6};
        Heap h = new Heap();
        h.sort(arr);
        h.print(arr);
    }
}
