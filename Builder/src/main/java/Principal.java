
import com.mycompany.builder.Produto;
import com.mycompany.builder.Vendedor;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        
        Produto produto =
                Produto.newBuilder()
                        .setTitulo("Titulo")
                        .setCategoria("Categoria")
                        .setDescricao("Descricao")
                        .setPreco(2)
                        .setDataCadastro(LocalDate.parse("2020-01-08"))
                        .setDataUltimaAtualizacao(LocalDate.parse("2020-01-08"))
                        .setVendedor(new Vendedor())
                        .createProduto();
        
        produto.setDataCadastro(LocalDate.parse("2020-01-10"));
 

        System.out.println(produto.toString());
    }
}
