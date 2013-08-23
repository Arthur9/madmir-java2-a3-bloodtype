public class TestPatient {
		// Here is the test for patient
		public static void main(String[] args) {
			BloodType marioLemieuxBloodType = new BloodType("B", '+');
			Patient marioLemieux  = new Patient(99076, 35, marioLemieuxBloodType);
			Patient gordieHowe = new Patient();
			Patient wayneGretzky = new Patient ();
			
			gordieHowe.setPatientAge(65);
			gordieHowe.setPatientIdNumber(9909);
			
			System.out.println("Gordie Howe's ID number is " + gordieHowe.getPatientIdNumber() + " And his age is " + gordieHowe.getPatientAge() + " and his blood type is " + gordieHowe.getBloodType() );
			System.out.println("Mario Lemieux's ID number is " + marioLemieux.getPatientIdNumber() + " And his age is " + marioLemieux.getPatientAge() + " and his blood type is " + marioLemieux.getBloodType() );
			System.out.println("Wayne Gretzky's ID number is " + wayneGretzky.getPatientIdNumber() + " And his age is " + wayneGretzky.getPatientAge() + " and his blood type is " + wayneGretzky.getBloodType() );
		}
	
		
		
}