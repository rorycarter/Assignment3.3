package com.tpAssignment3_3;

/**
 * Created by Rory on 2017-03-26.
 */
public class SecondAccImpl implements AccountInterface{

    public int deposit(int x, int y){
        return x+y+2;
    }


    public int withdraw(int x, int y){
        return x-y-2;
    }
}
