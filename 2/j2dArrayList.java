import java.util.ArrayList;

public class j2dArrayList {

	public static void main(String[] args) {
			
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("bread");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");

		ArrayList<String> drinksList = new ArrayList<>();
		drinksList.add("soda");
		drinksList.add("coffe");
		

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		//System.out.println(bakeryList);
		//System.out.println(bakeryList.get(0));

		//System.out.println(groceryList);
		//System.out.println(groceryList.get(0)); // first list
		System.out.println(groceryList.get(0).get(0)); // first list first element
}
}

