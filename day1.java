import java.util.ArrayList;


class day1{
    //reverse array
    public static void reverse(ArrayList<Integer> arr)
    {
         int left=0;
         int right=arr.size()-1;
         while(left<right)
         {
            int temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
         }
         for(int i=0;i<arr.size();i++)
        System.out.println(arr.get(i));
    }
//find min and max
public static void minandmax(ArrayList<Integer> arr)
{
int temp=arr.get(0);
for(int i=0;i<arr.size();i++)
{
    if(temp<arr.get(i))
    {
      temp=arr.get(i);
    }

}
int temp1=arr.get(0);
for(int i=0;i<arr.size();i++)
{
    if(temp1>arr.get(i))
    {
      temp1=arr.get(i);
    }

}
//second largest
int seclarge=0;
int large=arr.get(0);
for(int i=0;i<arr.size();i++)
{
    if(large<arr.get(i))
    {
      seclarge=large;
      large=arr.get(i);
    }
   else if(arr.get(i)>seclarge && arr.get(i)!=large)
   {
    seclarge=arr.get(i);
   }
}
int secsmall=0;
int small=arr.get(0);
for(int i=0;i<arr.size();i++)
{
if(small>arr.get(i))
{
    secsmall=small;
    small=arr.get(i);
}
else if(arr.get(i)<secsmall && arr.get(i)!=small)
{
    secsmall=arr.get(i);
}
}
System.out.println("Second smallest="+secsmall);
System.out.println("Second largest="+seclarge);
System.out.println("Minimum="+temp1);
System.out.println("Maximum:="+temp);
}
    public static void main(String args[])
    {
  ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1545);
        arr.add(24);
        arr.add(33);
        arr.add(445);
        arr.add(545);

    reverse(arr);
    ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(1545);
        arr1.add(24);
        arr1.add(33);
        arr1.add(445);
        arr1.add(545);
         for(int i=0;i<arr1.size();i++)
        System.out.println("before="+arr1.get(i));

        arr1.remove(Integer.valueOf(24));
      for(int i=0;i<arr1.size();i++)
        System.out.println("after="+arr1.get(i));
    if(arr.contains(33))
    {
        System.out.println("presemt");
    }
        ArrayList<Integer> arr2= new ArrayList<>();
        arr2.add(12); 
        System.out.println(arr2.isEmpty());
        ArrayList<Integer> d=new ArrayList<>();
        d.add(100);
        d.add(344);
        d.add(545);
        d.add(123);
        d.add(78);
        d.add(540);
        d.add(89);
         minandmax(d);
    }
   
}