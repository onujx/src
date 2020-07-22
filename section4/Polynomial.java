package section4;

import section3.MySingleLinkedList;
import section3.Term;

import java.time.temporal.Temporal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Polynomial {
    public char name;
    public LinkedList<Term> terms;

    public Polynomial(char name) {
        this.name = name;
        terms = new LinkedList<Term>();
    }

    public void addTerm(int coef, int expo) {
        if (coef == 0) {
            return;
        }
        ListIterator<Term> iter = terms.listIterator();
        while (iter.hasNext()) {
            Term t = iter.next();
            if (t.expo == expo) {
                t.coef += coef;
                if (t.coef == 0) {
                    iter.remove();
                    return;
                }
                else if (t.expo < expo) {
                    iter.remove();
                    iter.add(new Term(coef, expo));
                    return;
                }
            }
        }
//        Node<Term> p = terms.head, q = null;
//        while (p != null && p.data.expo > expo) {
//            q = p;
//            p = p.next;
//        }
//        if (p != null && p.data.expo == expo) {
//            p.data.coef += coef;
//            if (p.data.coef == 0) {
//                if (q == null)
//                    terms.removeFirst();
//                // remove this node p
//                else
//                terms.removeAfter(q);
//            }
//
//        }
//        else { //add after q
//            Term t = new Term(coef, expo);
//            if (q == null)
//                terms.addFirst(t);
//            else
//                terms.addAfter(q, t);
//
//        }

    }
    public int calc(int x) {
        int result = 0;
 /*       Node<Term> p = terms.head;
        while (p != null) {
            result += p.data.calc(x);
            p = p.next;
        } */
        Iterator<Term> iter = terms.iterator();
        while(iter.hasNext()) {
            Term t = iter.next();
            result += t.calc(x);
        }
        return result;
    }

    public String toString() {
        String result = "";
        Iterator<Term> iter = terms.iterator();
        while(iter.hasNext()) {
            Term t = iter.next();
            result += ("+" + t.toString());
        }
      /*  Node<Term> p = terms.head;
        while (p != null) {
            result += ("+" + p.data.toString());
            p = p.next;
        }*/
        return result;

    }

    public static void main(String[] args) {


    }
}
