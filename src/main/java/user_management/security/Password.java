package user_management.security;

import org.mindrot.jbcrypt.BCrypt;

public class Password {
//    private final static int workload = 12;
//    private static String salt;
    private static String hash;



    public Password(String password) {
        this.hash = hashPassword(password);
    }

    public static String hashPassword(String password_plaintext) {
        String hash = BCrypt.hashpw(password_plaintext, BCrypt.gensalt());
        return hash;

    }
    public boolean matches(String password_plaintext) {
        // Note: normally a match method would include a check to see if the hash is valid but for this exam we will
        //       assume that all the passwords we will check are valid. All of the password hashes in the users.json
        //       file are valid so there should be no worry about this as long as you don't overwrite them manually.
        if(BCrypt.checkpw(password_plaintext, getHash())){
            return true;
        }else return false;
    }

    public String getHash() {
        return hash;
    }
}
