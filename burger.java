import java.util.LinkedList;

interface  iBuilder
{
    void buildBurger();
    void addPatty ();
    void addSauce();
    void addCheese();
    Food getFood();
}

class Chicken implements  iBuilder
{
    private  Food food = new Food();

    public void buildBurger ()
    {
        food.Add("This is a Chicken Burger with ");
    }
    public void addPatty ()
    {
        food.Add("patty 1");
    }
    public void addSauce ()
    {
        food.Add("Sauce 1");
    }
    public void addCheese ()
    {
        food.Add("Cheese 1");
    }
    public Food getFood ()
    {
        return food;
    }

}

class Beef implements  iBuilder
{
    private  Food food = new Food();

    public void buildBurger ()
    {
        food.Add("This is a Beef Burger with ");
    }
    public void addPatty ()
    {
        food.Add("patty 2");
    }
    public void addSauce ()
    {
        food.Add("Sauce 2");
    }
    public void addCheese ()
    {
        food.Add("Cheese 2");
    }
    public Food getFood ()
    {
        return food;
    }

}

class Food
{
    private LinkedList<String> item;
    public  Food ()
    {
        item = new LinkedList<String >();
    }
    public void Add (String temp) {
        item.addLast(temp);
    }
    public void Show () {
        System.out.println("\n The Burger is Ready as below");
        for (int i=0; i<item.size(); i++) {
            System.out.println(item.get(i));
        }
    }
}
