package locadora;

public enum Categoria {
	NORMAL(new CategoriaNormal()),
	LANCAMENTO(new CategoriaLancamento()),
	INFANTIL(new CategoriaInfantil());

	private Categorias categorias;

	Categoria(Categorias categorias) {
		this.categorias = categorias;	
	}
	
	public Categorias getCalculoMulta() {
		return categorias;
	}
	
	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}	

}
