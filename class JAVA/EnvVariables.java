import java.util.Map;
// import java.util.Set;

public class EnvVariables {
    public static void main(String[] args) {
        System.out.println(System.getenv("PATH"));

        Map<String, String> map = System.getenv();
        // keyset() method is used to iterate\
        // Set<String> system_keys = map.keySet();

        // for (String key : system_keys) {
        // System.out.println(key + " ====================> " + map.get(key));
        // }

        for (Map.Entry<String, String> entryElem : map.entrySet()) {
            System.out.println("key is : " + entryElem.getKey() + " and Value is :" + entryElem.getValue());
        }
    }
}
