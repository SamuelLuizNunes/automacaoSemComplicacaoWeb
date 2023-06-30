package br.com.chronosAcademy.media;

public class Media {
    public String calculaMedia(double v1, double v2) {
        double resultado = (v1 + v2) / 2;
        if (resultado < 5.0){
            return "Reprovado";
        }
        return "Aprovado";
    }
}
