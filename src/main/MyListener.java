package main;

import java.util.ArrayList;
import java.util.HashMap;

import main.PSeIntLanguageParser.MainprocessContext;

public class MyListener extends PSeIntLanguageBaseListener
{

	HashMap<String,FunctionType> table;
	
	public MyListener( )
	{
		table = new HashMap<>( );
	}	
	
	@Override
	public void enterMainprocess( MainprocessContext ctx ) 
	{
		table.put( "main" , new FunctionType( null, null, ctx.getChild( ctx.getChildCount( ) - 2 ), false ) );
	}
}
