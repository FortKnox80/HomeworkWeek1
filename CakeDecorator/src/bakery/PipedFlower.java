package bakery;

public class PipedFlower extends CakeDecorator {
	Cake cake;
	
	PipedFlower(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getCakeFlavor() {
		
		//Decorate the flavor of cake passed in with the items selected
		return cake.getCakeFlavor() + "put on some yummy piped flowers, ";
	}

	@Override
	public double cost() {
		
		//Add the cost of this decoration
		return cake.cost() + 19.99;
	}

}
