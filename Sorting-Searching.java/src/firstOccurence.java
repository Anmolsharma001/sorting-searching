public class firstOccurence
{
    static int firstOcc(int a[],int x)
    {
        int n = a.length;
        int left = 0;
        int right = n -1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else if(a[mid]<=x)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[]={23,34,45,56,67,78,89};
        int x=34;
        System.out.println(firstOcc(a,x));
    }
}