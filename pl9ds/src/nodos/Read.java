package nodos;

import recorrerarboles.Visitor;

public class Read implements Sentencia {
	public Variable var;

	public Read(Variable var) {
		this.var = var;
	}
	@Override
	public Object accept(Visitor v, Object param) {
		// TODO Auto-generated method stub
		return v.visit(this,param);
	}

}
