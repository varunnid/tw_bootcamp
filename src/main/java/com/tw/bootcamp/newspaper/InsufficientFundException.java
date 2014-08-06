package com.tw.bootcamp.newspaper;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/5/14
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class InsufficientFundException extends Exception {
    String message;

    InsufficientFundException (String message){
          this.message = message;
    }

    @Override
    public String getMessage(){
          return this.message;
    }
}
