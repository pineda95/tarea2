package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInputMala extends InputListener{
	PelotitaMala p;
	MiInputMala(PelotitaMala param)
	{
		super();
		p=param;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		System.out.println("pelotita presionada");
		System.exit(0);		
		
		return true;
	}
}

