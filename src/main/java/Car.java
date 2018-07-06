import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {
	
	private String make;
	private String model;
	private String vin;
    private Metadata metadata;
	private PerDayRent perdayrent;
	private Metrics metrics;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public PerDayRent getPerdayrent() {
		return perdayrent;
	}
	public void setPerdayrent(PerDayRent perdayrent) {
		this.perdayrent = perdayrent;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}
	
	
}
