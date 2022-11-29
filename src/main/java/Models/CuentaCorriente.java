
package Models;
/**
 *
 * @author ShindouAstrea
 */
public class CuentaCorriente {
    private long number ;
    private long money ;
    private static final CuentaCorriente instance = new CuentaCorriente(126548453,50000);
    
    public CuentaCorriente(long number, long money) {
        this.number = number;

        this.money = money;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
    public static CuentaCorriente getInstance(){
        return instance;
    }

  
    
    
}
