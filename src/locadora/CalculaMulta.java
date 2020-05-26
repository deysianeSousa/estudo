package locadora;

public class CalculaMulta {

    private double multa;
    private int dias;
    private int diferecaDias;

    public CalculaMulta(double multa, int diferencaDias, int dias) {
        this.multa = multa;
        this.diferecaDias = diferencaDias;
        this.dias = dias;
    }

    public double returnMulta(){
        return (dias - diferecaDias) * multa;
    }
}
