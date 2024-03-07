package com.petblue.beans;

import com.petblue.entitys.Bill;
import com.petblue.entitys.BillDetail;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

/**
 * @author Admin on 7/3/2024
 * @project ShopPetBlue
 */
@Data
public class BillAndBillDetail {
    @NonNull
    private Bill bill;
    @NotEmpty
    private List<BillDetail> billDetails;
}
