package sample.Calculate;

public class Calulate {
	
	private int p;
	private int y;
	private int r;
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Calulate(int p, int y, int r) {
		super();
		this.p = p;
		this.y = y;
		this.r = r;
	}
	
	public int calculateSimpleInterest() {
		return p*y*r/100;
	}
	
	

}
