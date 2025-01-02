package AMAZON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello amazon interview prep");

        List<String> names = new ArrayList<>();
        names.add("Zandi");
        names.add("kim");
        names.add("alex");
        names.add("madi");
        names.add("Ane");

        // convert each first letter of the name to upper case first
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            names.set(i, capitalize(name));
        }
        Collections.sort(names);

        System.out.println(names);

    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

}