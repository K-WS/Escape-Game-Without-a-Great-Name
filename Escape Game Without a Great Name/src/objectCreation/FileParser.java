package objectCreation;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import roomStructure.Prop;

public class FileParser{
	private HashMap<String, File> dataFiles;
	
	//konstruktor
	public FileParser() {
		this.dataFiles = new HashMap<String, File>();
	}
	
	
	public void openFile(String filename)throws Exception {
		dataFiles.put(filename,new File(filename));
		

	}
	public String parseOneProp(){
		return null;
		}
	public String[] parseXProps(int x){return null;}
	
	public HashMap<String, Prop> parseAllProps() throws Exception{
		//string - objekti id
		//prop - objekt selles ruumis
		
		Scanner sc = new Scanner(dataFiles.get("props"));
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		return null;
	
	}
	public File loadPictureFromFile(String filename) {  return null;  }

	
	//id, objekti_nimi, ruum, ruumikülg, alamvaade?, x, y, static/dynamic, pildifaili asukoht.
}
