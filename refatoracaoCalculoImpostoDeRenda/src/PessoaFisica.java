
public class PessoaFisica extends Aliquota {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();
            return(renda)*22.5 *(0.01);
       
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