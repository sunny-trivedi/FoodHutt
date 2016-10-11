package com.example.sandesh.foodhutt;

/**
 * Created by sandesh on 10/8/2016.
 */

public class FoodHutUser extends UserAccounts {
    private String username;
    private String password;
    public FoodHutUser(String username, String pasword)
    {
        this.username = username;
        this.password = pasword;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPassword()
    {
        return this.password;
    }
    public FoodHutUser()
    {

    }
    public void reserve()
    {

    }
    public void findOffer()
    {

    }
}
