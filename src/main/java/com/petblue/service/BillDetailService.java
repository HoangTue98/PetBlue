package com.petblue.service;

import com.petblue.beans.BillDetailReturnBean;
import com.petblue.beans.BillDetailReturnCustomerViewBean;
import com.petblue.beans.BillDetailViewBean;
import com.petblue.entitys.BillDetail;
import com.petblue.entitys.Bill;

import java.util.List;

/**
 * @author Hoang_Tue
 */
public interface BillDetailService {

    /**
     * Thêm mới một billDetail
     *
     * @param billDetail
     * @return
     */
    BillDetail createBillDetail(BillDetail billDetail);

    /**
     * Lấy ra toàn bộ billDetail theo Bill
     *
     * @param bill
     * @return
     */
    List<BillDetail> findByBill(Bill bill);

    /**
     * Lấy BillDetail chưa trả theo Bill
     *
     * @param bill
     * @return
     */
    List<BillDetail> getSttOkByBill(Bill bill);

    /**
     * Cập nhật BillDetail
     *
     * @param billDetail
     * @return
     */
    BillDetail updateBillDetail(BillDetail billDetail);

    /**
     * Xoá BillDetail
     *
     * @param billDetail
     * @return
     */
    BillDetail deleteBillDetail(BillDetail billDetail);

    /**
     * Lấy ra BillDetail theo Bill và trạng thái
     *
     * @param bill
     * @param status
     * @return
     */
    List<BillDetail> findByBillDetailReturnInvoicesAndStatus(Bill bill, int status);

    /**
     * Lấy list BillDetail đủ điều kiện trả hàng theo Bill
     *
     * @param bill
     * @return
     */
    List<BillDetail> findByBillDetailEligibleForReturn(Bill bill);

    /**
     * Lấy BillDetail theo id
     *
     * @param billDetailId
     * @return
     */
    BillDetail findById(String billDetailId);

    /**
     * Lấy BillDetail theo người mua
     *
     * @param billDetail
     * @return
     */
    List<BillDetail> returnProductByCustomer(List<BillDetail> billDetail);

    /**
     * Từ chối BillDetail trả hàng
     *
     * @param billDetails
     * @return
     */
    List<BillDetail> prohibitReturn(List<BillDetail> billDetails);

    /**
     * Xác nhận trả hàng
     *
     * @param billDetailReturnBeans
     * @return
     */
    List<BillDetail> verifyReturn(List<BillDetailReturnBean> billDetailReturnBeans);

    /**
     * Trả hàng phía Admin
     *
     * @param billDetailReturnBeans
     * @return
     */
    List<BillDetail> returnBillDetailOfAdmin(List<BillDetailReturnBean> billDetailReturnBeans);

    /**
     * Lấy BillDetailViewBean theo khách hàng mua
     *
     * @param bill
     * @return
     * @throws NumberFormatException
     * @throws ReflectiveOperationException
     */
    List<BillDetailViewBean> findByBillDetailCustumerBy(Bill bill)
            throws NumberFormatException, ReflectiveOperationException;

    /**
     *  Lấy ra BillDetailViewBean khách hàng trả
     * @param bill
     * @return
     * @throws NumberFormatException
     * @throws ReflectiveOperationException
     */
    List<BillDetailViewBean> findByBillDetailCustomerReturn(Bill bill)
            throws NumberFormatException, ReflectiveOperationException;

    /**
     *  Lấy ra BillDetailReturnCustomerViewBean theo cửa hàng trả cho khách
     * @param bill
     * @return
     * @throws NumberFormatException
     * @throws ReflectiveOperationException
     */

    List<BillDetailReturnCustomerViewBean> findByBillDetailStoreReturn(Bill bill)
            throws NumberFormatException, ReflectiveOperationException;


}
