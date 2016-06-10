package cl.bean;

import cl.modelo.Registro;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author li70v
 */
@Named(value = "bean")
@SessionScoped
public class RegistroBean implements Serializable {

    /**
     * Creates a new instance of RegistroBean
     */
    private ArrayList<Registro> lista = new ArrayList<>();
    private int idreg;

    private String nick;
    private String mail;
    private String occupation;
    private String country;

    public int getIdreg() {
        return idreg;
    }

    public void setIdreg(int idreg) {
        this.idreg = idreg;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public RegistroBean() {
        
    }

    public String registro() {

                
                lista.add(new Registro(idreg, nick, mail, country, occupation));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Wellcome to BlackHat Game!!"));
                this.setIdreg(this.getIdreg() + 1);
                this.setNick("");
                this.setCountry("");
                this.setMail("");
                this.setOccupation("");
                 return "game";
                
          
        
    }
    
     public void destroyWorld() {
        addMessage("Go a Wall 0f Shapee", "meeee!!!");
    }

     public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    /**
     * @return the lista
     */
    public ArrayList<Registro> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Registro> lista) {
        this.lista = lista;
    }

}
