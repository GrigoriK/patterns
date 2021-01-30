package patterns.structural.proxy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.proxy.interfaces.CartoonCup;

@Data
@Slf4j
public class BrandingCup implements CartoonCup {
    private CartoonCup cartoonCup;
    private String brandName;

    public BrandingCup(CartoonCup cartoonCup, String brandName) {
        this.cartoonCup = cartoonCup;
        this.brandName = brandName;
    }

    @Override
    public void produceCartoonCup() {
        cartoonCup.produceCartoonCup();
        log.info("Branding cup");
        log.info("Now, It's cartoon cup with {} logo",brandName);



    }
}
