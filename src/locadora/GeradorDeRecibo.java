package locadora;


public class GeradorDeRecibo {

	public String gera(Cliente cliente) {
		double totalGeral = 0.0;
		String recibo = "Recibo para " + cliente.getNome() + ":\n";
		for (Locacao locacao : cliente.getLocacoes()) {
			Categoria categoria = locacao.getFilme().getCategoria();
			CalculaMulta calculaMulta =
					new CalculaMulta(categoria.getMulta(), categoria.getDiferencaDias(), locacao.getDiasDeAluguel());
			Double totalParcial = getParciais(categoria,locacao.getDiasDeAluguel());
			recibo += locacao.getFilme().getTitulo() + "\t" + totalParcial.toString() + "\n";
			totalGeral += totalParcial;
		}
		recibo += "Total: " + totalGeral + "\n";
		return recibo;
	}

	private Double getParciais(Categoria categoria, int diasDeAluguel){
		double totalParcial = 0.0;

		switch (categoria) {
			case NORMAL:
				totalParcial += 2.0;
				if(diasDeAluguel > 2) {
					totalParcial += (diasDeAluguel - 2) * categoria.getMulta();
				}
				break;

			case LANCAMENTO:
				totalParcial += diasDeAluguel * 3;
				break;

			case INFANTIL:
				totalParcial += 1.0;
				if(diasDeAluguel > 3) {
					totalParcial += (diasDeAluguel - 3) * 1.5;
				}
				break;
		}
		return totalParcial;
	}

}
