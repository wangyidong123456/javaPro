package JAday0205H;

public class Frog extends Animal implements ICraw, ISwimming {

	@Override
	public void swim() {
		System.out.println("Frog.Swimming()");

	}

	@Override
	public void craw() {
		System.out.println("Frog.craw()");
	}

}
