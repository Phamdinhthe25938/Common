package com.example.common.service;

import com.example.common.Model.BaseResponse;
import com.example.common.enums.SystemMessageCode;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseService {

    public static final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);

    @Resource
    private MessageSource messageSource;

    @Resource
    private ModelMapper modelMapper;

    protected String getMessage(String key, Object... object) {
        return messageSource.getMessage(key, object, LocaleContextHolder.getLocale());
    }

    protected BaseResponse<?> buildExceptionResponse(SystemMessageCode exceptionMsg, Object data) {
        BaseResponse<Object> response = BaseResponse.builder().code(exceptionMsg.getCode())
            .message(exceptionMsg.getMessage()).data(data).build();
        LOGGER.info("API ERROR: {}", response);
        return response;
    }

    protected BaseResponse<?> buildSimpleBaseResponse(SystemMessageCode smc, Object data) {
        return BaseResponse.builder()
            .code(smc.getCode())
            .message(getMessage(smc.getMessage()))
            .data(data)
            .build();
    }

    protected BaseResponse<?> buildMessageWithParamBaseResponse(SystemMessageCode smc, String param,
        Object data) {
        return BaseResponse.builder()
            .code(smc.getCode())
            .message(getMessage(smc.getMessage(), param))
            .data(data)
            .build();
    }

//    protected Pageable buildPageable(MetaList metaList, String classNameRequest) {
//        if(ObjectUtils.isEmpty(metaList)){
//            return Pageable.unpaged();
//        }
//        Pageable pageable = PageRequest.of(Constants.PAGE_NUM_DEFAULT, Constants.PAGE_SIZE_DEFAULT);
//        Sort sort = Sort.unsorted();
//        List<Order> orders = new ArrayList<>();
//        Integer pageNum = metaList.getPageNum();
//        Integer pageSize = metaList.getPageSize();
//        if (pageNum == null || Double.isNaN(pageNum) || pageSize == null || Double
//            .isNaN(pageSize)) {
//            return pageable;
//        }
//        String by = null;
//        if (metaList.getSortBy() != null) {
//            by = StringHelper.upperCamelToLowerUnderScore(metaList.getSortBy());
//        }
//        if (by != null) {
//            Sort.Direction direction =
//                Boolean.TRUE.equals(metaList.getSortDesc()) ? Sort.Direction.DESC
//                    : Sort.Direction.ASC;
//            Order order = new Order(direction, by);
//            orders.add(order);
//        } else {
//            if (isDefaultSortUpdatedDate(classNameRequest)) {
//                Order order = new Order(Sort.Direction.DESC, "created_date");
//                orders.add(order);
//            }
//        }
//        sort = Sort.by(orders);
//
//        return PageRequest.of(pageNum, pageSize, sort);
//    }
//
//    protected MetaList buildMetaList(Pageable pageable, Long total) {
//        Integer pageNum =
//            pageable.isUnpaged() ? Constants.PAGE_NUM_DEFAULT : pageable.getPageNumber();
//        Integer pageSize =
//            pageable.isUnpaged() ? Constants.PAGE_SIZE_DEFAULT : pageable.getPageSize();
//        return MetaList.builder()
//            .pageNum(pageNum)
//            .pageSize(pageSize)
//            .total(total)
//            .build();
//    }
//
//    private boolean isDefaultSortUpdatedDate(String classNameRequest) {
//        return classNameRequest.equals(Constants.SEARCH_DRIVING_LICENSE_TYPE_REQUEST)
//            || classNameRequest.equals(Constants.SEARCH_DRIVER_REQUEST);
//    }

}
