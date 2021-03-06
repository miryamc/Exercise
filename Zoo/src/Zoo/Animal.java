package Zoo;

public abstract class Animal {

	private boolean isMammals;
	private boolean isCarnivorous;
	public static final int MOOD_HAPPY = 1;
	public static final int MOOD_SCARE = 2;
	private int mood;
	
	public boolean isMammals() {
		return isMammals;
	}
	public void setMammals(boolean isMammals) {
		this.isMammals = isMammals;
	}
	public boolean isCarnivorous() {
		return isCarnivorous;
	}
	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Animal(boolean isMammals, boolean isCarnivorous, int mood ) {
		super();
		this.setMammals(isMammals);
		this.setCarnivorous(isCarnivorous);
		this.setMood(mood);
	}
	
	public abstract void SayHello();
	public abstract void SayHello(int mood);
}
