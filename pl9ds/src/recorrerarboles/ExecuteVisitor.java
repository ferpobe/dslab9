package recorrerarboles;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

public class ExecuteVisitor implements Visitor {
	@Override
	public Object visit(Programa prog,Object param) {
		// TODO Auto-generated method stub
		for (Sentencia sent : prog.sentencias)
			sent.accept(this,param);
		return null;
	}
	@Override
	public Object visit(Asignacion a , Object param) {
		// TODO Auto-generated method stub
		Variable c =(Variable) a.variable.accept(this, param);
		Variable b =(Variable) a.expr.accept(this, param);
		c=b;
		return null;
		
		
	}

	@Override
	public Object visit(ConstanteInt ci,Object param) {
		// TODO Auto-generated method stub
		
		
		return ci;
		
		
	}

	@Override
	public Object visit(Division d,Object param) {
		// TODO Auto-generated method stub
		int a =(int) d.left.accept(this, param);
		int b =(int) d.right.accept(this, param);
		return a/b;
		
	}

	@Override
	public Object visit(Print p,Object param) {
		// TODO Auto-generated method stub
		p.expr.accept(this,param);
		return null;
		
	}

	@Override
	public Object visit(Producto p,Object param) {
		// TODO Auto-generated method stub
		int a =(int) p.left.accept(this, param);
		int b =(int) p.right.accept(this, param);
		
		return a*b;
		
	}

	

	@Override
	public Object visit(Read r,Object param) {
		// TODO Auto-generated method stub
		r.var.accept(this,param);
		return null;
		
	}

	@Override
	public Object  visit(Suma s,Object param) {
		// TODO Auto-generated method stub
		int a =(int) s.left.accept(this, param);
		int b =(int) s.right.accept(this, param);
		return a+b;
		
	}

	@Override
	public Object visit(Variable var,Object param) {
		// TODO Auto-generated method stub
		
		return var;
		
	}

}
