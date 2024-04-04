public class sortQuick
{
    public static void print(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[]arr,int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static int partition(int[]arr,int st,int end)
    {
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++)
        {
            if(arr[i]<=pivot)
                count++;
        }
        int pivotIdx=st+count;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx && j>pivotIdx)
        {
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<pivotIdx && j>pivotIdx)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void quickSort(int arr[],int st,int end)
    {
        if(st>=end)
            return;
        int pi=partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static void main(String[]args)
    {
        int arr[]={1,26,5,4,3};
        int n=arr.length-1;
        System.out.println("array before sorting");
        print(arr);
        System.out.println();
        quickSort(arr,0,n);
        System.out.println("array after sorting" );
        print(arr);
    }
}