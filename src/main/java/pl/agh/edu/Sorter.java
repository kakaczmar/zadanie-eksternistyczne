package pl.agh.edu;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorter {
    Map<String, Double> map = new HashMap<String, Double>();

    public Sorter(Map<String, Double> map) {
        super();
        this.map = map;
    }

    public Map<String, Double> sort() {
        this.map = map;
        Sorter sv = new Sorter(map);
        Map<String, Double> sortedMap = sv.sortByValue(false);
        return sortedMap;
    }

    Map<String, Double> sortByValue(boolean order) {

        List<Entry<String, Double>> list = new LinkedList<Entry<String, Double>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Double>>() {
            public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
        for (Entry<String, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}