import java.util.Scanner;  

class Solution {
    public int maxArea(int[] H) {
        int ans = 0, i = 0, j = H.length-1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        }
        return ans;
    }
    public static void main(String[] args) {  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  
Solution sol=new Solution();
System.out.println(sol.maxArea(array));
  
}  
}
