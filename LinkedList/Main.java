//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1: list1 = [1,2,4], list2 = [1,3,4] -> [1,1,2,3,4,4]
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.print("Example 1: ");
        printList(solution.mergeTwoLists(l1, l2));
        // Example 2: list1 = [], list2 = [] -> []
        System.out.print("Example 2: ");
        printList(solution.mergeTwoLists(null, null));
        // Example 3: list1 = [], list2 = [0] -> [0]
        System.out.print("Example 3: ");
        printList(solution.mergeTwoLists(null, new ListNode(0)));
        // LinkedList + Collections
        System.out.println("\nLinkedList + Collections:");
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b= new LinkedList<>();
        Collections.addAll(a,1,2, 4);
        Collections.addAll(b, 1, 3,4);
        System.out.println("Example 1: " + mergeWithCollections(a, b));
        System.out.println("Example 2: " +mergeWithCollections(new LinkedList<>(), new LinkedList<>()));
        LinkedList<Integer> c= new LinkedList<>();
        c.add(0);
        System.out.println("Example 3: " +mergeWithCollections(new LinkedList<>(), c));
    }
    // Об'єднує два списки за допомогою стандартних методів Java
    static LinkedList<Integer> mergeWithCollections(LinkedList<Integer> x,LinkedList<Integer> y) {
        LinkedList<Integer> result = new LinkedList<>(x); // копія першого списку
        result.addAll(y); // додаємо елементи другого списку
        Collections.sort(result); // сортуємо за зростанням
        return result;
    }
    // Виводить наш ListNode-список на екран у форматі [1,2,3]
    static void printList(ListNode head) {
        StringBuilder sb =new StringBuilder("[");
        while (head !=null) {
            sb.append(head.val);
            if (head.next != null) sb.append(","); // кома лише між елементами
            head = head.next;
        }
        System.out.println(sb.append("]"));
        }
    }
