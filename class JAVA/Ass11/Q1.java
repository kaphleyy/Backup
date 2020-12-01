package Ass11;

public class Q1 {
    public static void main(String[] args) {
        String[] arr = "Hi all There".split(" ");
        StringBuilder sb = new StringBuilder();
 
        for (int i = arr.length - 1; i >= 0; i--) {
 
            if (i == 0)
                sb.append(arr[i]);
            else
                sb.append(arr[i] + " ");
        }
        System.out.println(sb);

    }

}
