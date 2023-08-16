package sample.maven;

public class Job {

	private Technician technicianName;
    private Location jobLocation;
    
	public Technician getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(Technician technicianName) {
		this.technicianName = technicianName;
	}
	public Location getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(Location jobLocation) {
		this.jobLocation = jobLocation;
	}
	public Job(Technician technicianName, Location jobLocation) {
		super();
		this.technicianName = technicianName;
		this.jobLocation = jobLocation;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Job [technicianName=");
		builder.append(technicianName);
		builder.append(", jobLocation=");
		builder.append(jobLocation);
		builder.append("]");
		return builder.toString();
	}
	
	
    
    
}
