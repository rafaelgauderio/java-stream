package application;

public class Definition {

	public static void main(String[] args) {
		
		System.out.println("Stream\n"
				+ "\tÉ uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a 'operações agradadas'.\n"
				+ "\ttipos de fontes de dados: array, coleção, função de iteração, recurso de entrada e saída.\n"
				+ "Stream é uma solicação para processar sequência de dados de forma:\n"
				+ "\tDeclarativa: iteração é interna: escondida do programador\n"
				+ "\tParallel-friendly (imutável que significa que é thread safe\n"
				+ "\tFacilidade de trabalhar com paralelismo e concorrência.\n"
				+ "\tNão possui efeitos colaterais\n"
				+ "\tSob demanda (lazy evaluation ou avaliação tardia)\n"
				+ "\tStream tem acesso sequencial (não há índice)\n"
				+ "Single-use: só pode ser usada uma vez. Se tentar acessar novamente vai disparar uma exceção.\n"
				+ "\nPIPELINE\n"
				+ "\tpipeline significa linha de montangem\n"
				+ "\toperações em stream retornam novas stream."
				+ "\tAssim sendo é possível criar uma cadeia de operações (fluxo de processamento\n"
				+ "\tO pipeline é composto por zero ou mais operações intermediárias e uma operação terminal.\n"
				+ "\nOPERAÇÃO INTERMEDIÁRIA\n"
				+ "\tProduz uma nova stream (encadeamento)\n"
				+ "\tÉ uma operação feita sob demanda (lazy evaluation)\n"
				+ "\tSó é executada quando uma operação terminal é invocada (lazy evaluation)\n"
				+ "\texemplos: fitler, map, flatmap, peek, distinct, sorted, skip, limit\n"
				+ "\nOPERAÇÃO TERMINAL\n"
				+ "\tProduz um objeto não-stream (coleção ou outro objeto)\n"
				+ "\tDetermina o fim do processamento de uma stream\n"
				+ "\texemplos: forEach, forEachOrdered, toArray, reduce, collect, min, max, coun, anyMatch, allMatch, noneMatch, findFirst, findAny\n"
				+ "\nCRIANDO STREAM\n"
				+ "\tPara criar uma stream pode ser através do método stream(), parallelStream(), Stream.of, Stream.ofNullable, Stream.iterate.\n"
				+ "\tTodos esse método devem ser chamados a partir de um objeto Collection.\n");

	}

}
