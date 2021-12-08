package com.company;

public class Cheese extends Food {
    public double kalories=50.0;
    public Cheese(){
        super ("Сыр");
    }

    public void consume(){
        System.out.println(this + " съеден");
    }
    public Double calculateCalories() {
        return kalories;
    }
}
