public class findSquareRoot
{
    static int sqrt(int x)
    {
        int ans=-1;
        int s=0;
        int e=x;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int val=mid*mid;
            if(val==x)
            {
                return mid;
            }
            else if (val<x)
            {
                ans=mid;
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x=24;
        System.out.println(sqrt(x));
    }
}