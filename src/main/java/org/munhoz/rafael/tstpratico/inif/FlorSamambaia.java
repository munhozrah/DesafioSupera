package org.munhoz.rafael.tstpratico.inif;

public class FlorSamambaia {
    public static String tentativaDesenhar (int r1, int x1,int y1,int r2,int x2,int y2) {
        var distancia = (int) Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        if (distancia + r2 > r1)
            return "MORTO";
        return "VIVO";
    }
}
