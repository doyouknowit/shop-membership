package com.sourceworld.shop.domain.customer.gateway;

import com.sourceworld.shop.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
