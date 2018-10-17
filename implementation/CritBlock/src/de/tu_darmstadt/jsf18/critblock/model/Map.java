package de.tu_darmstadt.jsf18.critblock.model;

import java.util.ArrayList;
import java.util.List;

import de.tu_darmstadt.jsf18.critblock.model.entities.Block;
import de.tu_darmstadt.jsf18.critblock.model.entities.RedBasicBlock;
import eea.engine.entity.Entity;
import eea.engine.entity.StateBasedEntityManager;

public class Map {
	
	private final static int BLOCK_SIZE = 40; // width and height of block in pixels

	
	public static List<Block> loadBlocksFromFile(String file){
		String[] parts = file.split(";");
		int width = Integer.valueOf(parts[0].split("=")[1]);
		int height = Integer.valueOf(parts[1].split("=")[1]);
		
		String[] sa = parts[2].split(",");
		if(sa.length != width * height){
			System.err.println("throw some Exception, " + sa.length + "entries, but should have " + width*height);
			return null;
		}
		
		ArrayList<Block> blocks = new ArrayList<Block>();
		
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				int i = Integer.valueOf(sa[x + y*width]);
				if(i <= 0) continue;
				
				Block b;
				
				switch (i) {
				case 1:
					b = new RedBasicBlock(x,y);
					break;
				case 2:
					b = new RedBasicBlock(x,y);
				default:
					b = new RedBasicBlock(x,y);
					break;
				}
				
				blocks.add(b);
			}
		}
		return blocks;
	}
	
	public static Map loadFromFile(String path){
		return null;
	}

}
