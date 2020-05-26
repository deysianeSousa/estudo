package locadora;

public enum Categoria {
	NORMAL(1.5, 2),
	LANCAMENTO(3, 0),
	INFANTIL(1.5, 3);

	private double multa;
	private int diferencaDias;

	public double getMulta() {
		return multa;
	}
	public int getDiferencaDias() {
		return diferencaDias;
	}

	Categoria(double multa, int diferencaDias) {
		this.multa = multa;
		this.diferencaDias = diferencaDias;
	}

}
