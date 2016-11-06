package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtilities 
{
	public static String[] loadStrings( String filePath )
	{
		File file = new File( filePath );
		if( !file.exists( ) )
		{
			System.err.println( "Error en:readFile(): No existe el archivo " + filePath );
			return null;
		}
		Scanner sn = null;
		try
		{
			sn = new Scanner( file );
		}
		catch ( FileNotFoundException e )
		{
			System.err.println( "Error en:readFile(): Captured Exception" );
			e.printStackTrace( );
		}
		if( sn == null )
		{
			return null;
		}
		
		ArrayList<String> answer = new ArrayList<String>( );
		while( sn.hasNextLine( ) )
		{
			String str = sn.nextLine( );
			answer.add( str );
		}
		sn.close( );
		
		String ans[] = new String[ answer.size( ) ];
		for ( int i = 0; i < answer.size( ); i++ )
			ans[ i ] = answer.get( i );
			
		return ans;
	}
}
