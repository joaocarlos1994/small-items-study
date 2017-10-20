package br.com.smallitemsstudy.itemfour;

/**
 * ###### Granularidade (Granularity) - Eric Evans ######
 * 
 * Os SERVIÇOS de graos medios e sem estado podem ser mais faceis de reutilizar nos grandes 
 * sistemas porque encapsulam funcionalidades importantes por tras de uma interface simples. 
 * Alem disso, objetos finos podem gerar mensagens ineficientes em um sistema distribuído.
 * 
 * Conforme discutido anteriormente, objetos de dominio de grao fino podem contribuir para 
 * vazamentos de conhecimento do dominio na camada de aplicativo, onde o comportamento do objeto 
 * de dominio e coordenado. A complexidade de uma interacao altamente detalhada acaba sendo 
 * tratada na camada do aplicativo, permitindo que o conhecimento do dominio se transfira para 
 * o codigo da aplicação ou da interface do usuario, onde e perdido da camada de dominio. 
 * A introducao criteriosa de servicos de dominio pode ajudar a manter a linha brilhante entre 
 * as camadas.
 * 
 * Este padrao favorece a simplicidade da interface sobre o controle e a versatilidade do cliente.
 * Fornece um grao medio de funcionalidade muito util em componentes de embalagem de sistemas grandes
 * ou distribuidos. E as vezes um SERVICO e a maneira mais natural de expressar um conceito de dominio.
 * 
 **/
public class Main {
	public static void main(String[] args) {
	}
}
