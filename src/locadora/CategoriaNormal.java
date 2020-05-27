package locadora;

public class CategoriaNormal implements Categorias{

    @Override
    public Double calculaAluguel(int dias) {
        Double valorMulta = 1.5;
        Integer diferencaDias = 2;
        Double totalParcial = 2.0;

        if(dias > 2){
            return totalParcial += (dias - diferencaDias) * valorMulta;
        }
        return totalParcial;
    }
}
