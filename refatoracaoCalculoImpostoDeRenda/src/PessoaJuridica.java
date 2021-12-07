public class PessoaJuridica extends Aliquota {
    
    private String cnpj;

    
    public String getCnpj() {
        return cnpj;
    }

  
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta()*27.5 * 0.01;
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;imposto a ser pago: " + calcularImposto();
        s += "]";
        return s;
    }
    
    
}