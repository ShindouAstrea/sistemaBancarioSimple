/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ShindouAstrea
 */
public class User {
    private static final User instance = new User();
    
    private String rut  ;
    private int password;
    
    public void User ( String rut, int password){
        this.rut = rut ;
        this.password = password;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public static User getInstance(){
        return instance;
    }
    
}
