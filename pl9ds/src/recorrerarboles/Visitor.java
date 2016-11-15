package recorrerarboles;

import nodos.*;

public interface Visitor {
	Object visit(Asignacion a, Object param);
	Object visit(ConstanteInt ci, Object param);
	Object visit(Division d , Object param);
	Object visit(Print p , Object param);
	Object visit(Producto p ,Object param);
	Object visit(Programa prog , Object param);
	Object visit(Read r, Object param);
	Object visit(Suma s , Object param);
	Object visit(Variable var , Object param);
}
