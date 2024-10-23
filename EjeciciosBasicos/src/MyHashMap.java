import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args){
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("SMS", "Un mensaje de texto");
        diccionario.put("LOL", "Reirse");

        System.out.println(diccionario.get("SMS"));
    }
}
