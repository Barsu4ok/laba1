package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) throws Exception {
        String str="Сыр,Яблоко/большое,Мороженное/шоколадное,Яблоко/малое,Яблоко/большое";
        Food[] breakfast=new Food[20];
        String[] str2 = str.split(",");
        int k=0;
        int cheese=0;
        for(String point:str2)
        {
            if(point.contains("/"))
            {
                String[] str3=point.split("/");
                if(str3[0].equals("Яблоко"))
                {
                    breakfast[k]=new Apple(str3[1]);
                }
                if(str3[0].equals("Мороженное"))
                {
                    breakfast[k]=new IceCream(str3[1]);
                }
            }
            if(point.equals("Сыр"))
            {
                breakfast[k]=new Cheese();
                cheese++;
            }
            k++;
        }

        for (int i=0;i<breakfast.length;i++)
        {
            if(breakfast[i]!=null)
            {
                breakfast[i].consume();
            }
        }
        Apple a1=new Apple("большое");
        int applebol=0;
        Apple a2 =new Apple("малое");
        int applemal=0;
        IceCream b1=new IceCream("шоколадное");
        int icecreamchocolad=0;
        IceCream b2=new IceCream("карамельное");
        int icecreamkaramel=0;
        for(int i=0;i<breakfast.length;i++)
        {
            if(breakfast[i]!=null)
            {
                if(breakfast[i].equals(a1))
                {
                    applebol++;
                }
                else if(breakfast[i].equals(a2))
                {
                    applemal++;
                }
                else if(breakfast[i].equals(b1))
                {
                    icecreamchocolad++;
                }
                else if(breakfast[i].equals(b2))
                {
                    icecreamkaramel++;
                }

            }
            else {
                break;
            }
        }
        System.out.println("Приятного аппетита! :)");
        System.out.print("В завтраке было: ");
        if(cheese>=1)
        {
            System.out.print(cheese+" Сыр ");
        }
        if(applebol>=1)
        {
            System.out.print(applebol+" Яблоко большое ");
        }
        if(applemal>=1)
        {
            System.out.print(applemal+" Яблоко малое ");
        }
        if(icecreamchocolad>=1)
        {
            System.out.print(icecreamchocolad+" Мороженное шоколадное ");
        }
        if(icecreamkaramel>=1)
        {
            System.out.print(icecreamkaramel+" Мороженное карамельное ");
            System.out.println("");
        }
        double sum=0;
        for (int i=0;i<breakfast.length;i++)
        {
            if(breakfast[i]!=null)
            {
                sum+=breakfast[i].calculateCalories();
            }
            else
            {
                break;
            }
        }
        System.out.println("");
        System.out.println("Каллорийность завтрака = "+sum+" каллорий");
        Comparator comp=new Comparator("Сортировка по длине названия в обратном порядке: ");
        comp.Get();
        comp.Sortirovka(breakfast);

    }

}
