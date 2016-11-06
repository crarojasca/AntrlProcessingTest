package main;

import javax.swing.text.StyledEditorKit.FontSizeAction;

import controlP5.Button;
import processing.core.PConstants;
import processing.core.PFont;

public class TextArea 
{
	float x;
	float y;
	int width;
	int height;
	
	ANTLRTest applet;
	PFont font;
	
	int lineUpperBound = 0;
	int lineLowerBound;
	
	int markerOffset = 0;
	
	String[] lines;
	LineMarker marker;
	
	Button upArrow;
	Button downArrow;
	
	public TextArea( ANTLRTest applet, float x, float y, int width, int height, String[] lines, LineMarker marker ) 
	{
		this.applet = applet;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.lines = lines;
		this.marker = marker;
		this.font = this.applet.createFont( "Consolas", 15 );
		
		if ( lines.length > 27 )
			this.lineLowerBound = 27;
		else
			this.lineLowerBound = lines.length;
		
		upArrow = applet.cp5.addButton( "upArrow" ).setCaptionLabel( "up" ).setSize( 20, 20 ).setPosition( x + width - 20, y );
		downArrow = applet.cp5.addButton( "downArrow" ).setCaptionLabel( "dw" ).setSize( 20, 20 ).setPosition( x + width - 20, y + height - 20 );
	}
	
	public void drawCode( )
	{
		//whole block
		applet.strokeWeight( 1 );
		applet.fill( 255 );
		applet.rect( x, y, width, height );
		
		//line number rect
		applet.fill( 100 );
		applet.rect( x, y, 18, height );
		
		//green marker rect
		if ( marker.y + 2 + markerOffset < y + height && marker.y + 2 + markerOffset >= y )
		{
			applet.noStroke( );
			applet.fill( applet.color( 146, 235, 86 ), 100 );
			applet.rect( x + 18, marker.y + 2 + markerOffset, width - 18, 20 );
		}
		
		applet.stroke( 0 );
		applet.fill( 0 );
		applet.textAlign( PConstants.CENTER );
		
		applet.textSize( 12 );
		for ( int i = ( int ) ( y + 20 ), j = lineUpperBound + 1; i <= height + 30; i += 20, j++ )
		{
			applet.text( j, x + 10, i - 5 );
			applet.line( x, i, x + 18, i );
		}
		
		applet.textSize( 20 );
		applet.textAlign( PConstants.CUSTOM );
		//marker (arrow)
		if ( marker.y + 2 + markerOffset < y + height && marker.y + 2 + markerOffset >= y )
		{
			applet.fill( 0 );
			applet.image( marker.img, marker.x + 10, marker.y + markerOffset + 3 );
		}
		
		applet.textFont( font );		
		for ( int i = lineUpperBound, pos = 40; i < lineLowerBound; i++, pos += 20 )
			applet.text( lines[ i ], x + 24, pos );
	}
	
	void scrollDown( )
	{
		if ( lineLowerBound == lines.length )
			return;
		
		lineLowerBound++;
		lineUpperBound++;
		
		markerOffset -= 20;
	}
	
	void scrollUp( )
	{
		if ( lineUpperBound == 0 )
			return;
		
		lineLowerBound--;
		lineUpperBound--;
		
		markerOffset += 20;
	}
}
