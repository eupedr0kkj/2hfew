package main;
 import java.util.Scanner;

import crud.Cliente.CrudCliente;
//import dao.Cliente_dao;
//import dao.Produto_Dao;
//import dao.Veiculo_dao;
 
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//	Cliente_dao clienteDao = new Cliente_dao();
	//	Produto_Dao produtoDao = new Produto_Dao();
	//	Veiculo_dao veiculoDao = new Veiculo_dao();
		CrudCliente crudCliente = new CrudCliente(null);
		int opc;
		do {
			System.out.println("\n= = = Menu Principal = = =");
			System.out.println("1. - Cliente");
			System.out.println("2. - Veículo");
			System.out.println("3. - Produto");
			System.out.println("0. - Sair");
			opc = scanner.nextInt();
			scanner.nextLine();
			switch(opc) {
			case 1 -> crudCliente.menu();
			case 2 -> crudCliente.menu();
			}
		} while(opc != 0);
		scanner.close();

	}

}
