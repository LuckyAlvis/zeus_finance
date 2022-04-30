package com.dai.zeus.finance.api.pojo.request;

import com.dai.shenzhen.zeus.common.core.model.BaseRequest;
import com.dai.zeus.finance.api.pojo.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class UserReq extends BaseRequest {
    private User user;
}
