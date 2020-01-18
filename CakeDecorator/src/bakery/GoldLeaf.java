package bakery;

public class GoldLeaf extends CakeDecorator {
	Cake cake;
	
	GoldLeaf(Cake cake){
		this.cake = cake;
	}
	@Override
	public String getCakeFlavor() {
		
		//Decorate the flavor of cake passed in with the items selected
		return cake.getCakeFlavor() + "make it shimmer with gold leaf, ";
	}

	@Override
	public double cost() {
		
		//Add the cost of this decoration
		return cake.cost() + 9.99;
	}

}
