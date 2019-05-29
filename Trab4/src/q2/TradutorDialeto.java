package q2;

public class TradutorDialeto {
	public String traduzir(String linha) {
		linha = linha.replace("R","");
		linha = linha.replace("r","");
		linha = linha.replace("L","U");
		linha = linha.replace("l","u");
		return linha;
	}

}