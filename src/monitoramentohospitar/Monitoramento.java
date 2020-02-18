
package monitoramentohospitar;

import java.util.ArrayList;


public class Monitoramento implements Observavel{
    
    ArrayList<Observador> medicos = new ArrayList<>();
    ArrayList<Paciente> pacientes =  new ArrayList<>();
    public int index;
    
    @Override
    public void notificar() {
       
        
    }

    @Override
    public void adicionar(Observador a) {
        this.medicos.add(a);
        
    }

    @Override
    public void remover(Observador a) {
        this.index =this.medicos.indexOf(a);
        if(index >= 0){   
            this.medicos.remove(index);
        } else {
            System.out.println("INVALIDO");
        }
    }

    @Override
    public void atualizarDados() {
        
        
       
    }

    
}
