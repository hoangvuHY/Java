package availableFunction;

import java.util.Map;

import java.util.EnumMap;


public class EnumMapExample1 {
    /**
     * create an enum
     *
     * @author viettuts.vn
     * @param args
     */
    public enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday
    };

    /**
     * main
     *
     * @author viettuts.vn
     * @param args
     */
    public static void main(String[] args) {
        // create enum map
        EnumMap<Days, String> enumMap = new EnumMap<Days, String>(Days.class);
        // add element to map
        enumMap.put(Days.Monday, "1");
        enumMap.put(Days.Tuesday, "2");
        enumMap.put(Days.Wednesday, "3");
        enumMap.put(Days.Thursday, "4");
        enumMap.put(Days.Friday, "5");
        // show map
        for (Map.Entry<Days, String> map : enumMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}