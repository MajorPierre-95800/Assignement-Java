package inter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Temperature {

	public static void main(String[] args) throws IOException {
		BufferedReader Lecture = null;
		String ligne;
		try 
		{
			Lecture = new BufferedReader(new FileReader("/sys/class/thermal/thermal_zone0/temp"));
		}
		catch (FileNotFoundException exc) 
		{
			System.out.println("Erreur d'ouverture");
		}
		while((ligne = Lecture.readLine()) != null) 
		{
			System.out.println(ligne);
			Lecture.close();
		}

	}

}
