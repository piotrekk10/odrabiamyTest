package org.odrabiamy.model;


public class User {

    int id;
    String username;
    String password ;
    int userStatus = 1;

    public User(int id, String username, String password ){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public String  getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassowrd(String password) {
        this.password = password;
    }

    public int getUserStatus(){
        return userStatus;
    }

}
