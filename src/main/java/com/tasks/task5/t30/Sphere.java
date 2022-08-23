package com.tasks.task5.t30;

public class Sphere {

    String color;

    public double valueSector(int h, int radius) {
        double hd = (double)h;
        double radiusd = (double)radius;
        double valueSector = 2.0 / 3.0 * (double)(Math.PI * radiusd * radiusd * hd);
        return valueSector;
    }

    public double valueSegment(int h, int radius) {
        double hd = (double)h;
        double radiusd = (double)radius;
        double valueSegment = Math.PI * hd * hd * (radiusd - hd / 3);
        return valueSegment;
    }

    public double valueSphere(int radius) {
        double radiusd = (double)radius;
        double valueSphere = 4.0 / 3.0 * (Math.PI * radiusd * radiusd * radiusd);
        return valueSphere;
    }
}
