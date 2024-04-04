public class linearSearch
{
    public static void main(String[] args)
    {
      int a[]={1,32,44,56,77,89,132};
      int n=44;
      int pos=-1;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]==n)
          {
              pos=i;
              break;
          }
      }
      if(pos==-1)
      {
          System.out.println("Search successful");
      }
      else
      {
          System.out.println("search at index"+(pos+1));
      }
    }
}