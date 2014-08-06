package com.tw.bootcamp.newspaper;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/5/14
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Wallet {
    Money money;

    Wallet (Money initialMoney) {
         money = initialMoney;
    }

    public Money credit(Money inputMoney){
       return money.credit(inputMoney);
    }

    public Money debit(Money inputMoney) throws InsufficientFundException{
       return money.debit(inputMoney);
    }
}
