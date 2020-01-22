import java.util.List;

public class Fountians extends Water_Location{

	public Fountians(float lat, float log, String type, String status, List<Integer> ratings, List<String> comments) {
		super(lat, log, type, status, ratings, comments);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayComment() {
		if (comments.size() != 0) {
			for (String com : comments) {
				System.out.println(com + "/n");
			}
		}
		
	}
	public void display_type() {
		System.out.println(type);
		
	}
	public void display_status() {
		System.out.println(status);
		
	}

}
