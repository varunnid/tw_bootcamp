package com.tw.bootcamp.newspaper;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/5/14
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Money {
    Float credits;

    Money(Float initialCredit){
        if(initialCredit >=0){
        this.credits = initialCredit;
        }else{
            throw new IllegalArgumentException("Invalid Money");
        }
    }

    public Money credit(Money inputMoney){

        credits = credits + inputMoney.credits;
        return new Money(credits);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (credits != null ? !credits.equals(money.credits) : money.credits != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return credits != null ? credits.hashCode() : 0;
    }

    public Money debit(Money inputMoney) throws InsufficientFundException{

        if(credits - inputMoney.credits >= 0 ){
            credits = credits - inputMoney.credits;
            return new Money(credits);

        } else{
            throw new InsufficientFundException("Insufficient Funds. Available Credit : " + credits + ". Requested Debit : " + inputMoney.credits);
        }
    }
}
