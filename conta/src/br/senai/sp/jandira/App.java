package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		/** Formas diferentes de criar objetos **/

		/* Primeiro metodo */
		Conta contaDaMaria = new Conta();
		/* Segundo Metodo */
		Conta contaDoJoao;
		contaDoJoao = new Conta();

		/* Determinar os dados da conta da Maria */
		contaDaMaria.numero = "100-85";
		contaDaMaria.titular = "Maria da Silva";
		contaDaMaria.tipo = "corrente";
		contaDaMaria.ativa = true;
		contaDaMaria.depositar(100);

		/* Determinar os dados da conta do Joao */
		contaDoJoao.numero = "200-96";
		contaDoJoao.titular = "Jo�o Almeida";
		contaDoJoao.tipo = "poupan�a";
		contaDoJoao.ativa = true;
		contaDoJoao.depositar(200);

		/* Colocar 100 reais na conta da Maria */
		contaDaMaria.depositar(58);

		/* Ver as informa��es das contas */
		System.out.println("Numero:" + contaDaMaria.numero);
		System.out.println("Titular:" + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		System.out.println("Tipo:" + contaDaMaria.tipo);
		System.out.println("Ativa:" + contaDaMaria.ativa);
		System.out.println("---------------------------");
		System.out.println("Numero:" + contaDoJoao.numero);
		System.out.println("Titular:" + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		System.out.println("Tipo:" + contaDoJoao.tipo);
		System.out.println("Ativa:" + contaDoJoao.ativa);
		System.out.println("---------------------------");

		/* Colocar 100 reais na conta da Maria */
		contaDaMaria.depositar(-20);

		/* Ver as informa��es das contas */
		System.out.println("Numero:" + contaDaMaria.numero);
		System.out.println("Titular:" + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		System.out.println("Tipo:" + contaDaMaria.tipo);
		System.out.println("Ativa:" + contaDaMaria.ativa);
		System.out.println("---------------------------");
		System.out.println("Numero:" + contaDoJoao.numero);
		System.out.println("Titular:" + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		System.out.println("Tipo:" + contaDoJoao.tipo);
		System.out.println("Ativa:" + contaDoJoao.ativa);
		System.out.println("---------------------------");
	}

}
