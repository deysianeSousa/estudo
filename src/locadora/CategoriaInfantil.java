package locadora;

public class CategoriaInfantil implements Categorias {

	@Override
	public Double calculaAluguel(int dias) {
		Double valorMulta = 1.5;
        Integer diferencaDias = 3;
        Double totalParcial = 1.0;

        if(dias > 3){
            return totalParcial += (dias - diferencaDias) * valorMulta;
        }
        return totalParcial;
		
	}

}
