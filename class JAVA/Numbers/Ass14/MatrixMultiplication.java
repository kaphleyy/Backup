package Ass14;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int i,j,k,l;
         i=j=k=l=3;
        int[][] A = {{1,2,3},{3,4,5},{6,7,8}};
        int[][] B = {{0,4,1},{2,-3,4},{2,2,1}};
        int[][] C = new int[i][l];
        int sum =0 ;
        if(j!=k) System.out.println("Cannot find product");
        
        else {

            for(int a= 0 ; a<i ; a++) {
                for(int b=0 ; b<l; b++) {
                     sum =0;
                    for(int c=0 ; c<i ; k++){
                        sum += A[a][c]*B[c][b];
                        System.out.println(sum);
                    }
                    C[a][b] = sum;
                }
            }

            for(int a=0; a<i; a++){
                for(int b=0 ; b<l; b++) {
                    System.out.print(C[a][b] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
