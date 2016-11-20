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
		
		
		Object c = a.variable.accept(this, param);
		Object b = a.expr.accept(this, param);
		c=b;
		System.out.println(""+c+ " "+b);
		
		
		return c;
		
		
	}

	@Override
	public String visit(ConstanteInt ci,Object param) {
		// TODO Auto-generated method stub
		return ci.valor;
		
		
	}

	@Override
	public Object visit(Division d,Object param) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt( (String) d.left.accept(this, param));
		int b = Integer.parseInt((String) d.right.accept(this, param));
		
		int f=a/b;
		System.out.println(f);
		return f;
		
	}

	@Override
	public Object visit(Print p,Object param) {
		// TODO Auto-generated method stub
		p.expr.accept(this,param);
		return null;
		
	}

	@Override
	public Object visit(Producto p,Object param) {
		int a = Integer.parseInt( (String) p.left.accept(this, param));
		int b = Integer.parseInt((String) p.right.accept(this, param));
		
		int f=a*b;
		System.out.println(f);
		return f;
		
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
		int a = Integer.parseInt( (String) s.left.accept(this, param));
		int b = Integer.parseInt((String) s.right.accept(this, param));
		
		int f=a+b;
		System.out.println(f);
		return f;
		
	}

	@Override
	public String visit(Variable var,Object param) {
		// TODO Auto-generated method stub
		
		return var.name;
		
	}
	public int ConvertirObjectToInt(Object Obj) {
		int NumInt = Integer.parseInt(ConvertirObjectToString(Obj));
		return NumInt;
		}
	
	public String ConvertirObjectToString(Object Obj) {
		String Str="";
		if(Obj!=null){
		Str = Obj.toString();
		}
		return Str;
		}

}
