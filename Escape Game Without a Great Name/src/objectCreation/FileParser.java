package objectCreation;

import java.io.File;
import java.util.HashMap;

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
	public String[] parseAllProps() { return null; }
	public File loadPictureFromFile(String filename){return null;}

	
	//id, objekti_nimi, ruum, ruumik�lg, alamvaade?, x, y, static/dynamic, pildifaili asukoht.
}
