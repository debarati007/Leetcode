package Misc.CoreJava;

import java.util.ArrayList;
import java.util.Collections;
//comparable example
public class Bank implements Comparable<Bank> {
    private int id;
    private String name;

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Bank bank) {
        if (this.id > bank.id) {
            return 1;
        } else if (this.id < bank.id)
            return -1;
        else
            return this.name.compareToIgnoreCase(bank.name);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bank b1 = new Bank(4, "sbi");
        Bank b2 = new Bank(6, "icici");
        Bank b3 = new Bank(12, "pnb");
        Bank b4 = new Bank(13, "rbl");
        Bank b5 = new Bank(6, "kotak");
        ArrayList banks = new ArrayList();
        banks.add(b1);
        banks.add(b2);
        banks.add(b3);
        banks.add(b4);
        banks.add(b5);
        System.out.println(banks);
        System.out.println("After sorting:");
        Collections.sort(banks);
        System.out.println(banks);
    }
}
