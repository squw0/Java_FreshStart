public class cStaticKeyword {
    public static void main(String[] args) {
        
        // static = modifier. A single copy of a variable/method is created and shared.
        //          the class "owns" the static member

        Friend friend1 = new Friend("Adam");
        Friend friend2 = new Friend("Karol");
        Friend friend3 = new Friend("Patrick");
        Friend friend4 = new Friend("Kamil");

        //System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

    }
}
