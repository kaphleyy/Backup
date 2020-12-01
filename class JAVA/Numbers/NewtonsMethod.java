public class NewtonsMethod {
    public static void main(String[] args) throws Exception{
        double err =1;
        double prevX ;
         int c = 2;     //The number whose square root is tobe found
         double der ;
         double fx;
         double x = c/2;

         int flag= 0;

        while(err>Math.pow(10, -6)) {

            if(flag >100) throw new Exception("Doesnot converge");

            prevX = x;
            der = 2*prevX;
            fx = prevX*prevX - c;
            x = prevX - fx/der;
            err = Math.abs(x-prevX);
            flag++;
        }
        System.out.println(x);
    }
    
}
