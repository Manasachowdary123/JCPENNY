import java.util.*;

public class A {
   static void permutations(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> nums, int l, int h) {
       if (l == h) {
           ArrayList<Integer> nums1 = new ArrayList<Integer>(nums);

           res.add(nums1);
           return;
       }
       for (int i = l; i <= h; i++) {

          
           int left = nums.get(l);
           nums.set(l, nums.get(i));
           nums.set(i, left);

        
           permutations(res, nums, l + 1, h);

      
           left = nums.get(l);
           nums.set(l, nums.get(i));
           nums.set(i, left);
       }
   }

   static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
     
       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer> >();
       int x = nums.size() - 1;
  
       permutations(res, nums, 0, x);
       return res;
   }

   public static void main(String[] args) {
       int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
       ArrayList<Integer> nums = new ArrayList<Integer>();

for(int i=0; i<n; i++)  
{  
nums.add(sc.nextInt());  
}  

       ArrayList<ArrayList<Integer>> res = permute(nums);

       Set<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();

       for (int i=0;i<res.size();i++){
           hs.add(res.get(i));
       }
       res.forEach(System.out::println);
      
   }
}
