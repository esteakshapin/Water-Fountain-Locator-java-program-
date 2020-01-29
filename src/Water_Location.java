import java.util.List;

public abstract class Water_Location {
	protected float lattitude, longitutude;
	protected String name, type, status;
	protected List<Integer> ratings;
	protected List<String> comments;
	protected double dist;

	public Water_Location(String n, float lat, float log, String type, String status, List<Integer> ratings,
			List<String> comments) {
		this.name = n;
		this.lattitude = lat;
		this.longitutude = log;
		this.type = type;
		this.status = status;
		this.ratings = ratings;
		this.comments = comments;
	}

	public abstract void addDist(double dist);

	public float getLattitude() {
		return lattitude;
	}

	public void setLattitude(float lattitude) {
		this.lattitude = lattitude;
	}

	public float getLongitutude() {
		return longitutude;
	}

	public void setLongitutude(float longitutude) {
		this.longitutude = longitutude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Integer> getRatings() {
		return ratings;
	}

	public void setRatings(List<Integer> ratings) {
		this.ratings = ratings;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}
}
