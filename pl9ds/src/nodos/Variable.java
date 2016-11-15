package nodos;

import recorrerarboles.Visitor;

public class Variable implements Expresion {
	public String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		// TODO Auto-generated method stub
		return v.visit(this,param);
	}
	
}
