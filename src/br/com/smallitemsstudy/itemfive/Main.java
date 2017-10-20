package br.com.smallitemsstudy.itemfive;

/**
* ###### Unidade de Trabalho (Unit of Work) - Martin Fowler ######
* 
* Mantem uma lista de objetos afetados por uma transacao comercial e coordena a escrita 
* das mudancas e a resolucao de problemas de concorrencia.
* 
* Quando voce esta puxando dados dentro e fora de um banco de dados, e importante acompanhar 
* o que voce mudou; Caso contrario, esses dados nao serao gravados novamente no banco de dados. 
* Da mesma forma, voce deve inserir novos objetos que voce cria e remover todos os objetos que
* voce exclui.
* 
* Voce pode alterar o banco de dados com cada mudanca para o modelo de objeto, mas isso pode levar 
* a muitas chamadas de banco de dados muito pequenas, o que acaba sendo muito lento. Alem disso, 
* exige que voce tenha uma transacao aberta para toda a interacao, o que e impraticavel se voce 
* tiver uma transacao comercial que abranja varios pedidos. A situação e ainda pior se voce precisar 
* acompanhar os objetos que voce leu, para evitar leituras inconsistentes.
* 
* Uma unidade de trabalho acompanha tudo o que voce faz durante uma transacao comercial que pode 
* afetar o banco de dados. Quando voce terminar, descobre tudo o que precisa ser feito para alterar 
* o banco de dados como resultado do seu trabalho.
* 
* As coisas obvias que o levam a lidar com o banco de dados sao mudancas: o novo objeto criado e os 
* atuais atualizados ou excluidos. Unit of Work e um objeto que acompanha essas coisas. Assim que você 
* comecar a fazer algo que possa afetar um banco de dados, voce cria uma Unidade de Trabalho para acompanhar
* as mudancas. Toda vez que voce cria, altera ou exclui um objeto, voce conta a unidade de trabalho. Voce 
* tambem pode informa-lo sobre os objetos que voce leu para que ele possa verificar leituras inconsistentes, 
* verificando que nenhum dos objetos mudou no banco de dados durante a transação comercial.
* 
* A chave sobre a Unidade de Trabalho e que, quando chegar a hora de se comprometer, a Unidade de Trabalho decide 
* o que fazer. Ele abre uma transacao, faz qualquer verificacao de concorrencia (usando Pessimistic Offline Lock
* ou Optimistic Offline Lock) e escreve mudanças para o banco de dados. Os programadores de aplicativos nunca
* chamam explicitamente de métodos para atualizações de banco de dados. Desta forma, eles não precisam acompanhar
* o que mudou ou se preocupar sobre como a integridade referencial afeta a ordem em que eles precisam fazer as 
* coisas.
* 
* Claro que para isso o trabalho, a Unidade de Trabalho precisa saber quais objetos devem acompanhar. Voce pode 
* fazer isso pelo chamador fazendo isso ou obtendo o objeto para dizer a Unidade de Trabalho.
* 
* Com o registro do chamador, o usuario de um objeto deve se lembrar de registrar o objeto com a Unit of Work 
* para as mudancas. Qualquer objeto que nao esteja registrado nao sera escrito no commit. Embora isso permita 
* que o esquecimento cause problemas, ele da flexibilidade para permitir que as pessoas facam mudancas na 
* memoria que nao querem escrever. Ainda assim, eu argumentaria que isso causaria muito mais confusao do que 
* valeria a pena. E melhor fazer uma copia explicita para esse proposito.
* 
* 
**/ 
public class Main {
	public static void main(String[] args) {
	}
}
