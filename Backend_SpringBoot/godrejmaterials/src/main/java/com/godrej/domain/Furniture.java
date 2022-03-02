package com.godrej.domain;

public class Furniture {
private int furniturecode;
private String furniturebrand;
private String furnturetype;
private String furnitureSize;
private int furniturestock;

    public Furniture() {
    }

    public Furniture(int furniturecode, String furniturebrand, String furnturetype, String furnitureSize, int furniturestock) {
        this.furniturecode = furniturecode;
        this.furniturebrand = furniturebrand;
        this.furnturetype = furnturetype;
        this.furnitureSize = furnitureSize;
        this.furniturestock = furniturestock;
    }

    public int getFurniturecode() {
        return furniturecode;
    }

    public void setFurniturecode(int furniturecode) {
        this.furniturecode = furniturecode;
    }

    public String getFurniturebrand() {
        return furniturebrand;
    }

    public void setFurniturebrand(String furniturebrand) {
        this.furniturebrand = furniturebrand;
    }

    public String getFurnturetype() {
        return furnturetype;
    }

    public void setFurnturetype(String furnturetype) {
        this.furnturetype = furnturetype;
    }

    public String getFurnitureSize() {
        return furnitureSize;
    }

    public void setFurnitureSize(String furnitureSize) {
        this.furnitureSize = furnitureSize;
    }

    public int getFurniturestock() {
        return furniturestock;
    }

    public void setFurniturestock(int furniturestock) {
        this.furniturestock = furniturestock;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "furniturecode=" + furniturecode +
                ", furniturebrand='" + furniturebrand + '\'' +
                ", furnturetype='" + furnturetype + '\'' +
                ", furnitureSize='" + furnitureSize + '\'' +
                ", furniturestock=" + furniturestock +
                '}';
    }
}
