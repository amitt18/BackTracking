import java.util.Scanner;

public class nqueen {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       find(n);
    }
    public static boolean find(int n){
        int[][] b = new int[n][n];
        if(back(b,0,n)) {
            print(b, n);
            return true;
        }
        return false;
    }
    public static boolean back(int[][] b,int row,int n){
        if(row==n) return true;
        for(int col=0;col<n;col++){
            if(safe(b,row,col,n)){
                b[row][col] = 1;
                if(back(b,row+1,n)) return true;
                b[row][col]=0;
            }
        }
        return false;
    }
    public static boolean safe(int[][] b,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(b[i][col]==1) return false;
        }
        //int i,j;
        for(int  i= row-1, j=col-1;i>=0&& j>=0;i--,j--){
            if(b[i][j]==1) return false;
        }
        for(int  i= row-1, j=col+1;i>=0&& j<n;i--,j++){
            if(b[i][j]==1) return false;
        }
        return true;
    }
  public static void print(int[][] b,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
  }
}
