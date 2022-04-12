package pl.zaczarowaneslodkosci.dto;

import pl.zaczarowaneslodkosci.entity.CakeEntity;

public class CakeDtoRequest {

    private String name;
    private String color;

    public CakeDtoRequest() {
    }

    public CakeDtoRequest(CakeEntity cakeEntity) {
        this.name = cakeEntity.getName();
        this.color = cakeEntity.getColor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}