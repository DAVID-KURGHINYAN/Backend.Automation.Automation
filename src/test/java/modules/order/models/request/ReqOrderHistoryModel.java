package modules.order.models.request;

import lombok.Data;

import java.util.Date;

@Data
public class ReqOrderHistoryModel {
    private int pageNumber;
    private int pageSize;
    private String text;
    private int status;
    private Date dateFrom;
    private Date dateTo;
    private int priceFrom;
    private int priceTo;

    public ReqOrderHistoryModel() {
    }
}
