import java.io.*;
 import java.util.Scanner;   

class GFG {
    
    static void rotateMatrix(int N, int mat[][])
    {
        
        for (int x = 0; x < N / 2; x++) {
            
            for (int y = x; y < N - x - 1; y++) {
                
                int temp = mat[x][y];
 
                
                mat[x][y] = mat[y][N - 1 - x];
 
                
                mat[y][N - 1 - x]
                    = mat[N - 1 - x][N - 1 - y];
 
               
                mat[N - 1 - x][N - 1 - y]
                    = mat[N - 1 - y][x];
 
               
                mat[N - 1 - y][x] = temp;
            }
        }
    }
 
    static void displayMatrix(int N, int mat[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);
 
            System.out.print("\n");
        }
        System.out.print("\n");
    }
 
   
    public static void main(String[] args)
    {
        int m, n, i, j;   
Scanner sc=new Scanner(System.in);   
System.out.print("Enter the number of rows: ");   
m = sc.nextInt();   
System.out.print("Enter the number of columns: ");   
n = sc.nextInt();   
int array[][] = new int[m][n];   
System.out.println("Enter the elements of the array: ");   
for (i = 0; i < m; i++)   
for (j = 0; j < n; j++)   
array[i][j] = sc.nextInt();   


 
        rotateMatrix(m, array);
 
        
        displayMatrix(m, array);
    }
}
