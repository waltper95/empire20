package Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String Usuario;
    private String Password;
    private String Name;
    private List<Error> errors;

    public User(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
        errors = new ArrayList<Error>();
    }
    
    public User(String Usuario, String Password, String Name) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.Name = Name;
        errors = new ArrayList<Error>();
    }

    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }   
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    public void addError(Error error){
        errors.add(error);
    }      
    
    public boolean errorExist(){
        return !errors.isEmpty();
    }

    public List<Error> getErrors() {
        return errors;
    }

    
    
    
    
}


