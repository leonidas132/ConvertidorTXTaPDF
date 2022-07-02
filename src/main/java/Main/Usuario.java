package Main;

import java.io.Serializable;

public class Usuario implements Serializable {

    private Integer ID;
    private String clave;

    public Usuario() {
    }

    public Usuario(Integer ID, String clave) {
        this.ID = ID;
        this.clave = clave;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", clave='" + clave + '\'' +
                '}';
    }
}
