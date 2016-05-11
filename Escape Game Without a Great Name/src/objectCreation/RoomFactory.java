package objectCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javafx.scene.Group;
import roomStructure.Prop;
import roomStructure.Room;
import roomStructure.ViewPoint;

public class RoomFactory {
	private PropFactory propFactory;
	private ArrayList<Room> rooms;
	
	
	//viewpoint:
	//tuli tsükliga luua arraylist, mille sees on 4 viewpointi
	ArrayList<ViewPoint>(4) BuildViewPoints(){
		ArrayList<ViewPoint> arg = new ArrayList<>(4);
		for(int i = 0; i < 4; i++){
			ViewPoint a = new ViewPoint(new Group(), 1024, 512);
			arg.add(a);
			
		}
		
	}
		
	
		Room A = new Room("A",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
		Room B = new Room("B",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
		Room C = new Room("C",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
		Room D = new Room("D",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
		Room E = new Room("E",new ArrayList<ViewPoint>(2),new ViewPoint(new Group(), 1024, 512));
		
//		Iga viewPointi loomisel peaks propFactory HashMapist välja noppima kõik elemendid, mille võtmed sisaldavad õiget ruumi ja ViewPoindi indeksit. 
//		Selleks võib PropFactorysse abimeetodi teha, mis võtaks argumendiks stringid, nt "A",1. Need elemendid lisada vastavasse ArrayListi. 
//		Muidu luuakse ViewPoint nagu JavaFX Scene - tal peab olema mingi root (nt new Pane() või new Group(); tee ka vastav isendiväli) ning mõõtmed. 
//		Igal ViewPoindil on ka oma taustapilt, mille võiks konstruktoris seada .setStyle()-i abil (CSS). 
		ArrayList<Prop> collectRoomAndSideElements(String room, String side)throws Exception{
			ArrayList<Prop> returnable = new ArrayList<Prop>();
			HashMap<List<String>, Prop> Hasher_Redux = PropFactory.HashProp();
			for(int i = 0; i<Hasher_Redux.size(); i++){
				if (i+1<10){String ID = "00"+Integer.toString(i+1);
				if(Hasher_Redux.containsKey(Arrays.asList(ID, room, side))){
					returnable.add(Hasher_Redux.get(Arrays.asList(ID, room, side)));
				}}
				else if(i+1<100){String ID = "0" + Integer.toString(i+1);
				if(Hasher_Redux.containsKey(Arrays.asList(ID, room, side))){
					returnable.add(Hasher_Redux.get(Arrays.asList(ID, room, side)));
				}}
				else{String ID = Integer.toString(i+1);
				if(Hasher_Redux.containsKey(Arrays.asList(ID, room, side))){
					returnable.add(Hasher_Redux.get(Arrays.asList(ID, room, side)));
				}}
			}
			return returnable;
			
			
		}

}
