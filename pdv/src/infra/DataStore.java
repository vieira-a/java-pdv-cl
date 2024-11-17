package infra;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Compra;
import model.Produto;

public class DataStore {
	public static List<Cliente> clientes = new ArrayList<Cliente>();
	public static List<Produto> produtos = new ArrayList<Produto>();
	public static List<Compra> compras = new ArrayList<Compra>();
}
