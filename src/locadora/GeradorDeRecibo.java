package locadora;


public class GeradorDeRecibo {

	public String gera(Cliente cliente) {
		double totalGeral = 0.0;
		String recibo = "Recibo para " + cliente.getNome() + ":\n";
		for (Locacao locacao : cliente.getLocacoes()) {
			Categoria categoria = locacao.getFilme().getCategoria();
			Double totalParcial = categoria.getCalculoMulta().calculaAluguel(locacao.getDiasDeAluguel());
			recibo += locacao.getFilme().getTitulo() + "\t" + totalParcial.toString() + "\n";
			totalGeral += totalParcial;
		}
		recibo += "Total: " + totalGeral + "\n";
		return recibo;
	}

}
