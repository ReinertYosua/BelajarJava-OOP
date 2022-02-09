package StaticVariable;

public class mainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an1 = new Animal("Harimau");
		an1.show();
		
		Animal.caraBergerak = "Berlari";
		//an1.caraBergerak = "Berlari";
		an1.caraBerkembangBiak = "Bertelur";
		System.out.println(Animal.caraBergerak);
		System.out.println(an1.caraBerkembangBiak);
		
		System.out.println();
		
		Animal an2 = new Animal("Rusa");
		an2.show();
		System.out.println(Animal.caraBergerak);
		System.out.println(an2.caraBerkembangBiak);
	}

}
