package av1.pergunta1;

public class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if(getDatafim() == "")
            return true;
        else
            return false;
    }

    public String imprimeProjeto(){
        return "\nNome Projeto: " + getNomeProjeto() + "\nDescrição: " +getDescricao() + "\nData inicio: " +getDatainicio() +"\nData fim: " + getDatafim() + "\nDescrição Alimento: " + getDescAlimento() + "\nQuantidade: " +getQtde();
    }
}
