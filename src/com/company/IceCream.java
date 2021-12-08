package com.company;

public class IceCream extends Food {

    public boolean equals(Object arg0)  // переопределние метода сравнения
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof IceCream)) return false;
            return sirup.equals(((IceCream)arg0).sirup);
        } else
            return false;
    }

    @Override
    public Double calculateCalories() {
        if(sirup.equals("шоколадное"))
        {
            kalories=178.0;
        }
        else if(sirup.equals("карамельное"))
        {
            kalories=180.0;
        }
        return kalories;
    }

    private String sirup;
    double kalories;
    public String getFilling(){
        return sirup;
    }

    public void setFilling(String sirup){
        this.sirup = sirup;
    }

    public IceCream(String sirup){
        super ("Мороженное");
        this.sirup = sirup;
    }

    public void consume(){
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return super.toString() +" " + sirup ;
    }

}
