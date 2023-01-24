package OOP2;

import java.util.Map;

public final class Mutable1 {
    private String field;
    private Map<String, String> fieldMap;

    public Mutable1(String field, Map<String, String> fieldMap) {
        this.field = field;
        this.fieldMap = fieldMap;
    }

    public String getField() {
        return field;
    }

    public Map<String, String> getFieldMap() {
        return fieldMap;
    }
}