import java.util.ArrayList;
import java.util.List;

public class Handler {
	List<Fountains> List_fountains;
	public Handler() {
		this.List_fountains = new ArrayList<Fountains>();
	}
	
	public void add_fountains(List<Fountains> f) {
		for (Fountains i : f) {
			List_fountains.add(i);
		}
	}
	
	public Fountains getFountain(int i) {
		return List_fountains.get(i);
	}
	
	public void printFountains() {
		for (Fountains i : List_fountains) {
			System.out.println("Fountain: " + i.name +" "+ i.lattitude + " "+  i.longitutude + " "+ i.type + " " + i.ratings + " " + i.comments );
		}
	}
	public void getFountainsInRange(double lat, double longi, float range) {
		
		double [] distance = new double [List_fountains.size()];
		
		double lat2 = lat;
		double lon2 = longi;
		double earthRadius = 3958.75; 
		
		for (int i = 0; i < List_fountains.size(); i++) {
			
			double lat1 = List_fountains.get(i).lattitude;
			double lon1 = List_fountains.get(i).longitutude;
			
		    double dLat = Math.toRadians(lat2-lat1);
		    double dLng = Math.toRadians(lon2-lon1);

		    double sindLat = Math.sin(dLat / 2);
		    double sindLng = Math.sin(dLng / 2);
			
		    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
	        * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));

		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

		    double dist = earthRadius * c;

		    distance[i] = dist;
		}
		
		
		
	}
}
