Dado a classe abaixo, favor realizar refatoração criando uma estratégia a qual não será necessário a utilização dos IF:

Obs: Considerar abstração, polimorfismo...

namespace Imposto { public class CalculoImpostoDeRenda {

  private randonly decimal AliquotaImpostoCnpj=27.5m 
  private randonly decimal AliquotaImpostoCpf=22.5m

  public decimal Calcular(String documento, decimal salario)
  {
      if(documento=="CNPJ")
      {
      return(salario*_aliquotaImpostoPessoaJuridica)/100;
   }
   else
      if(documento=="CPF")
   {
   return(salario*_aliquotaImpostoPessoaFisica)/100;
}
return 0;
}
} } 
