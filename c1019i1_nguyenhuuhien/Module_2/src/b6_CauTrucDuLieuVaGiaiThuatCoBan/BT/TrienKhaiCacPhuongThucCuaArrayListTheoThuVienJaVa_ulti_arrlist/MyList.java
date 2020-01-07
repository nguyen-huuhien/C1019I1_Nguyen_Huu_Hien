package b6_CauTrucDuLieuVaGiaiThuatCoBan.BT.TrienKhaiCacPhuongThucCuaArrayListTheoThuVienJaVa_ulti_arrlist;

import javax.xml.soap.Node;
import java.util.Arrays;

public class MyList<E> {
    public E add;
    /**
     * số lượng phần tử có trong Myarrlist.
     */
    int size = 0;
    /**
     * súc chứa của arrlist
     */
    static final int DEFAULT_CAPACITY = 10;
    /**
     * Mảng chứa các phần tử.
     */
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void Mylist(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity : " + capacity + " có vấn đề!");
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * thêm một phần tử vào MyArrlist.
     *
     * @param element
     * @return
     */

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    /**
     * phương thức tăng kích thước MyArrlist
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
        } else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity );
        }
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index : " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size+1; i >= index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public boolean contain(E element) {
        return this.indexOf(element) >= 0;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Lỗi!" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements [i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }




}
