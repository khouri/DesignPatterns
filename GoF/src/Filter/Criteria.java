/*
 * Sao filtros sucessivos aplcados em cascata o interessante 
 * eh utilizar mais de um AND ou OR.
 * 
 * Fazer querries sobre resultset de base de dados isso sera util
 * 
 * */
package Filter;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}