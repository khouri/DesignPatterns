/*
 * Cria uma instancia fake para todos os dados inexistentes
 * dessa forma evita fazer checgem de tipo de dados, if != null
 * parece interessante mas poderia usar uma exception 
 * para tratar esse caso.
 * */

package NullObject;

public abstract class AbstractCustomer {
	protected String name;
	public abstract boolean isNil();
	public abstract String getName();
}