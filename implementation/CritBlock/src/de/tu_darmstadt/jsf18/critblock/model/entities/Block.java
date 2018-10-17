package de.tu_darmstadt.jsf18.critblock.model.entities;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import eea.engine.action.basicactions.DestroyEntityAction;
import eea.engine.action.basicactions.RemoveEventAction;
import eea.engine.component.render.ImageRenderComponent;
import eea.engine.entity.Entity;
import eea.engine.event.basicevents.LoopEvent;

public abstract class Block extends Entity{
	
	public static final int BLOCK_WIDTH = 32;

	public Block(int x, int y, Image img) {
		super("block@" + x + "|" + y);
		
		addComponent(new ImageRenderComponent(img));
		
		this.setPosition(new Vector2f(BLOCK_WIDTH/2 + BLOCK_WIDTH*x, BLOCK_WIDTH/2 + BLOCK_WIDTH*y));
	}

	public void hit(Ball b) {
		LoopEvent le = new LoopEvent();
		le.addAction(new DestroyEntityAction());
		this.addComponent(le);
	}

}
