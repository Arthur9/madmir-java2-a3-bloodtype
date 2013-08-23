public class TestBloodType {
	
	// Here is the Test for the Blood Type
		public static void main(String[] args) {
			BloodType morley = new BloodType("B", '-');
			BloodType merle = new BloodType();
			BloodType cj = new BloodType ("AB");
			BloodType josh = new BloodType ('-');
			
			morley.setBloodType("A");
			morley.setRhFactor('+');
			
			System.out.println("Morley's blood type is " + morley.getBloodType() + morley.getRhFactor());
			System.out.println("Merle's blood type is " + merle.getBloodType() + merle.getRhFactor());
			System.out.println("Cj's blood type is " + cj.getBloodType() + cj.getRhFactor());
			System.out.println("Josh's blood type is " + josh.getBloodType() + josh.getRhFactor());
		}
	
		
	
}