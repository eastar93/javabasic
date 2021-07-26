package Chapter05;

class Protoss extends Unit {
	boolean fly;
	public Protoss(String n, boolean b) {
		name = n;
		energy = 100;
		fly = b;
	}
	public void decEnergy() {
		energy--;
	}
}
