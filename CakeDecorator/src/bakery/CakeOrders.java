package bakery;

import java.util.Scanner;

public class CakeOrders {

	//Allow the user to choose what type of cake they would like
	public static Cake cakeType(String cakeType, String menu) {
		Cake cake = new UnknownCake();
		
		if (cakeType.toLowerCase().contains("chocolate")) {
			 cake = new ChocolateCake();
			
		} else if (cakeType.toLowerCase().contains("vanilla")) {
			 cake = new VanillaCake();
			
		} else if (cakeType.toLowerCase().contains("carrot")) {
			 cake = new CarrotCake();
			
		} else if (cakeType.toLowerCase().contains("red velvet")) {
			 cake = new RedVelvetCake();
		}
		return cake;
	}

	//Take in the choices from the user to add decorations to the cake they have chosen
	public static Cake decorationType(Cake cakeType, String menu, String decorations) {

		if (decorations.toLowerCase().contains("piped flowers") || decorations.toLowerCase().contains("piped flower")) {
			cakeType = new PipedFlower(cakeType);
			
		} else if (decorations.toLowerCase().contains("fresh flowers")|| decorations.toLowerCase().contains("fresh flower")) {
			cakeType = new FreshFlowers(cakeType);
			
		} else if (decorations.toLowerCase().contains("gold leaf") || decorations.toLowerCase().contains("gold")) {
			cakeType = new GoldLeaf(cakeType);
			
		} else if (decorations.toLowerCase().contains("fruit")) {
			cakeType = new Fruit(cakeType);
			
		} else if (decorations.toLowerCase().contains("writing") || decorations.toLowerCase().contains("letters")) {
			cakeType = new Writing(cakeType);
			
		} else if (decorations.toLowerCase().contains("tier")) {
			cakeType = new ThreeTier(cakeType);
		
		//if the user has selected a decoration that is not offered, let them know, and allow them to select another choice
		} else {
			System.out.println("Our bakers are unable to perform that type of decoration. Please choose something from the menu:  \n" + menu);
		}
		return cakeType;
	}

	public static void main(String[] args) {

		//print out a menu for the user to choose from
		String menu = "===============================\n" + "  Cake Flavors:                \n"
				+ "  Chocolate, Carrot, Vanilla,  \n" + "  Red Velvet           $10.99  \n"
				+ "                               \n" + "  Piped Flowers        $19.99  \n"
				+ "  Fresh Flowers        $29.99  \n" + "  Gold Leaf             $9.99  \n"
				+ "  Fruit                $19.99  \n" + "  Three Tier           $59.99  \n"
				+ "  Writing               $9.99  \n" + "===============================";

		System.out.println(menu);
		
		//Take the cake order from the user
		System.out.println("What type of cake would you like?");
		Scanner userInput = new Scanner(System.in);
		String userSelectedCake = userInput.nextLine();
		
		//Instantiate a cake with the user selected cake type
		Cake cake = cakeType(userSelectedCake, menu);
		
		
		while(true) {
			
			//If the user has not picked out a cake that does no exist, print out which cake they selected
			if(!cake.cakeFlavor.equalsIgnoreCase("Uknown Cake Flavor")) {
				System.out.println(cake.getCakeFlavor());
				break;
			}
			else {
				//If the user has picked a cake that does not exist, inform them, and allow them to select another type
				System.out.println("Sorry, we do not carry that type of cake. Please choose something from our menu: \n " + menu);
				userSelectedCake = userInput.nextLine();
				cake= cakeType(userSelectedCake, menu);
			}
		}
		
		//Allow the user to choose which decorations they would like to put on their cake
		System.out.println("What decorations would you like?");
		String decorations = userInput.nextLine();
		
		while (true) {
			
			//If the user requests no decorations, or they have finished selecting their decorations print out their order and the cost for them
			if (decorations.toLowerCase().contains("no") || decorations.toLowerCase().contains("none") || decorations.toLowerCase().contains("-")) {
				String formattedCost = String.format("%.02f",  cake.cost());
				System.out.printf("Thank you for your order! Here is your order: "
						+ cake.getCakeFlavor() + "\nand the cost is:  $" + formattedCost);
				userInput.close();
				break;
				}
			
			//Decorate the user selected cake with as many decorations as they want, and add the costs automatically
			cake = decorationType(cake, menu, decorations);
			System.out.println("Would you like any other decorations?");
			decorations = userInput.nextLine();
		
			}

		}
	
	}


