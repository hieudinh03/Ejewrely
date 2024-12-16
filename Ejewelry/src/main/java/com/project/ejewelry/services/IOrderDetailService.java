package com.project.ejewelry.services;

import com.project.ejewelry.dtos.OrderDetailDTO;
import com.project.ejewelry.exceptions.DataNotFoundException;
import com.project.ejewelry.models.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;
    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;
    OrderDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;
    void deleteById(Long id);
    List<OrderDetail> findByOrderId(Long orderId);


}
