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
    }
}