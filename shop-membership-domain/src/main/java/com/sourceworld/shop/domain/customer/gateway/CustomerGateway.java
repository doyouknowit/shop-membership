package com.sourceworld.shop.domain.customer.gateway;

import com.sourceworld.shop.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
