package com.mycompany.figurasgeometricasiu;


public class Calculos {
    public static Double CalcAreaCirculo(double RadCirculo){
        return Math.pow(RadCirculo,2)*Math.PI;
    }
    public static Double CalcPerimetroCirculo(double RadCirculo){
        return 2*Math.PI*RadCirculo;
    }
    public static Double CalcAreaCuadrado(double LadCuadrado){
        return LadCuadrado*LadCuadrado;
    }
    public static Double CalcPerimetroCuadrado(double LadCuadrado){
        return LadCuadrado*4;
    }
    public static Double CalcAreaRectangulo(double BasRectangulo, double AltRectangulo){
        return BasRectangulo*AltRectangulo;
    }
    public static Double CalcPerimetroRectangulo(double BasRectangulo, double AltRectangulo){
        return BasRectangulo*2+AltRectangulo*2;
    }
    public static Double CalcAreaRombo(double LadRombo, double DiagMayRombo, double DiagMenRombo){
        return ((DiagMayRombo*DiagMenRombo)/2);
    }
    public static Double CalcPerimetroRombo(double LadRombo, double DiagMayRombo, double DiagMenRombo){
        return LadRombo*4;
    }
    public static Double CalcAreaTrapecio(double BasMenTrapecio, double BasMayTrapecio, double AltTrapecio){
       return AltTrapecio*((BasMenTrapecio+BasMayTrapecio)/2);
    }
    public static Double CalcPerimetroTrapecio(double BasMenTrapecio, double BasMayTrapecio, double AltTrapecio){
        double LadSobranteTrap, HipotenusaTrap;
        LadSobranteTrap = (BasMayTrapecio-BasMenTrapecio)/2;
        HipotenusaTrap = Math.sqrt(Math.pow(AltTrapecio, 2)+Math.pow(LadSobranteTrap,2));
        return HipotenusaTrap*2+BasMenTrapecio+BasMayTrapecio;
    }
    public static Double CalcAreaTriangulo(double BasTriangulo, double AltTriangulo){
        return BasTriangulo*AltTriangulo/2;
    }
    public static Double calcPerimetroTriangulo(double BasTriangulo, double AltTriangulo){
        double HipotenusaTriangulo;
        HipotenusaTriangulo = Math.sqrt(Math.pow(BasTriangulo,2)+Math.pow(AltTriangulo,2));
        return HipotenusaTriangulo+BasTriangulo+AltTriangulo;
    }
    public static String tipoTriangulo(double BasTriangulo, double AltTriangulo){
        double HipotenusaTriangulo;
        HipotenusaTriangulo = Math.sqrt(Math.pow(BasTriangulo,2)+Math.pow(AltTriangulo,2));
        if(BasTriangulo==AltTriangulo && AltTriangulo==HipotenusaTriangulo && BasTriangulo==HipotenusaTriangulo){
            return "Equilátero";
        } 
        else if (BasTriangulo!=AltTriangulo && AltTriangulo!=HipotenusaTriangulo && BasTriangulo!=HipotenusaTriangulo){
            return "Escaleno";
        }
        else {
            return "Isóceles";
        }
    }
    
}
