package jspec;

import java.util.ArrayList;
// import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
// import java.util.Queue;

public class SpecStructures<T> {
    public static <T> ArrayList<T> arraylist(T... elements) {
        ArrayList<T> result = new ArrayList<T>();
        for(T item : elements)
            result.add(item);
        return result;
    }

    public static <T> LinkedList<T> linkedlist(T... elements) {
        LinkedList<T> result = new LinkedList<T>();
        for(T item : elements)
            result.add(item);
        return result;
    }

    // public static <T> HashMap<String, T> hashmap(T... pairs) {
    //     HashMap<String, T> result = new HashMap<String, T>();
    //     return result;
    // }

    public static <T> Stack<T> stack(T... elements) {
        Stack<T> result = new Stack<T>();
        for(T item : elements)
            result.push(item);
        return result;
    }

    // public static <T> Queue<T> queue(T... elements) {
    //     Queue<T> result = new Queue<T>();
    //     for(T item : elements)
    //         result.add(item);
    //     return result;
    // }
}
