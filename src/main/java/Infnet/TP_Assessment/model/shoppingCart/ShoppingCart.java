package Infnet.TP_Assessment.model.shoppingCart;

import java.time.OffsetDateTime;

import Infnet.TP_Assessment.enums.paymentMethod;
import Infnet.TP_Assessment.model.product.Product;
import Infnet.TP_Assessment.model.user.User;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class ShoppingCart {
    
@Id
private long idCompra;

@NotNull
private Product nomeProduto;

@NotNull
private User comprador; 

@NotNull
private int quantidade;

@NotNull
private OffsetDateTime dataCompra;

@NotNull
private paymentMethod metodoPagamento;
}