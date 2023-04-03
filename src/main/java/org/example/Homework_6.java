package org.example;
import java.util.*;

public class Homework_6 {
    public static void main(String[] args) {

        Set st = new Set();

        st.add(5);
        st.add(2);
        st.add(4);
        st.add(4);
        st.add(7);
        System.out.println(st);
        st.delete(7);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.get(1));
        System.out.println(st.toString());
    }
}

class Set {
    public HashMap<Integer, Object> set = new HashMap<>();
    private static final Object OBJ = new Object();

    public void add(int num){
        this.set.put(num, OBJ);
    }
    public void delete(Integer num){
        this.set.remove(num);
    }
    public int size(){
        return this.set.size();
    }
    public int get(int index){
        return (int) this.set.keySet().toArray()[index];
    }
    public String toString() {
        return String.valueOf(set.keySet());
    }
}
