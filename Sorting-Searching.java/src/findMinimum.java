//ROTATED ARRAY WITH MINIMUM VALUEEEEE.....
 public class findMinimum
{
    static int findMin(int a[])
    {
        int n=a.length-1;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(a[mid]<=a[n-1])
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={3,4,5,6,1,2};
        System.out.println(findMin(a));
    }
}