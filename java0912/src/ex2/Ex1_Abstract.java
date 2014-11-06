
package ex2;

public abstract class Ex1_Abstract {
    private String money;
   
    public Ex1_Abstract() { 
        money = "1000";
    }
    abstract public void moveMount();

    public String getMoney() {
        return money;
    }
    

}
