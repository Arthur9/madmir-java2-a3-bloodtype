
public class BloodType {

	private String bloodType;
	private char rhFactor;
	
	// Here are the Constructors
	public BloodType(String newBloodType, char newRhFactor) {
		bloodType = newBloodType;
		rhFactor = newRhFactor;
	}

	public BloodType(String newBloodType) {
		this(newBloodType,'+');
	}

	public BloodType(char newRhFactor){
		this("O",newRhFactor);
	}
	
	public BloodType() {
		this("O", '-');
	}
	
	
	// These are the Accessor methods
	public String getBloodType() {
		return bloodType;
	}
	
	public char getRhFactor() {
		return rhFactor;
	}
	
	// Mutator methods
	
	public void  setBloodType(String blood){
		bloodType = blood;
	}
	
	public void setRhFactor(char rh) {
		rhFactor = rh;
	}	
	
	
}	