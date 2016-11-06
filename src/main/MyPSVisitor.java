package main;

import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;
import main.PSeIntLanguageParser.DrawellipseContext;


public class MyPSVisitor<T> extends PSeIntLanguageBaseVisitor<T> implements Runnable
{
	HashMap<String,FunctionType> functions;	
	MyListener walkerTable;
	ANTLRTest applet;
	Thread hilo;
	TextArea code;

	public MyPSVisitor( HashMap<String,FunctionType> functions2, ANTLRTest applet, MyListener walkerTable, TextArea code ) 
	{
		functions = functions2;
		this.applet = applet;
		this.walkerTable = walkerTable;
		this.code = code;
	}
	
	public void start( )
	{
		if ( hilo == null )
		{
			hilo = new Thread( this );
			hilo.start( );
		}
	}
	
	@SuppressWarnings( "static-access" )
	@Override
	public void run( )
	{
		try 
		{
			hilo.sleep( 2000 );
		} catch ( InterruptedException e ) 
		{
			e.printStackTrace( );
		}
		
	 	visit( ( ParseTree ) walkerTable.table.get( "main" ).statements );
	 	
	 	try 
	 	{
			hilo.join( );
			System.out.println( "Thread joined" );
		} catch ( InterruptedException e ) 
	 	{
			e.printStackTrace( );
		}
	}
	
	@SuppressWarnings( "static-access" )
	@Override
	public T visitDrawellipse( DrawellipseContext ctx ) 
	{
		float x = applet.random( 600, applet.width );
		float y = applet.random( 0, applet.height );
		
		code.marker.y = 20 * ctx.getStart( ).getLine( ) + 3;
		
		while ( applet.imDrawing ){ System.out.println("Waiting!"); }
		
		applet.colors.add( applet.color( applet.random( 0, 255 ), applet.random( 0, 255 ), applet.random( 0, 255 ) ) );
		MyEllipse newEllipse = new MyEllipse( x, y, 40, 40 );
		applet.mainList.add( newEllipse );
		
		System.out.println( "Done." );
		
		try 
		{
			hilo.sleep( 1000 );
		} catch ( InterruptedException e )
		{
			e.printStackTrace( );
		}
		
		return super.visitDrawellipse( ctx );
	}	
}
