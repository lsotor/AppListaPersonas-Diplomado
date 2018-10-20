package pe.com.bitall.applistapersonas.model;

public class PersonaModel {
    private String nombres;
    private String email;
    private String telefono;

    public PersonaModel() {
    }

    public PersonaModel(String nombres, String email, String telefono) {
        this.nombres = nombres;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
