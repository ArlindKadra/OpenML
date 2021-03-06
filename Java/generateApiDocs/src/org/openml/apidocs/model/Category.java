package org.openml.apidocs.model;

import java.util.ArrayList;

public class Category {

	private String name;
	private ArrayList<Function> functions = new ArrayList<Function>();
	
	public Category( String name ) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int functions() {
		return functions.size();
	}
	
	public void addFunction( Function f ) {
		functions.add( f );
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for( Function f : functions ) {
			sb.append( f + "\n" );
		}
		return sb.toString();
	}
	
	public String generateMenu() {
		StringBuilder sb = new StringBuilder();
		//sb.append( "<li class=\"nav-header\">"+name+"</li>" + "\n");
		
		for( int i = 0; i < functions.size(); i++ ) {
			sb.append( "<li><a href=\"#"+functions.get(i).getName('_')+"\">"+functions.get(i).getName('.')+"</a></li>" + "\n" );
		}
		
		return sb.toString();
	}

}
