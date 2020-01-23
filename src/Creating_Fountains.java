import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Creating_Fountains {	
	
	public Creating_Fountains(){
		
	}
	
	public List<Fountains> Create_Fountains(String filename) throws IOException, URISyntaxException {
		
		List<Fountains> list_of_fountains = new ArrayList<Fountains>();
		List<String[]> rows = new ArrayList<String[]>();
		
		File file = new File(getClass().getResource(filename).toURI());
		BufferedReader csvReader = new BufferedReader(new FileReader(file));
		String row;
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		    rows.add(data);
		}
		csvReader.close();
		
		
		for (String [] row1 : rows) {
			List <String> comments = new ArrayList<String>();
			List <Integer> ratings = new ArrayList<Integer>();
			
			//Make sure there is a float
			try {
				Float.parseFloat(row1[1]);
			}catch (NumberFormatException e) {
				row1[1] = "0.0";
			}
			
			//make sure there is a float
			try {
				Float.parseFloat(row1[2]);
			}catch (NumberFormatException e) {
				row1[2] = "0.0";
			}
			
			
			comments.add(row1[5]);
			
			try {
				ratings.add(Integer.parseInt(row1[4]));
				
			}catch (NumberFormatException e) {
				
				row1[4] = "0";
				ratings.add(Integer.parseInt(row1[4]));
				e.printStackTrace();
			}
			
			list_of_fountains.add(new Fountains(row1[0], Float.parseFloat(row1[1]), Float.parseFloat(row1[2]), row1[3], row1[6], ratings , comments));
		}
		
		return list_of_fountains;
	}
	

}
