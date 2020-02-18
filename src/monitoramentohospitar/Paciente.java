package monitoramentohospitar;

public class Paciente {
    
    private int batimentoCardiaco;
    private int temperaturaCorpo;
    private String nome;
    
    
    public Paciente(int batimentoCardiaco, int temperaturaCorpo, String nome  ) {
        this.batimentoCardiaco = batimentoCardiaco;
        this.temperaturaCorpo = temperaturaCorpo;
        this.nome = nome;
        
        
    
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBatimentoCardiaco() {
        return batimentoCardiaco;
    }

    public void setBatimentoCardiaco(int batimentoCardiaco) {
        this.batimentoCardiaco = batimentoCardiaco;
    }

    public int getTemperaturaCorpo() {
        return temperaturaCorpo;
    }

    public void setTemperaturaCorpo(int temperaturaCorpo) {
        this.temperaturaCorpo = temperaturaCorpo;
    }
    
    
}
