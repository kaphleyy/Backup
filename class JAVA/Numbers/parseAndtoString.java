
public class parseAndtoString {
    public static void main(String[] args) {
        String b2 = Integer.toString(8,8);
        int b3 = Integer.parseInt("777",8); //returns primitive int 
        System.out.println(Integer.valueOf("2353",8)); // returns Integer object    
        System.out.println(b2 + " " + b3);
       

    }
    
}
