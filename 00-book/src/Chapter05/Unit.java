package Chapter05;

abstract class Unit {
	protected String name;
	protected int energy;
	abstract public void decEnergy();
	public int getEnergy() {
		return energy;
	}

}
