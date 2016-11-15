package nodos;

import recorrerarboles.Visitor;

public class Print implements Sentencia {
	public Expresion expr;

	public Print(Expresion expr) {
		this.expr = expr;
	}
	@Override
	public Object accept(Visitor v, Object param) {
		// TODO Auto-generated method stub
		return v.visit(this,param);
	}


}
