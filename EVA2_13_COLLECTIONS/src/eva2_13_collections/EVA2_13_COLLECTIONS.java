
package eva2_13_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EVA2_13_COLLECTIONS {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println(lista);
        System.out.println(lista.size());
        lista.clear();
        System.out.println(lista);
        System.out.println(lista.size());
        
        //Arraylist
        //Trabaja con arreglos
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Helo");
        arraylist.add("How");
        arraylist.add("You");
        arraylist.add("Im under water, please help me");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        
        //QUEUE
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
    
}
