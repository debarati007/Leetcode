package Misc.Collection;

import java.util.*;

public class UniquePhoneNumber {
    static class Person {
        String name;
        String phoneNumber;

        public Person(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jim", "111"));
        people.add(new Person("Bob", "222"));
        people.add(new Person("Dan", "333"));
        people.add(new Person("Jim", "222"));
        people.add(new Person("Jim", "333"));
        people.add(new Person("Dan", "111"));
        people.add(new Person("Jim", "222"));
        people.add(new Person("Jim", "111"));
        people.add(new Person("Bob", "111"));
        people.add(new Person("Jim", "111"));
        people.add(new Person("Dan", "444"));
        people.add(new Person("Dan", "555"));

        HashMap<String, Set<String>> map = new HashMap<>();

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (map.containsKey(person.getName())) {
                String phoneNumber = person.getPhoneNumber();
                Set<String> oldSet = map.get(person.getName());
                oldSet.add(phoneNumber);
                map.put(person.getName(), oldSet);
            } else {
                Set<String> set = new HashSet<>();
                set.add(person.getPhoneNumber());
                map.put(person.getName(), set);
            }

        }
        for (Map.Entry<String, Set<String>> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + ":" + entrySet.getValue().size());

        }

    }

}
