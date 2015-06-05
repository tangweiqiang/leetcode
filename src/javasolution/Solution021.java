package javasolution;

/**
 * Created by 汤伟强 on 2015/6/5.
 */

public class Solution021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)return l2;
        if (l2==null)return l1;
        ListNode head=null;
        ListNode p=null;
        if (l1.val <= l2.val) {
            head=l1;
            l1=l1.next;
        }else {
            head=l2;
            l2=l2.next;
        }
        p=head;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                if(p.next!=l1)p.next=l1;
                l1=l1.next;
            }else {
                if (p.next!=l2)p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if (l1==null && p.next!=l2) p.next=l2;
        if (l2==null && p.next!=l1) p.next=l1;
        return head;
    }
}
