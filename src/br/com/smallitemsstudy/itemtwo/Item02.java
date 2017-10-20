package br.com.smallitemsstudy.itemtwo;

/**
 * ###### Interface Separada (Separated Interface) - Martin Fowler ######
 * 
 * Voce como desenvolvedor de sistemas, voce pode melhorar a qualidade de design de 
 * aclopamento deles entre partes do sistema. Um bom caminho para fazer este grupo
 * de classes em packages e controle de dependencias entre eles. Voce pode entao
 * seguir regras sobre como classe dentro de um package podem chamar em outro package -
 * Por exemplo, uns dizem que classes dentro do domain layer talvez nao podem chamar
 * classes dentro do packge de apresentacao.
 * 
 * Contudo, voce talvez precisa para invocar metodos que contradiz a dependencia
 * geral da estrutura. Se entao, use Separated Interface para definir uma interface
 * dentro de um packge, mas a implementacao dela dentro de outro. Este caminho um
 * cliente que precisa da dependencia para interface pode ser completamente ignorada.
 * 
 * ###### How It Works ######
 * 
 * Esse padrao e muito simples de empregar. Essencialmente, tira proveito do fato de 
 * que uma implementação tem uma dependencia de sua interface, mas não vice-versa. 
 * Isso significa que você pode colocar a interface e a implementacao em pacotes 
 * separados e o pacote de implementação tem uma dependência para o pacote de 
 * interface. Outros pacotes podem depender do pacote de interface sem depender do 
 * pacote de implementação.
 * 
 * Voce pode colocar a interface no pacote do cliente (como no esboço) ou em um 
 * terceiro pacote (Pg. 452). Se houver apenas um cliente para a implementacao, 
 * ou todos os clientes estao no mesmo pacote, entao voce tambem pode colocar a 
 * interface com o cliente. Uma boa maneira de pensar sobre isso e que os desenvolvedores
 * do pacote do cliente sao responsaveis por definir a interface. Essencialmente, o 
 * pacote do cliente indica que ele funcionará com qualquer outro pacote que 
 * implemente a interface que define. Se voce tiver varios pacotes de clientes, um 
 * terceiro pacote de interface e melhor. Tambem e melhor se voce quer mostrar que 
 * a definicao da interface nao e responsabilidade dos desenvolvedores de pacotes do 
 * cliente. Este seria o caso se os desenvolvedores da implementacao fossem 
 * responsaveis por isso.
 * 
 * Uma classe abstrata pode fazer uma boa interface porque voce pode ter um comportamento
 * de implementacao comum, mas opcional, nele.
 * 
 * Uma das coisas estranhas sobre interfaces separadas e como instanciar a implementação.
 * Geralmente, requer conhecimento da classe de implementacao. A abordagem comum e 
 * usar um objeto de fabrica separado, onde novamente ha uma Interface Separada para
 * a fabrica. Voce ainda tem que vincular uma implementação a fabrica e o Plugin (499)
 * e uma boa maneira de fazer isso. Nao so significa que nao ha dependencia, mas 
 * tambem defaca a decisao sobre a classe de implementacao para o tempo de 
 * configuracao.
 * 
 * ###### When to Use It ######
 * 
 * Você usa a Separated Interface quando precisar quebrar uma dependência entre duas 
 * partes do sistema. aqui estão alguns exemplos:
 * 
 * 	- Você construiu um código abstrato para casos comuns em um pacote de estrutura 
 * que precisa chamar algum código de aplicativo específico.
 * 
 * 	- Você tem algum código em uma camada que precisa chamar o código em outra 
 * camada que não deve ver, como o código do domínio chamando um Mapeador de Dados.
 * 
 * 	- Você precisa chamar funções desenvolvidas por outro grupo de desenvolvimento, 
 * mas não quer uma dependência em suas APIs.

 * */
public class Item02 {

	public static void main(String[] args) {
	}
}
