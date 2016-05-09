package gameEngine;

import roomStructure.DynamicProp;
import roomStructure.Prop;

public class Inventory implements Clickable{
	private DynamicProp[] slots;
	private int[] stack;
	
	//oletan, et slots on hoiukoht objektidele praegu
	//selle p�hjal ehitan hetkel inventory
	
	public void add(Prop item){
		for (int i = 0; i<slots.length; i++){
			//if(slots[i].getID == null){slots[i] = item;}
		}
		
	}
	public void remove(int index){
		stack[index] = 0;
	}
	public void displayDescription(int index){
		//oletuslikviis selgituse saamiseks
		//System.out.println(slots[index].getDescription());
	}
	
	public void React(){}

}
