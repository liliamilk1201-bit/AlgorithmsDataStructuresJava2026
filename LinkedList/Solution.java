class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dum = new ListNode(-1);
        ListNode cur = dum;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1; // Додаємо вузол з list1
                list1 = list1.next; // Переходимо до наступного вузла list1
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next; // Рухаємо покажчик tail до останнього вузла об'єднаного списку
        }
        if(list1 != null) {
            cur.next = list1; // Якщо залишилися вузли в list1, додаємо їх до об'єднаного списку
        } else {
            cur.next = list2;
        }
        // Повертаємо наступний вузол після фіктивного вузла, який є початком об'єднаного списку
        return dum.next;
    }
};