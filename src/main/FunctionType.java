package main;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

public class FunctionType 
{
	ArrayList<String> names;
	String retName;
	ParseTree statements;
	boolean ret;
	
	public FunctionType( String retName, ArrayList<String> names, ParseTree statements, boolean ret )
	{
		this.retName = retName;
		this.names = names;
		this.statements = statements;
		this.ret = ret;
	}
}
