package patterns.behavioural.iterator.iterators;

import lombok.Data;
import patterns.behavioural.iterator.RouteIterator;
import patterns.behavioural.iterator.data.RoutePoint;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Data
public class GuideIterator extends RouteIterator {
    private Map<RoutePoint, String> guideMap;

    public GuideIterator(List<RoutePoint> route) {
        super(route);
        guideMap=getGuideMap();
    }



    private EnumMap<RoutePoint, String> getGuideMap() {
        EnumMap<RoutePoint, String> guideDescription = new EnumMap<RoutePoint, String>(RoutePoint.class);
        guideDescription.put(RoutePoint.MOSCOW, "Point Moscow \nMoscow is a capital of Russian Federation.\n");
        guideDescription.put(RoutePoint.TVER, "Point Tver\n Tver was formerly the capital of a powerful medieval state and a model provincial town in the Russian Empire, with a population of 60,000 on 14 January 1913.\n It is situated at the confluence of the Volga and Tvertsa Rivers.\n");
        guideDescription.put(RoutePoint.VELIKY_NOVGOROD, "Point Veliky Novgorod\nAt its peak during the 14th century, the city was the capital of the Novgorod Republic and was one of Europe's largest cities.\n[15] The \"Veliky\" (\"great\") part was eventually added to city's name to differentiate it from another city of similar name, Nizhny Novgorod (\"lower newtown\").\n");
        guideDescription.put(RoutePoint.SAINT_PETERSBURG, "Point Saint-Petersburg\nThe city was founded by Tsar Peter the Great on 27 May [O.S. 16 May] 1703, on the site of a captured Swedish fortress.\n It served as a capital of the Russian Tsardom and the subsequent Russian Empire from 1713 to 1918\n (being replaced by Moscow for a short period of time between 1728 and 1730). After the October Revolution, the Bolsheviks moved their government to Moscow.[11]\n");
        return guideDescription;
    }

    @Override
    protected String getTextByPoint(RoutePoint routePoint) {
        return guideMap.get(routePoint);
    }
}
