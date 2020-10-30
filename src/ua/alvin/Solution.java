package ua.alvin;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static void iterate(Node rootNode){
        Queue<Node> queue = new LinkedList<>();

        queue.add(rootNode);

        while (!queue.isEmpty()){
            Node next = queue.remove();

            System.out.println(next.getName());

            queue.addAll(next.getChildren());
        }
    }
}
