package testInheritance;

public class Patient extends User{
//Patient: patientId (long), insured (boolean)
	private long patientId;
	
	
	
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	
	
}
