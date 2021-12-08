package com.company;

public class Comparator {
    public String sort;
    Comparator(String sort)
    {
        this.sort=sort;
    }
    public void Get()
    {
        System.out.print(sort);
    }
    public void Sortirovka(Food[]breakfast)
    {
        String[] arr=new String[5];
        for(int i=0;i<breakfast.length;i++)
        {
            if(breakfast[i]!=null)
            {
                arr[i]=breakfast[i].name;
            }
            else
            {
                break;
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j= 0;j<arr.length-i;j++)
            {
                if(arr[j].length()<arr[j+1].length())
                {
                    String p=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=p;


                }

            }

        }
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=null)
            {
                System.out.print(arr[i]+" ");
            }
            else
            {
                break;
            }
        }

    }
}
