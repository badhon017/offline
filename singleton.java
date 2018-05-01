
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
