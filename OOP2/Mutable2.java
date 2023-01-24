package OOP2;

import java.util.HashMap;
import java.util.Map;

public class Mutable2 {
    private String field;
    private Map<String, String> fieldMap;

    public Mutable2(String field, Map<String, String> fieldMap) {
        this.field = field;
        Map<String, String> deepCopy = new HashMap<String, String>();
        for (String key : fieldMap.keySet()) {
            deepCopy.put(key, fieldMap.get(key));
        }
        this.fieldMap = deepCopy;
    }

    public String getField() {
        return field;
    }

    public Map<String, String> getFieldMap() {
        Map<String, String> deepCopy = new HashMap<String, String>();
        for (String key : fieldMap.keySet()) {
            deepCopy.put(key, fieldMap.get(key));
        }
        return deepCopy;
    }
}