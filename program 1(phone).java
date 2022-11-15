import java.io.*;
import java.util.*;
 
class GFG {
   
    static ArrayList<String>
    letterCombinationsUtil(int[] number, int n,
                           String[] table)
    {
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("");
        while (!q.isEmpty()) {
            String s = q.remove();
            if (s.length() == n)
                list.add(s);
            else {
                String val = table[number[s.length()]];
                for (int i = 0; i < val.length(); i++)
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }
    static void letterCombinations(int[] number, int n)
    {
        String[] table
            = { "0",   "1",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ArrayList<String> list
            = letterCombinationsUtil(number, n, table);   
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
       }
    }  
    public static void main(String args[])
    {
        int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  
 
        int length = array.length;
       
       
        letterCombinations(array, length);
    }
}
