package section4;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class KWLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    private static class Node<T> {
        public T data;
        public Node<T> next;
        public Node<T> prev;

        public Node(T dataItem) {
            data = dataItem;
        }
    }

    public Iterator<E> iterator() {
        return new KWListIterator(0);
    }
    public ListIterator<E> listIterator() {
        return new KWListIterator(0);
    }
    public ListIterator<E> listIterator(int index) {
        return new KWListIterator(index);
    }

    private class KWListIterator implements ListIterator<E> {
        private Node<E> nextItem;
        private Node<E> lastItemReturned;
        private int index;

        public KWListIterator(int i) {
            if (i < 0 || i > size) {
                throw new IndexOutOfBoundsException("Invalid index" + i);
            }
            lastItemReturned = null;
            if (i == size) {
                index = size;
                nextItem = null;
            }
            else {
                nextItem = head;
                for (index = 0; index < i; index++) {
                    nextItem = nextItem.next;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return nextItem != null;
        }
        @Override
        public boolean hasPrevious() {

            return (nextItem == null && size != 0) || nextItem.prev != null;
        }
        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            lastItemReturned = nextItem;
            nextItem = nextItem.next;
            index++;
            return lastItemReturned.data;
        }
        @Override
            public E previous() {
                if (!hasPrevious())
                    throw new NoSuchElementException();
                if (nextItem == null) // Iterator past the last element
                    nextItem = tail;
                else
                    nextItem = nextItem.prev;
                lastItemReturned = nextItem;
                index--;
                return lastItemReturned.data;
        }

        @Override
        public int nextIndex() {
            return index;
        }

        @Override
        public int previousIndex() {
            return index-1;
        }
        @Override
        public void add(E obj) {
            if (head == null) {
                head = new Node<E>(obj);
                tail = head;
            } else if (nextItem == head) {
                Node<E> newNode = new Node<E>(obj);
                newNode.next = nextItem;
                nextItem.prev = newNode;
                head = newNode;
            } else if (nextItem == null) {

            } else {

            }
            size++;
            index++;
        }
        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }


    }


    public E get(int index) {
        return listIterator(index).next();
    }
    public void add(int index, E obj) {
        listIterator(index).add(obj);
    }
    public int indexOf(E obj) {
        Node<E> p = head;
        int index = 0;
        while(p != null) {
            if (p.data.equals(obj))
                return index;
            p = p.next;
            index++;
        }
        return -1;
    }

    public E remove(int index) {
        if (index <= 0 || index >= size)
            throw new IndexOutOfBoundsException();
        ListIterator<E>  iter = listIterator(index);
        E result = iter.next();
        iter.remove();
        return result;
    }

    public boolean remove(E obj) {
        return true;

    }

    public int size() {
        return size;
    }
}
