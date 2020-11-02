package ru.downwine._15_FifteenthLab.Ex3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

public class MyCollection<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] data;

    public MyCollection(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException();
        data = (E[]) new Object[capacity];
    }

    public MyCollection() {
        this(DEFAULT_CAPACITY);
    }

    public MyCollection(Collection<? extends E> c) {
        this((int) (c.size() * 1.1f));
        addAll(c);
    }

    public void trimToSize() {
        if (size != data.length) {
            E[] newData = (E[]) new Object[size];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public void ensureCapacity(int minCapacity) {
        int current = data.length;
        if (minCapacity > current) {
            E[] newData = (E[]) new Object[Math.max(current * 2, minCapacity)];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (e== data[i])
                return i;
        return -1;
    }

    public int lastIndexOf(Object e) {
        for (int i = size - 1; i >= 0; i--)
            if (e == data[i])
                return i;
        return -1;
    }

    public Object clone() {
        MyCollection<E> clone = null;
        try {
            clone = (MyCollection<E>) super.clone();
            clone.data = (E[]) data.clone();
        } catch (CloneNotSupportedException e) {
        }
        return clone;
    }

    public Object[] toArray() {
        E[] array = (E[]) new Object[size];
        System.arraycopy(data, 0, array, 0, size);
        return array;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
        else if (a.length > size)
            a[size] = null;
        System.arraycopy(data, 0, a, 0, size);
        return a;
    }

    public E get(int index) {
        checkBoundExclusive(index);
        return data[index];
    }

    public E set(int index, E e) {
        checkBoundExclusive(index);
        E result = data[index];
        data[index] = e;
        return result;
    }

    public boolean add(E e) {
        modCount++;
        if (size == data.length)
            ensureCapacity(size + 1);
        data[size++] = e;
        return true;
    }

    public void add(int index, E e) {
        checkBoundInclusive(index);
        modCount++;
        if (size == data.length)
            ensureCapacity(size + 1);
        if (index != size)
            System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = e;
        size++;
    }

    public E remove(int index) {
        checkBoundExclusive(index);
        E r = data[index];
        modCount++;
        if (index != --size)
            System.arraycopy(data, index + 1, data, index, size - index);
        data[size] = null;
        return r;
    }

    public void clear() {
        if (size > 0) {
            modCount++;
            Arrays.fill(data, 0, size, null);
            size = 0;
        }
    }

    public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        checkBoundInclusive(index);
        Iterator<? extends E> itr = c.iterator();
        int csize = c.size();

        modCount++;
        if (csize + size > data.length)
            ensureCapacity(size + csize);
        int end = index + csize;
        if (size > 0 && index != size)
            System.arraycopy(data, index, data, end, size - index);
        size += csize;
        for (; index < end; index++)
            data[index] = itr.next();
        return csize > 0;
    }

    protected void removeRange(int fromIndex, int toIndex) {
        int change = toIndex - fromIndex;
        if (change > 0) {
            modCount++;
            System.arraycopy(data, toIndex, data, fromIndex, size - toIndex);
            size -= change;
        } else if (change < 0)
            throw new IndexOutOfBoundsException();
    }

    private void checkBoundInclusive(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                    + size);
    }

    private void checkBoundExclusive(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    boolean removeAllInternal(Collection<?> c) {
        int i;
        int j;
        for (i = 0; i < size; i++)
            if (c.contains(data[i]))
                break;
        if (i == size)
            return false;

        modCount++;
        for (j = i++; i < size; i++)
            if (!c.contains(data[i]))
                data[j++] = data[i];
        size -= i - j;
        return true;
    }

    boolean retainAllInternal(Collection<?> c) {
        int i;
        int j;
        for (i = 0; i < size; i++)
            if (!c.contains(data[i]))
                break;
        if (i == size)
            return false;
        modCount++;
        for (j = i++; i < size; i++)
            if (c.contains(data[i]))
                data[j++] = data[i];
        size -= i - j;
        return true;
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        int len = data.length;
        s.writeInt(len);
        for (int i = 0; i < size; i++)
            s.writeObject(data[i]);
    }

    private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int capacity = s.readInt();
        data = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++)
            data[i] = (E) s.readObject();
    }
}
