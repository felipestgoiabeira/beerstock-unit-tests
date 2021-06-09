package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLessThanZeroException extends Exception {

    public BeerStockLessThanZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed will have less than zero stock capacity: %s", id, quantityToDecrement));
    }
}
