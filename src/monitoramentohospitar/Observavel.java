package monitoramentohospitar;


public interface Observavel {
    
    public void notificar();
    public void adicionar(Observador a);
    public void remover(Observador a);
    public void atualizarDados();
    
}
