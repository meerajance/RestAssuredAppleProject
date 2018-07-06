import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RentalCount {
	private int lastweek;
	private int yeartodate;
	public int getLastweek() {
		return lastweek;
	}
	public void setLastweek(int lastweek) {
		this.lastweek = lastweek;
	}
	public int getYeartodate() {
		return yeartodate;
	}
	public void setYeartodate(int yeartodate) {
		this.yeartodate = yeartodate;
	}

}
