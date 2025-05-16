package customCLass.CrudRepositoryInterfaz.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Truck<T> implements Iterable<T> {
    private List<T> objects;
    private int max;

    public Truck(int max) {
        this.max = max;
        this.objects = new ArrayList<>();
    }

    public void add(T object) {
        if(this.objects.size() <= max) {
            this.objects.add(object);
        } else {
            throw new RuntimeException("We don't have space.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objects.iterator();
    }
}
