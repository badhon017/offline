
package offlinegit;


public class OfflineGit {

    
    public static void main(String[] args) {
        singleton coffee = null;
        coffee = coffee.getCoffee();
        
        iCoffee coff = null;
        coff = singleton.createCoffee ("coffeeA");
        coff.cook();
        
        coff = singleton.createCoffee ("coffeeB");
        coff.cook();
        
        coff = singleton.createCoffee ("coffeeC");
        coff.cook();
        
    }
    
}
