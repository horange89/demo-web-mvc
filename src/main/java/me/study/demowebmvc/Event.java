package me.study.demowebmvc;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Event {
    private Integer id;

    private String name;

    @Min(0)
    private Integer limit;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
