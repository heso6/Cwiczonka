package Klasy.Zad5;

import java.time.LocalDate;

public class Guarantee {

    private Product product;
    private LocalDate validUntil;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public boolean isValid() {
        if (validUntil.isBefore(LocalDate.now())) {
            product = null;
            return false;
        }
        return true;
    }
}
