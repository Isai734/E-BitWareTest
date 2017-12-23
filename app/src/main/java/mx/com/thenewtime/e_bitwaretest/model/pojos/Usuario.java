package mx.com.thenewtime.e_bitwaretest.model.pojos;


public class Usuario {

    private String Nombre;
    private String Email;
    private String Password;
    private String imgPath;

    public Usuario(String nombre, String email, String password, String imgPath) {
        this.Nombre = nombre;
        this.Email = email;
        this.Password = password;
        this.imgPath = imgPath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Usuario(String nombre, String email, String password) {
        this.Nombre = nombre;
        this.Email = email;
        this.Password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
