package patterns.behavioural.iterator.iterators;

import patterns.behavioural.iterator.RouteIterator;
import patterns.behavioural.iterator.data.RoutePoint;

import java.util.List;

public class TrainIterator extends RouteIterator {

    public TrainIterator(List<RoutePoint> route) {
        super(route);
    }

    @Override
    protected String getTextByPoint(RoutePoint routePoint) {
        int nextStation = index+1;
        if(nextStation<route.size()){
            return "Current station is "+routePoint.name()
                    +"\n Next station is "+ route.get(nextStation);
        }else {
            return routePoint.toString()+".Finish station";
        }

    }
}
