package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	public int x;
	public int y;
	public Color color;
	public boolean facingLeft;
	public boolean isLittle;

	
	
	public Fish (int startX, int startY, Color c) {
		this.x = startX;
		this.y = startY;
		this.color = c;
		
		public void draw(Graphics2D window); {
			DrawFish.facingRight(window, this.color, this.x, this.y);
			DrawFish.facingLeft(window, this.color, this.x, fish1.y);
			DrawFish.smallFacingLeft(window, this.color, this.x, this.y);
			DrawFish.smallFacingRight(window, this.color, this.x, this.y);
			this.swim();
		
	}
	
	public void swim () {
		this.y + 1;
	}
	}
	

}
