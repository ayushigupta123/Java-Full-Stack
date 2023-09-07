package sample.maven;

public class Location {
	
	private String jobLocation;

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public Location(String jobLocation) {
		super();
		this.jobLocation = jobLocation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [jobLocation=");
		builder.append(jobLocation);
		builder.append("]");
		return builder.toString();
	}
	
	

}
