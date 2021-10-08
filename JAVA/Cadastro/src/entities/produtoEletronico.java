package entities;

public class produtoEletronico {

	
	public String nomeProduto;
	public double preco;
	public int codBarra;
	
	
	public double total() {
		
		return preco+(0.2*preco);
	}
	
	@Override
	public String toString() {
		return "Produto [modelo=" + nomeProduto+ ", valor=" + preco+  ", valortotal()=" + total() + "]";
	}
}
