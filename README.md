Dado a classe abaixo, favor realizar refatoração criando uma estratégia a qual não será necessário a utilização dos IF:

Obs: Considerar abstração, polimorfismo...

namespace Imposto { 
    public class CalculoImpostoDeRenda {

        private randonly decimal AliquotaImpostoCnpj=27.5m 
        private randonly decimal AliquotaImpostoCpf=22.5m

        public decimal Calcular(String documento, decimal salario)
        {
             if(documento == "CNPJ")
             {
                return (salario * AliquotaImpostoCpf) / 100;
             }
               
            if(documento == "CPF") {
               return (salario * AliquotaImpostoCnpj) / 100;
            }

            return 0;
      }
  }
}
