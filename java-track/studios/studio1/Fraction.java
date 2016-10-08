package studio1;

public class Fraction {

	private int num;
	private int denom;

	public Fraction(int num, int denom) {

		this.num = num;
		this.denom = denom;

	}

	public int getNum() {
		return this.num;
	}

	public int getDenom() {
		return this.denom;
	}

	public String getSum(Fraction frac) {

		int n = this.num * frac.getDenom() + this.denom * frac.getNum();
		int d = this.denom * frac.getDenom();
		
		Fraction sumFrac = new Fraction(n, d);

		return sumFrac.Simplify();

	}

	public String getProduct(Fraction b) {

		int n = this.num * b.getNum();
		int d = this.denom * b.getDenom();

		Fraction prodFrac = new Fraction(n, d);

		return prodFrac.Simplify();

	}

	public String getReciproc() {

		int d = getNum();
		int n = getDenom();

		Fraction recipFrac = new Fraction(n, d);

		return recipFrac.Simplify();

	}

	public String Simplify() {

		int n = this.num;
		int d = this.denom;

		while (d != 0) {
		int t = d;
		d = n % d;
		n = t;
		}

		int gcd = n;

		this.num /= gcd;
		this.denom /= gcd; 
		
		String answer = this.num + "/" + this.denom;

		return answer;
		
	}
	
	
	

	public static void main(String[] args) {

		Fraction frac1 = new Fraction(40, 50);
		Fraction frac2 = new Fraction(8, 248);

		System.out.println(frac1.getReciproc());
		System.out.println(frac2.getReciproc());

		System.out.println(frac1.getSum(frac2));
		
		System.out.println(frac2.getProduct(frac1));

		System.out.println(frac1.Simplify());

	}

}
