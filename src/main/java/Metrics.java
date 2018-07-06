import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metrics {
	private Float yoymaintenancecost;
	public Float getYoymaintenancecost() {
		return yoymaintenancecost;
	}
	public void setYoymaintenancecost(Float yoymaintenancecost) {
		this.yoymaintenancecost = yoymaintenancecost;
	}
	private Float maintainaceCost;
	private Float depreciation;
	private RentalCount rentalcount;
	public Float getMaintainaceCost() {
		return maintainaceCost;
	}
	public void setMaintainaceCost(Float maintainaceCost) {
		this.maintainaceCost = maintainaceCost;
	}
	public Float getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(Float depreciation) {
		this.depreciation = depreciation;
	}
	public RentalCount getRentalcount() {
		return rentalcount;
	}
	public void setRentalcount(RentalCount rentalcount) {
		this.rentalcount = rentalcount;
	}

}
