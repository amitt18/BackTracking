import java.util.Scanner;

public class sudokusol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] b = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                b[i][j] = sc.nextInt();
            }
        }
        if(ss(b)){
            System.out.println("Solution exists");
            print(b);
        }
        else{
            System.out.println("No solution exists");
        }
    }
    public static boolean ss(int[][] b){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]==0){
                    for(int num=1;num<=9;num++){
                        if(valid(b,i,j,num)){
                            b[i][j]=num;
                            if(ss(b)) return true;
                            b[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

     public static boolean valid(int[][] b,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(b[i][col]==num || b[row][i]==num) return false;
        }
        int fr = 3* (row/3);
        int fc = 3*(col/3);
        for(int i=fr;i<fr+3;i++){
            for(int j = fc;j<fc+3;j++){
                if(b[i][j]==num) return false;
            }
        }
        return true;
     }
public static void print(int[][] b){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
}


}
