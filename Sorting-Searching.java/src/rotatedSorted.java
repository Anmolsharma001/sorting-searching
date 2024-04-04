public class rotatedSorted
{
    static int search(int a[],int target)
    {
        int n=a.length;
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]<a[e])
            {
                if(target>a[mid] && target <a[e])
                {
                    s=mid+1;
                }
                else
                {
                    e=mid-1;
                }
            }
            else
            {
                if(target>=a[s]&& target<a[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={3,4,5,1,2};
        int target=1;
        System.out.println(search(a,target));
    }
}