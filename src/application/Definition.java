package application;

public class Definition {

	public static void main(String[] args) {
		
		System.out.println("Stream\n"
				+ "\t� uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a 'opera��es agradadas'.\n"
				+ "\ttipos de fontes de dados: array, cole��o, fun��o de itera��o, recurso de entrada e sa�da.\n"
				+ "Stream � uma solica��o para processar sequ�ncia de dados de forma:\n"
				+ "\tDeclarativa: itera��o � interna: escondida do programador\n"
				+ "\tParallel-friendly (imut�vel que significa que � thread safe\n"
				+ "\tFacilidade de trabalhar com paralelismo e concorr�ncia.\n"
				+ "\tN�o possui efeitos colaterais\n"
				+ "\tSob demanda (lazy evaluation ou avalia��o tardia)\n"
				+ "\tStream tem acesso sequencial (n�o h� �ndice)\n"
				+ "Single-use: s� pode ser usada uma vez. Se tentar acessar novamente vai disparar uma exce��o.\n"
				+ "\nPIPELINE\n"
				+ "\tpipeline significa linha de montangem\n"
				+ "\topera��es em stream retornam novas stream."
				+ "\tAssim sendo � poss�vel criar uma cadeia de opera��es (fluxo de processamento\n"
				+ "\tO pipeline � composto por zero ou mais opera��es intermedi�rias e uma opera��o terminal.\n"
				+ "\nOPERA��O INTERMEDI�RIA\n"
				+ "\tProduz uma nova stream (encadeamento)\n"
				+ "\t� uma opera��o feita sob demanda (lazy evaluation)\n"
				+ "\tS� � executada quando uma opera��o terminal � invocada (lazy evaluation)\n"
				+ "\texemplos: fitler, map, flatmap, peek, distinct, sorted, skip, limit\n"
				+ "\nOPERA��O TERMINAL\n"
				+ "\tProduz um objeto n�o-stream (cole��o ou outro objeto)\n"
				+ "\tDetermina o fim do processamento de uma stream\n"
				+ "\texemplos: forEach, forEachOrdered, toArray, reduce, collect, min, max, coun, anyMatch, allMatch, noneMatch, findFirst, findAny\n"
				+ "\nCRIANDO STREAM\n"
				+ "\tPara criar uma stream pode ser atrav�s do m�todo stream(), parallelStream(), Stream.of, Stream.ofNullable, Stream.iterate.\n"
				+ "\tTodos esse m�todo devem ser chamados a partir de um objeto Collection.\n");

	}

}
