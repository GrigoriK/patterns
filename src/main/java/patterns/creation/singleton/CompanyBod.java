package patterns.creation.singleton;


import lombok.Getter;
import lombok.Setter;
import patterns.creation.singleton.interfaces.Government;

import java.util.Collection;
import java.util.Objects;


public class CompanyBod  {
    @Getter
    @Setter
    private CompanyCEO companyCEO;
    @Getter
    @Setter
    private Collection<CompanyStockholder> companyStockholders;
    @Getter
    private Government russia = Russia.getRussia();

    @Override
    public String toString() {
        return "CompanyBod{" +
                "companyCEO=" + companyCEO.toString() +
                ", companyStockholders=" + companyStockholders.toString() +
                ", russia=" + russia.toString() +
                '}';
    }

    private String getCompanyStockholders(){
     final StringBuilder stringBuilder = new StringBuilder();
        companyStockholders.stream().filter(Objects::nonNull).forEach(companyStockholder->stringBuilder.
                append(companyStockholder.toString()));
        return stringBuilder.toString();

    }


}
