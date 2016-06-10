
package cl.modelo;

/**
 *
 * @author li70v
 */
public class Registro {
    private int idreg;
    private String nick;
    private String mail;
    private String country;
    private String occupation;

    public Registro() {
        
    }

    public Registro(int idreg, String nick, String mail, String country, String occupation) {
        this.idreg = idreg;
        this.nick = nick;
        this.mail = mail;
        this.country = country;
        this.occupation = occupation;
    }

    
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }
    
    /**
     * @return the idreg
     */
    public int getIdreg() {
        return idreg;
    }

    /**
     * @param idreg the idreg to set
     */
    public void setIdreg(int idreg) {
        this.idreg = idreg;
    }

    @Override
    public String toString() {
        return "Registro{" + "idreg=" + idreg + ", nick=" + nick + ", mail=" + mail + ", country=" + country + ", occupation=" + occupation + '}';
    }
    
    

}
