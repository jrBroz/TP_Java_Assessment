package Infnet.TP_Assessment.model.user;
import java.time.OffsetDateTime;

import Infnet.TP_Assessment.model.shoppingCart.ShoppingCart;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class User {
 
    @Id
    private long userID;

    @NotNull
    private String  userName;

    @NotNull
    private int quantidadeCompras;

    // implementar funcionalidade de usuario se inscrever em produto pra que ele possa receber
    // notificacao de que ele ficou disponivel

    @NotNull
    private OffsetDateTime dataCadastro;
    
    @NotNull
    private ShoppingCart compras;

}