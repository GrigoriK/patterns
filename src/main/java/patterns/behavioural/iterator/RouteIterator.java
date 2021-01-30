package patterns.behavioural.iterator;

import lombok.Data;
import patterns.behavioural.iterator.data.RoutePoint;
import patterns.behavioural.iterator.interfaces.Iterator;

import java.util.List;
@Data
public abstract class RouteIterator implements Iterator<String> {
    protected int index;
    protected List<RoutePoint> route;

    public RouteIterator(List<RoutePoint> route) {
        this.route = route;
    }

    @Override
    public boolean hasNext() {
        return index < route.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            String textByPoint = getTextByPoint(route.get(index));
            index++;
            return textByPoint;
        }
        return null;
    }
    protected abstract String getTextByPoint(RoutePoint routePoint);
}
