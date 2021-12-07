
import javax.swing.JFormattedTextField;

public class PessoaFisica extends Aliquota {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf=cpf;
        
    }

    @Override
    public double calcularImposto() {
         return this.getRendaBruta() ;
       
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