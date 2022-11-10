package com.sourceworld.shop.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.sourceworld.shop.dto.CustomerAddCmd;
import com.sourceworld.shop.dto.CustomerListByNameQry;
import com.sourceworld.shop.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
