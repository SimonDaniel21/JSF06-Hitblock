package de.tu_darmstadt.jsf18.critblock.model.entities;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import de.tu_darmstadt.jsf18.critblock.model.BlockHitEvent;
import eea.engine.action.basicactions.DestroyEntityAction;
import eea.engine.event.basicevents.CollisionEvent;

public class RedBasicBlock extends Block{

	static Image i;
	static{
		try {
			i = new Image("assets/block_red.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public RedBasicBlock(int x, int y){
		super(x, y, i);
		CollisionEvent ce = new CollisionEvent();
		ce.addAction(new DestroyEntityAction());
	}

}
