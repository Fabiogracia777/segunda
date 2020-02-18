package monitoramentohospitar;


public class Medico implements Observador{

    
    
    @Override
    public void atualizar(Paciente p) {
        System.out.println("\n Nome: "+ p.getNome() 
                + "\n Batimento Cardiaco: "+ p.getBatimentoCardiaco() 
                +  "\n Temperatura Do Corpo: "+ p.getTemperaturaCorpo());
        
    }

    
    
}
