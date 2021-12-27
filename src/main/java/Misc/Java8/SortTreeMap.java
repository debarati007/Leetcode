package Misc.Java8;

import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeMap {
    public static class Custom{
        private int rank;
        private String name;

        public Custom(int rank, String name) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Custom{" +
                    "rank=" + rank +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        TreeMap<Custom , Integer > tree = new TreeMap<>(Comparator.comparingInt(o -> o.rank));
        tree.put(new Custom(1,"a"),1);
        tree.put(new Custom(2,"b"),2);
        tree.put(new Custom(3,"c"),3);
        System.out.println(tree);
    }
}
