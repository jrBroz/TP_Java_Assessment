package Infnet.TP_Assessment.model.product;
import java.time.OffsetDateTime;
import Infnet.TP_Assessment.enums.TipoProduct;
import Infnet.TP_Assessment.model.inventory.Inventory;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class Product {

@Id
@NotNull
private Long ID;

@NotNull
private String nomeProduto;

@NotNull
private int quantidadeProduto; 

@NotNull
private TipoProduct tipoProduct;

@NotNull
private OffsetDateTime dataFabricacao;

@NotNull
private OffsetDateTime dataExpiracao;

@NotNull
private Inventory disponivel;
}