package patterns.behavioural.iterator.iterators;

import lombok.Data;
import patterns.behavioural.iterator.interfaces.Iterator;
import patterns.behavioural.iterator.interfaces.Route;

import java.util.List;

@Data
public class StraightGuideRoute implements Route {
    private List<String> route;
    private String routeName;

    public StraightGuideRoute(String routeName, List<String> route) {
        this.route = route;
        this.routeName = routeName;
    }

    @Override
    public Iterator getIterator() {
        return new StraightIterator();
    }

    private class StraightIterator implements Iterator {
        private int index;


        @Override

        public boolean hasNext() {
            return index < route.size();
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return route.get(index++);
            }
            return null;
        }
    }
}
