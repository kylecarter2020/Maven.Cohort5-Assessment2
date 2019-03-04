package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Map<Integer, String> monthMap;

    public MonthConversion() {
        monthMap = new TreeMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName   - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        this.monthMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return this.monthMap.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer monthNumber = null;
        if (isValidMonth(monthName)) {
            for (Integer key : monthMap.keySet()) {
                if (this.monthMap.get(key).equals(monthName)) {
                    monthNumber = key;
                    break;
                }
            }
        }
        return monthNumber;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return this.monthMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return this.monthMap.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.monthMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName   - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.monthMap.replace(monthNumber, monthName);
    }
}
