package de.tu_darmstadt.jsf18.critblock.model;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;

import de.tu_darmstadt.jsf18.critblock.model.entities.Ball;
import de.tu_darmstadt.jsf18.critblock.model.entities.Block;
import eea.engine.event.Event;
import eea.engine.event.basicevents.CollisionEvent;

public class BlockHitEvent extends CollisionEvent{

	@Override
	protected boolean performAction(GameContainer gc, StateBasedGame sb, int delta) {
		
		boolean collides = super.performAction(gc, sb, delta);
		if(owner instanceof Ball && collides && getCollidedEntity() instanceof Block){
			Block block = (Block) getCollidedEntity();
			Ball b = (Ball)owner;
			block.hit(b);
		}
		return (collides && getCollidedEntity() instanceof Block);
	}

}
