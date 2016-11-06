package main;

import processing.core.*;
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import main.MyListener;
import main.MyPSVisitor;
import main.PSeIntLanguageLexer;
import main.PSeIntLanguageParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import controlP5.*;

public class ANTLRTest extends PApplet 
{
	ArrayList<MyEllipse> mainList = new ArrayList<>( );
	HashMap<String,Object> table = new HashMap<>();
	boolean imDrawing;
	TextArea code;
	//cpmenttt
	
	ControlP5 cp5;
	
	ArrayList<Integer> colors = new ArrayList<>( );
	
	public void setup( )
	{	 	
		cp5 = new ControlP5( this );
		
		ANTLRInputStream input = null;
		try 
		{
			input = new ANTLRInputStream( new FileInputStream( new File( "input.txt" ) ) );
		}
		catch ( IOException e ) 
		{
			e.printStackTrace( );
		}
		
	 	String lines[] = loadStrings( "input.txt" );
	 	for ( int i = 0; i < lines.length; i++ )
	 		lines[ i ] = lines[ i ].replaceFirst( "\t", "    " );
	 	
	 	code = new TextArea( this, 40, 25, 500, 540, lines, new LineMarker( loadImage( "img.png" ), 2, 23 ) );
		
		PSeIntLanguageLexer lexer = new PSeIntLanguageLexer( input );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		PSeIntLanguageParser parser = new PSeIntLanguageParser( tokens );
		ParseTree tree = parser.mainprocess( );
		
		MyListener walker = new MyListener( );
	 	ParseTreeWalker.DEFAULT.walk( walker, tree );
	 	 
	 	MyPSVisitor<Object> loader = new MyPSVisitor<Object>( walker.table, this, walker, code );	 	
	 	loader.start( );
	}

	public void draw( )
	{
		background( 61, 12, 17 );
		
		imDrawing = true;
		
		for ( int i = 0; i < mainList.size( ); i++ )
		{
			stroke( colors.get( i ) );
			for ( MyEllipse b : mainList )
				if ( mainList.get( i ) != b )
				{
					float dir = atan2( mainList.get( i ).y - b.y, b.x - mainList.get( i ).x );
					float x1 = mainList.get( i ).x + cos( dir ) * 1;
					float y1 = mainList.get( i ).y + sin( dir ) * 1;
					float x2 = b.x - cos( dir ) * 1;
					float y2 = b.y - sin( dir ) * 1;
					
					line( x1, y1, x2, y2 );
				}
		}
		
		stroke( 0 );
		for ( MyEllipse x : mainList )
		{
			
			
			fill( 255 );
			strokeWeight( 1 );
			ellipse( x.x, x.y, x.width, x.height );
			
			//noFill( );
			//bezier( x1, y1, 700, 300, 700, 300, x2, y2 );
		}
		
		imDrawing = false;
		
		code.drawCode( );
	}
	
	public void settings( )
	{
		size( 1300, 600 );
	}
	
	public void upArrow( )
	{
		code.scrollUp( );
	}
	
	public void downArrow( )
	{
		code.scrollDown( );
	}
	
	public void mouseWheel( MouseEvent event )
	{
		float e = event.getCount( );
		if ( e > 0 )
			code.scrollDown( );
		else
			code.scrollUp( );
	}
	
	static public void main( String[] passedArgs )
	{
		String[] appletArgs = new String[] { "main.ANTLRTest" };
		if ( passedArgs != null ) 
		{
			PApplet.main( concat( appletArgs, passedArgs ) );
		} 
		else
		{
			PApplet.main( appletArgs );
		}
	}
}
