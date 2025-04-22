package easyTask;

import java.util.*;

public class ContactBook {
    public static void main(String[] args) {
        HashMap<String,Integer> contacts = new HashMap<>();
        contacts.put("Job",123488555);
        contacts.put("Smith",147963113);
        contacts.put("Alice",123456789);

        Scanner scn = new Scanner(System.in);
        System.out.print("🔍 Enter a name to search: ");
        String name = scn.nextLine();

        if (contacts.containsKey(name)){
            System.out.println("📞 " + name + " -> " + contacts.get(name));
        }else {
            System.out.println("❌ Name not found!");
        }

        System.out.print("✏️ Enter a name to update: ");
        String updateName = scn.nextLine();
        if (contacts.containsKey(updateName)) {
            System.out.print("📲 Enter new number: ");
            String newNumber = scn.nextLine();
            contacts.put(updateName, Integer.valueOf(newNumber));
            System.out.println("✅ Number updated!");
        } else {
            System.out.println("❌ Name not found!");
        }

        contacts.forEach((key, value) -> System.out.println(key + " → " + value));
    }
}
