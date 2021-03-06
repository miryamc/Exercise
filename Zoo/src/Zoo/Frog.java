package Zoo;

public class Frog extends Animal implements Land , Water {

	public static int NumbersOfLegs = 4;
	
	public Frog() {
		super();
	}
	public Frog(boolean isMammals, boolean isCarnivorous, int mood) {
		super(isMammals, isCarnivorous, mood);
	}

	@Override
	public void SayHello() {
		this.SayHello(this.getMood());
		
	}

	@Override
	public void SayHello(int mood) {

		switch(mood) {
		case Animal.MOOD_HAPPY: System.out.println("quack quack quack on the shore"); // When the frog is in a good mood.
		break;
		case Animal.MOOD_SCARE: System.out.println("plop into the water"); // When the frog is frightened.
		break;
		}
		
	}
	
	@Override
	public int GetNumbersOfLegs() {
		return this.NumbersOfLegs;
	}
	@Override
	public boolean HasGills() {
		return true;
	}
	@Override
	public boolean HasLaysEggs() {
		return true;
	}

}
