import java.util.*;

// T serves as generic type. Do not introduce hard-coded types
public class VectorSet<T> extends AbstractSet<T> implements Set<T> {
    private Vector<T> elements = new Vector<T>();

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return new VectorSetIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(T o) {
        if(!elements.contains(o)) {
            elements.add(o);
            return true;
        } else{
        return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("{ ");
        for(T element : elements) {
            str.append(element.toString());
            str.append(" ");
        }
        str.append("}");
        return String.valueOf(str);
    }

    private class VectorSetIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements.get(index++);
        }

        @Override
        public void remove() {
            if (index <= 0) {
                throw new IllegalStateException("Unable to remove element.");
            }
            elements.remove(--index);
        }
    }

}