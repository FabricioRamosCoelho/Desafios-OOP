
import javax.swing.JFormattedTextField;

public class PessoaFisica extends Aliquota {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf =String.format("xxx.xxx.xxx-xx");
        
    }

    @Override
    public double calcularImposto() {
         return this.getRendaBruta()*22.5*0.01 ;
       
    }

    @Override
    public String toString() {
        String s = "Pessoa Física[";
        s += super.toString();
        s += " ;cpf: " + cpf;
        s += " ;imposto a ser pago: " + calcularImposto();
        s += "]";
        return s;
    }
    
}