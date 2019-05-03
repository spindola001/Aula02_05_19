package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setBairro("Vila nova");
		pf.setCep(5476895);
		pf.setCidade("São Paulo");
		pf.setEndereco("Rua minha rua");
		pf.setEstado("São Paulo");
		pf.setTelefone(953584662);
		pf.setCpf(948739345);
		pj.setCnpj(945348893);
		
		System.out.println(pf.getBairro());
		System.out.println(pf.getCep());
		System.out.println(pf.getCidade());
		System.out.println(pf.getEndereco());
		System.out.println(pf.getEstado());
		System.out.println(pf.getTelefone());
		System.out.println(pf.getCpf());
		System.out.println(pj.getCnpj());
		
		
		
	}

}
