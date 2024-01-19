package ncs.test3;

public class Goods {
	private String name;
	private int priece;
	private int quatity;

	public Goods() {
		super();
	}

	public Goods(String name, int priece, int quatity) {
		super();
		this.name = name;
		this.priece = priece;
		this.quatity = quatity;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", priece=" + priece + ", quatity=" + quatity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriece() {
		return priece;
	}

	public void setPriece(int priece) {
		this.priece = priece;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

}
