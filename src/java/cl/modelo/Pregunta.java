/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.modelo;

/**
 *
 * @author li70v
 */
public class Pregunta {
    
    private int numero;
    private String pregunta;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String respuesta;

    public Pregunta() {
    }

    public Pregunta(int numero, String pregunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String respuesta) {
        this.numero = numero;
        this.pregunta = pregunta;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.respuesta = respuesta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "numero=" + numero + ", pregunta=" + pregunta + ", alternativa1=" + alternativa1 + ", alternativa2=" + alternativa2 + ", alternativa3=" + alternativa3 + ", alternativa4=" + alternativa4 + ", respuesta=" + respuesta + '}';
    }
    
    
    
    
}
