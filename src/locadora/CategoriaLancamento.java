package locadora;

public class CategoriaLancamento implements Categorias {

	@Override
	public Double calculaAluguel(int dias) {
		Double valorMulta = 3.0;
			
		return dias * valorMulta;	
	}

}
