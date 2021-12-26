package ro.fasttrackit.curs12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// keys are unice, nu pot fi duplicate !!!
//valorile se pot duplica
public class TryMap {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>(); //keys sunt reprezentate pe un hash set
        nameToAge.put("Ana", 30); //punem o val la cheia x, nu adaugam
        nameToAge.put("Ionel", 20);
        nameToAge.put("Mircea", 33);
        nameToAge.put("Raluca", 25);
        nameToAge.put("Dragos", 54);
        nameToAge.put("Costel", 12);

//        System.out.println(nameToAge);
//        System.out.println(nameToAge.get("Ana")); //imi da 30
//        nameToAge.put("Ana",100); //se schimba val din 30 in 100
//        System.out.println(nameToAge.get("Ana"));
//
//        nameToAge.remove("Mircea");
//        System.out.println(nameToAge);
//
//        System.out.println(nameToAge.containsKey("Ana"));
//        System.out.println(nameToAge.containsValue(20));

//        System.out.println(nameToAge.keySet()); //set cu keys
//        System.out.println(nameToAge.values()); //lista cu toate valorile
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        System.out.println(entries);

        for(String key : nameToAge.keySet()) { //set de chei
            System.out.println(key + " = " + nameToAge.get(key)); //returneaza val pt cheiea respectiva
        }

        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()) {
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }
    }
}
