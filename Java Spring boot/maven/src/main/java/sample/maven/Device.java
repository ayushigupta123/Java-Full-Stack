package sample.maven;

public class Device {

	private String deviceName;
	private String deviceType;
	private int no_of_days_for_rent;
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public int getNo_of_days_for_rent() {
		return no_of_days_for_rent;
	}
	public void setNo_of_days_for_rent(int no_of_days_for_rent) {
		this.no_of_days_for_rent = no_of_days_for_rent;
	}
	public Device(String deviceName, String deviceType, int no_of_days_for_rent) {
		super();
		this.deviceName = deviceName;
		this.deviceType = deviceType;
		this.no_of_days_for_rent = no_of_days_for_rent;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Device [deviceName=");
		builder.append(deviceName);
		builder.append(", deviceType=");
		builder.append(deviceType);
		builder.append(", no_of_days_for_rent=");
		builder.append(no_of_days_for_rent);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
