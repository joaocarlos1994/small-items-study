package br.com.smallitemsstudy.itemthree;

/**
 * ###### Interface Separada (Separated Interface) - Martin Fowler ######
 * 
 * Em domain-driven design, queremos pensar em logica de dominio significativa.
 * Codigo que produz o efeito de uma regra sem indicar explicitamente a regra 
 * nos obriga a pensar de passo-a-passo os procedimentos do software. O mesmo 
 * se aplica a um calculo que apenas resulta da execução de algum codigo, mas 
 * nao e explicito. Sem uma conexao clara com o modelo, e dificil entender o 
 * efeito do codigo ou antecipar o efeito de uma mudanca. A beleza dos objetos 
 * e a sua capacidade de encapsular tudo isso, de modo que o codigo do cliente 
 * e simples e pode ser interpretado em termos de conceitos de nivel superior.
 * 
 * Mas se a interface nao diz ao desenvolvedor do cliente o que ele precisa saber
 * para usar o objeto efetivamente, ele tera que cavar os internos para entender
 * os detalhes de qualquer maneira. Um leitor do codigo do cliente tera que fazer
 * o mesmo. Em seguida, a maior parte do valor do encapsulamento e perdida. 
 * Estamos sempre lutando sobrecarga cognitiva: se a mente do desenvolvedor do 
 * cliente estiver inundada com detalhes sobre como um componente faz seu 
 * trabalho, sua mente nao e clara para descobrir as complexidades do design 
 * do cliente. Isso e verdade mesmo quando a mesma pessoa esta desempenhando ambos
 * os papeis, desenvolvendo e usando seu proprio codigo, porque mesmo que ele nao
 * precise aprender esses detalhes, ha um limite para quantos fatores ele pode 
 * considerar imediatamente.
 * 
 * Coloque nome de classes e operacoes para descrever seu efeito e proposito, sem 
 * referenciar o significado de cada deles e o que eles prometem.  Isso alivia o 
 * desenvolvedor cliente da necessidade de entender os internos. Estes nomes devem 
 * estar em conformidade com a UBIQUITOUS LANGUAGE para que os membros da equipe 
 * possam inferir rapidamente o seu significado.
 * 
 * Todo o mecanismo complicado deve ser encapsulado por tras de interfaces abstratas
 * que falam em termos de intenções e não de siginificados
 * 
 * Nas interfaces publicas do dominio, relacionamentos de estados e regras, mas nao 
 * como sao aplicadas; descrevendo eventos e acoes, mas nao como eles sao realizados; 
 * formule a equacao, mas não o método numérico para resolvê-la. Posicione a questão, 
 * mas não apresente os meios pelos quais a resposta deve ser encontrada.
 * 
 * */
public class Item03 {
	public static void main(String[] args) {
	}
}
