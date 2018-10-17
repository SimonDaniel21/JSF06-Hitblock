package de.tu_darmstadt.jsf18.critblock.model.entities;

import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import eea.engine.action.basicactions.MoveDownAction;
import eea.engine.action.basicactions.MoveForwardAction;
import eea.engine.action.basicactions.RotateLeftAction;
import eea.engine.component.Component;
import eea.engine.component.render.ImageRenderComponent;
import eea.engine.entity.Entity;
import eea.engine.event.Event;
import eea.engine.event.basicevents.KeyDownEvent;
import eea.engine.event.basicevents.KeyPressedEvent;
import eea.engine.event.basicevents.LoopEvent;

public class Ball extends Entity{

	static int id = 0;
	public Ball() {
		super("Ball" + id);
		id++;
		try {
			addComponent(new ImageRenderComponent(new Image("assets/ball.png")));
		} catch (SlickException e) {
			e.printStackTrace();
		}
		LoopEvent movement = new LoopEvent();
		MoveForwardAction moveAction = new MoveForwardAction(0.04f);
		movement.addAction(moveAction);
		Event ml = new KeyDownEvent(Input.KEY_LEFT);
		ml.addAction(new RotateLeftAction(0.5f));
		setRotation(10);
		addComponent(ml);
		addComponent(movement);
	}

}
