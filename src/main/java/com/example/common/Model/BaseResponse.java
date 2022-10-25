package com.example.common.Model;

import com.example.common.enums.SystemMessageCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Base response.
 *
 * @param <T> the type parameter
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse<T> {

    @Builder.Default
    private String code = "00";

    @Builder.Default
    private String message = "Success";

    private T data;

    @Builder.Default
    private long responseTime = System.currentTimeMillis();

    /**
     * Instantiates a new Base response.
     *
     * @param systemMessageCode the api status
     */
    public BaseResponse(SystemMessageCode systemMessageCode) {

        responseTime = System.currentTimeMillis();
        this.code = systemMessageCode.getCode();
        this.message = systemMessageCode.getMessage();
    }

    /**
     * Instantiates a new Base response.
     *
     * @param data the data
     */
    public BaseResponse(T data) {
        responseTime = System.currentTimeMillis();
        this.code = SystemMessageCode.API_SUCCESS.getCode();
        this.message = SystemMessageCode.API_SUCCESS.getMessage();
        this.data = data;
    }

//    @Override
//    public String toString() {
//        Gson gson = new Gson();
//        return gson.toJson(this);
//    }
}
