package patterns.visitor;

public interface Visitor {
	public String visit(Fruit f);
	public String visit(Meat m);
	public String visit (Toiletries t);
}
