package user_management;

import user_management.security.Password;

public class User {
private String email;
private Object id;
private String name;
private Password password;
private String password1;


    public User(Integer id, String name, String email, Password password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public User(Integer id, String name, String email, String password1){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password1 = password1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
    public void setPassword(String password1){
        this.password1 = password1;
    }

    @Override
    public String toString() {
        return (name + " - " + email).toString();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
