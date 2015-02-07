package co.q64.materialbird.game.material.interfaces;

import android.graphics.Canvas;

public interface MaterialElement {
	public void render(Canvas canvas);

	public int getWidth();

	public int getHeight();

	public int getX();

	public int getY();
}