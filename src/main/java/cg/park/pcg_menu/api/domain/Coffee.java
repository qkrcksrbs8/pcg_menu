package cg.park.pcg_menu.api.domain;

import lombok.Data;

@Data
public class Coffee {

    public Coffee() {}
    public Coffee addName(String name) {
        this.name = name;
        return this;
    }
    public Coffee addDescription(String description) {
        this.description = description;
        return this;
    }
    public Coffee addPrice(double price) {
        this.price = price;
        return this;
    }

    private String name;
    private String description;
    private double price;

}
