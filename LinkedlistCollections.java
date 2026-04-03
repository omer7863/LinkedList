
import java.util.LinkedList;


public class LinkedlistCollections {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(599);
        list.add(3,333);

        list.removeLast();

        System.out.println(list);
    }
}
