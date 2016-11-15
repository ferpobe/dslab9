package nodos;

import recorrerarboles.Visitor;

public class Asignacion implements Sentencia {
	public Variable variable;
	public Expresion expr;

	public Asignacion(Variable variable, Expresion expr) {
		this.variable = variable;
		this.expr = expr;
	}
	
	@Override
	public Object accept(Visitor v, Object param) {
		// TODO Auto-generated method stub
		return v.visit(this,param);
		
		
		
	}


}
