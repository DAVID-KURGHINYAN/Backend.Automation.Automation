package modules.user.models.response;

import lombok.Data;
import modules.user.models.PersonDetails;

import java.util.Date;

@Data
public class ResLoginModel {
    private String accessToken;
    private Date expireDate;
    private PersonDetails personDetails;

    public ResLoginModel() {
    }
}
