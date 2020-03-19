package web.webapp;

import lombok.Data;


@Data
public class ResultResponse {
    private String result;
    private String code;

    public ResultResponse(String result, String code){
        this.result = result;
        this.code = code;
    }

}