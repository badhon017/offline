
package offlinegit;


interface iCoffee
        {
            void cook();
        }
		
	class  CoffeeA implements iCoffee
    {
        public void cook () {
                    System.out.println("Coffee A is made with milk, caffein and sugar");
         }
    }
	
	class  CoffeeB implements iCoffee
    {
        public void cook () {
        System.out.println("Coffee B is made with milk and Caffein");
    }
    }
	
	class CoffeeC implements iCoffee
    {
        public void cook () {
        System.out.println("Coffee C is made with milk, caffein and sugar");
    }
    }
	
public class singleton {
    private static singleton coffee;

        private singleton() {
        }

        public static singleton getCoffee() {
            if (coffee == null) {
                coffee = new singleton();
            }
            return coffee;
        }
		public static iCoffee createCoffee (String type) {
           if (type == "coffeeA") {
               return new CoffeeA();
           } 
           else if (type == "coffeeB")
               return new CoffeeB();
           else if (type == "coffeeC")
               return new CoffeeC();
           else return null;
        }
}

