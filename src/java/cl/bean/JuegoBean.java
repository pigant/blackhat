
package cl.bean;

import cl.modelo.Pregunta;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.Random;

/**
 *
 * @author li70v
 */
@Named(value = "Juego")
@SessionScoped
public class JuegoBean implements Serializable {

    private ArrayList<Pregunta> lista = new ArrayList<>();
    private int cifra;
    private String respuestaJugador;
    private int numero;
    private String pregunta;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String respuesta;
    private Random rnd = new Random();
    
    
    
    
    public JuegoBean() {
    }
    
    public String crearPregunta(){
       lista.add(new Pregunta(numero, pregunta, alternativa1, alternativa2, alternativa3, alternativa4, respuesta));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Question Added!!"));
                this.setNumero(this.getNumero() + 1);
                this.setPregunta("");
                this.setAlternativa1("");
                this.setAlternativa2("");
                this.setAlternativa3("");
                this.setAlternativa4("");
                this.setRespuesta("");
                
                return "question";
    }
    
    public String jugar(){
        return "register";
    }
    
    public Pregunta nuevoJuego(){
        
        for (Pregunta p : lista){
          return lista.get(rnd.nextInt(lista.size()));
        }
        return lista.get(rnd.nextInt(lista.size()));
       
    }
    
    private String terminarJuego(){
        return null;
    }

    public ArrayList<Pregunta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pregunta> lista) {
        this.lista = lista;
    }

    public int getCifra() {
        return cifra;
    }

    public void setCifra(int cifra) {
        this.cifra = cifra;
    }

    public String getRespuestaJugador() {
        return respuestaJugador;
    }

    public void setRespuestaJugador(String respuestaJugador) {
        this.respuestaJugador = respuestaJugador;
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
    
     
    
      public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    
    
    
    
    
}
