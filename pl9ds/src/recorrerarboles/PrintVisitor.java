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

public class PrintVisitor implements Visitor {

	@Override
	public Object visit(Asignacion a , Object param) {
		// TODO Auto-generated method stub
		a.variable.accept(this,param);
		System.out.print(" = ");
		a.expr.accept(this,param);
		System.out.println(";");
		return null;
		
		
	}

	@Override
	public Object visit(ConstanteInt ci,Object param) {
		// TODO Auto-generated method stub
		System.out.print(ci.valor);
		return null;
		
		
	}

	@Override
	public Object visit(Division d,Object param) {
		// TODO Auto-generated method stub
		d.left.accept(this,param);
		System.out.print(" / ");
		d.right.accept(this,param);
		return null;
		
	}

	@Override
	public Object visit(Print p,Object param) {
		// TODO Auto-generated method stub
		System.out.print("print ");
		p.expr.accept(this,param);
		System.out.println(";");
		return null;
		
	}

	@Override
	public Object visit(Producto p,Object param) {
		// TODO Auto-generated method stub
		p.left.accept(this,param);
		System.out.print(" * ");
		p.right.accept(this,param);
		return null;
		
	}

	@Override
	public Object visit(Programa prog,Object param) {
		// TODO Auto-generated method stub
		for (Sentencia sent : prog.sentencias)
			sent.accept(this,param);
		return null;
	}

	@Override
	public Object visit(Read r,Object param) {
		// TODO Auto-generated method stub
		System.out.print("read ");
		r.var.accept(this,param);
		System.out.println(";");
		return null;
		
	}

	@Override
	public Object  visit(Suma s,Object param) {
		// TODO Auto-generated method stub
		s.left.accept(this,param);
		System.out.print(" + ");
		s.right.accept(this,param);
		return null;
		
	}

	@Override
	public Object visit(Variable var,Object param) {
		// TODO Auto-generated method stub
		System.out.print(var.name);
		return null;
		
	}
		// Hacerla
	
	
}
