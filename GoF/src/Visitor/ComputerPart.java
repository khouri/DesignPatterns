/*
 * Todas as classes derivadas aceitam um visitor, este pode acessar 
 * qualquer um das classes derivadas
 * 
 * */
package Visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}