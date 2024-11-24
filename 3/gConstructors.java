public class gConstructors {
    public static void main(String[] args) {
        
        // constructor = special method that is called when an object is instantiated (created)

        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Morty",16,50);

        //System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}
