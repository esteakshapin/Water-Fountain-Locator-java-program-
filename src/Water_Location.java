import java.util.List;

public abstract class Water_Location {
	protected float lattitude, longitutude;
	protected String name, type, status;
	protected List<Integer> ratings;
	protected List<String> comments;

	public Water_Location(String n, float lat, float log, String type, String status, List<Integer> ratings, List<String> comments) {
		this.name = n;
		this.lattitude = lat;
		this.longitutude = log;
		this.type = type;
		this.status = status;
		this.ratings = ratings;
		this.comments = comments; 
	}
	
	public abstract void displayComment();
}
