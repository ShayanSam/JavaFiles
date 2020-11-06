package com.ShayanSam;

import java.io.IOException;

public class EceptionsDemmo {

    public static void show(){
        Account a = new Account();
        try {
            a.withdraw(10);
        } catch (MyException2 e) {
            e.printStackTrace();
        }
    }

}
class Account{
    private float balance = 0;
    public void dep(float n) throws IOException{
        if (n<=0)
            throw new IOException();

    }
    public void withdraw(float n) throws MyException2 {
        if(n > balance)
            throw  new MyException2(new MyException());
    }
}
class MyException extends Exception{
    MyException(){
        super("ok");
    }
    MyException(String msg){
        super(msg);
    }
}
class MyException2 extends Exception{
    MyException2(Exception cause){
        super(cause);
    }
}
