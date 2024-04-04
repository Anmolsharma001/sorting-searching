public class BinarySearch
{
    int binarySearch(int a[],int x)
    {
        int left=0,right=a.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]==x)
            return mid;
            if(a[mid]<x)
                left=mid+1;
            else
                right=mid-1;
        }
        return-1;
    }
    public static void main(String[]args)
    {
        BinarySearch b=new BinarySearch();
        int a[]={9,6,4,2,10,3,4};
        int n=a.length;
        int x=6;
        int result=b.binarySearch(a,x);
        if(result==-1)
            System.out.println("element is not present in an array");
        else
            System.out.println("elment is present at index"+(result+1));
    }
}
