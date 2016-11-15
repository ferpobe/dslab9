package nodos;

import recorrerarboles.Visitor;

public class ConstanteInt implements Expresion {
	public String valor;

	public ConstanteInt(String valor) {
		this.valor = valor;
	}
	@Override
	public Object accept(Visitor v, Object param) {
		// TODO Auto-generated method stub
		return v.visit(this,param);
	}

}
