
public class TelevisionDemo {
	public static void main(String[] args) {
		Television tv1 = new Television("RCA",0);
		System.out.println("Brand: " + tv1.getBrand());
		System.out.println("Power: " + tv1.getPower());
		
		Television tv2 = new Television();
		System.out.println("Brand: " + tv2.getBrand());
		System.out.println("Power: " + tv2.getPower());
		
		Television tv3 = new Television("LG");
		System.out.println("Brand: " + tv3.getBrand());
		System.out.println("Power: " + tv3.getPower());
	}
}


