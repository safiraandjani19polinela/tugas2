package com.enigma.model;
public class Circle {

    public Integer r;
    private Double pi = 3.14;
    public Double getSurface()
    {

        System.out.println(pi);
        Double surface = pi * r * r;
        return surface;
    }

    public Double getRound() {
        Double round= pi * r * 2;
        return round;
    }

    public Double getHalfSurface() { return getSurface() / 2;
    }
    public  Double getHalfRound()
    {
        return getRound()/2;
    }
    public String print(){
        return  "Circle{" + "r=" + r +
                ", pi=" + pi +
                ", surface =" +getSurface()+
                ",round="+getRound()+'}';
    }


}

