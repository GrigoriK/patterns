package patterns.behavioural.iterator.datastorages;

import lombok.Getter;
import lombok.Setter;
import patterns.behavioural.iterator.data.RoutePoint;
import patterns.behavioural.iterator.interfaces.Iterator;
import patterns.behavioural.iterator.interfaces.Route;

import java.util.List;

public class RouteData implements Route {
    @Getter
    @Setter
    private String routeName;
    @Getter
    @Setter
    private List<RoutePoint> route;
    @Getter
    @Setter
    private Iterator<String> iterator;

    public RouteData(String routeName, List<RoutePoint> route, Iterator<String> iterator) {
        this.routeName = routeName;
        this.route = route;
        this.iterator = iterator;
    }

    public RouteData(List<RoutePoint> route, Iterator<String> iterator) {
        this.routeName = "Empty route name";
        this.route = route;
        this.iterator = iterator;
    }

    @Override
    public Iterator<String> getIterator() {
        return iterator;
    }
}
