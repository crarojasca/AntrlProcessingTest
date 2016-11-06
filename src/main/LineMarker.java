package main;

import processing.core.PImage;

public class LineMarker 
{
	PImage img;
	float x;
	float y;
	
	public LineMarker( PImage img, float x, float y ) 
	{
		this.img = img;
		this.x = x;
		this.y = y;
	}
}
