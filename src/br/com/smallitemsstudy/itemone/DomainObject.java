package br.com.smallitemsstudy.itemone;

/**
 * ###### Super tipo de camada (Layer Supertype) - Martin Fowler ######
 * 
 * Layersupertype e uma simples ideia que leva para um pequeno padrao. Tudo
 * o que voce precisa e uma superclass para todos os objetos dentro de uma
 * camada. Por example, um Domain Object superclass para todos domain objects
 * dentro do Domain Model. Comuns Funcionalidades, tal como o armazenamento, ou,
 * manipulacao de campos de indentidade podem ser utilizados.
 * 
 * ###### Qunado Usar? ######
 * E usado quando voce tem comuns funcionalidade para todos objetos dentro da camada
 * Layer. E utilizado esse padrao para fazer automaticamente porque e feito um 
 * grande uso de comuns funcionalidades.
 * 
 * */
public abstract class DomainObject {
	
	private final Long id;

	public DomainObject(final Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
}
