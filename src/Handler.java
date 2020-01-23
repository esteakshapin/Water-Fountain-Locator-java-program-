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
}
