package Model;

public class DAO {
    
    public User exist(User u) {
        if (!u.getUsuario().equalsIgnoreCase("20131022") && 
                !u.getPassword().equals("123456")){
                /*Malo*/
                u.addError(new Error(300, "Mail y Pass incorrecta"));
                return u;
            
        }else if(u.getUsuario().equalsIgnoreCase("20131022")){
            if(u.getPassword().equalsIgnoreCase("123456")){
                return new User(u.getUsuario(),u.getPassword(),"Walter Perez");
            }else{
                User newUser = new User(u.getUsuario(),u.getPassword(),"Walter Perez");
                newUser.addError(new Error(100, "Pass Incorrecta"));
                return newUser;
            }
        }else{
            /*Error de usuario*/
            User newUser = new User(u.getUsuario(), u.getPassword(), u.getName());
            newUser.addError(new Error(200,"User Incorrecto"));
            return newUser;
        }
    }
    
    
}
