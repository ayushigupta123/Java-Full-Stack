package sample.maven;

public class Technician {

	private String technicianName;
	private Device device;
	
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public Technician(String technicianName, Device device) {
		super();
		this.technicianName = technicianName;
		this.device = device;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Technician [technicianName=");
		builder.append(technicianName);
		builder.append(", device=");
		builder.append(device);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
