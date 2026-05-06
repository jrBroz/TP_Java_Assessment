package Infnet.TP_Assessment.model.inventory;
import Infnet.TP_Assessment.model.product.Product;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Inventory {
    
    @Id
    private long id;

    @NotNull
    private Product product;

    @NotNull
    private int quantidadeProduto;

    @NotNull
    private boolean disponivel;
}