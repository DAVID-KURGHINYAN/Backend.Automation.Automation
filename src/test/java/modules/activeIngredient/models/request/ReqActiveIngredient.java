package modules.activeIngredient.models.request;

import lombok.Data;

import java.util.List;

@Data
public class ReqActiveIngredient {
    private int pageNumber;
    private int pageSize;
//    private String text;
//    private String productText;
//    private List<Integer> brandIds;
//    private List<Integer> producerIds;
//    private int minPrice;
//    private int maxPrice;
//    private boolean hasDiscount;
//    private int categoryId;

    public ReqActiveIngredient() {
    }
}
