package SimpleList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Phuong thuc ensureCapa() tang gap doi kich thuoc
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Phuong thuc add()
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    // Phuong thuc get() tra ve phan tu vi tri i trong danh sach
    public E get(int index){
        if(index>size|| index==0){
            throw  new IndexOutOfBoundsException("Không tìm thấy vị trí phù hợp ");
        }
        return (E) elements[index];
    }

}
