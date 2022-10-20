package cg.park.pcg_menu.api.utils;

import java.util.HashMap;

public class Param extends HashMap {

    public Param(){}
    public Param set(String key, String value) {
        super.put(key, value);
        return this;
    }

    public Param set(String key, int value) {
        super.put(key, value);
        return this;
    }

    public Param set(int key, int value) {
        super.put(key, value);
        return this;
    }

    public Param set(int key, String value) {
        super.put(key, value);
        return this;
    }
}
