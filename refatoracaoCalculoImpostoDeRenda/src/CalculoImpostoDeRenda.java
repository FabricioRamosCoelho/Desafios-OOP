public class CalculoImpostoDeRenda {
    
    public static void main(String[] args) {
        
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("pessoa fisica");
        p1.setRendaBruta(1000);
        p1.setCpf("583.358.456-62");
        
        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("pessoa juridica");
        p2.setRendaBruta(5000);
        p2.setCnpj("91.403.512/0001-54");
        
        Aliquota[] aliquota=new Aliquota[2];
        aliquota[0]= p1;
        aliquota[1]=p2;
        for(Aliquota a: aliquota){
            System.out.println(a);
        }
        
        
       
    }             
  }

