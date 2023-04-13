package tamilhackstutorials;

class  Box{

	int length; //instance variable
	int Breadth;
	int Height;

	int  volume(){

		return length*Breadth*Height;
	}

	int  Add(){

		return length+Breadth+Height;
	}


	public static void main(String[] args) {

		Box blackbox = new Box();
		Box woodbox = new Box();
		blackbox.length = 10;
		blackbox.Breadth = 12;
		blackbox.Height = 11;

		
		
		woodbox.length = 12;
		woodbox.Breadth = 1;
		woodbox.Height = 10;

		System.out.println("Volume of box blackbox is==> \n"+ blackbox.volume());
		System.out.println("Volume of box woodbox is==> \n"+ woodbox.volume());
		System.out.println("Add of box blackbox is==> \n"+ blackbox.Add());
		System.out.println("Add of box woodbox is==> \n"+ woodbox.Add());



	}
}