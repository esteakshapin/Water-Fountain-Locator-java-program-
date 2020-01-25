import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Timer;

public final class Main {
	
	String csv_file_name;
	public static void main(String[] args) {
		try {
			Creating_Fountains cf = new Creating_Fountains();
			Handler h = new Handler();
			
			h.add_fountains(cf.Create_Fountains("/Resources/Fountains_test.csv"));
			
//			h.printFountains();
			
//			h.add_fountains(cf.Create_Fountains("/Resources/AcquaFonte (GIS infor included) - Sheet1.csv"));
			
//			h.printFountains();
			
			// 40.71963	-73.97751 closest to stuy
			
			//40.717892 -74.013908 stuy
			
			h.getFountainsInRange(40.717892, -74.013908, 2);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("no csv file");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("no csv file");
		}
		
		

	}

}
