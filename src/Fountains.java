import java.util.List;

public class Fountains extends Water_Location{

	public Fountains(String n, float lat, float log, String type, String status, List<Integer> ratings, List<String> comments) {
		super(n, lat, log, type, status, ratings, comments);
		// TODO Auto-generated constructor stub
	}


	public void display_type() {
		System.out.println(type);
		
	}
	public void display_status() {
		System.out.println(status);
		
	}


	@Override
	public void addDist(double dist) {
		// TODO Auto-generated method stub
		super.dist = dist;
	}

}
