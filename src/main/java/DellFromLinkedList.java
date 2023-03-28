import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DellFromLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(0,1);

        System.out.println(linkedList);

        linkedList.removeFirst(); // за время О(1) - константно

        System.out.println(linkedList);

        linkedList.remove(5); // по индексу О(n) -  линейно

        System.out.println(linkedList);

        System.out.println("Содержится ли в листе число 5? " + linkedList.contains(5));

        ListIterator<Integer> iteratorCheck = linkedList.listIterator(); // добавим итератор. Указатель будет в начале списка.

        while (iteratorCheck.hasNext()) {
            System.out.println("Перебор итератором: " + iteratorCheck.next());
        }

        removeEven(linkedList);
        System.out.println(linkedList);
    }

    
    public static void removeEven(LinkedList<Integer> linkedList) {
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
