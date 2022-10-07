package av1.pergunta3;

public class Mensalidade {
    private double valorMensalidade;
    private int numeroIrmaos;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public int getNumeroIrmaos() {
        return numeroIrmaos;
    }

    public void setNumeroIrmaos(int numeroIrmaos) {
        this.numeroIrmaos = numeroIrmaos;
    }

    public double CalculaMensalidade(){
        if(getNumeroIrmaos() == 2){
            valorMensalidade = (getValorMensalidade() / 100 * 10) + valorMensalidade;
        } else if (getNumeroIrmaos() == 1) {
            valorMensalidade = (getValorMensalidade() / 100 * 5) + valorMensalidade;
        } else if (getNumeroIrmaos() == 0){
            valorMensalidade = getValorMensalidade();
        } else if (getNumeroIrmaos() > 2) {
            valorMensalidade = (getValorMensalidade() / 100 * 15) + valorMensalidade;
        }
        return valorMensalidade;
    }

}
