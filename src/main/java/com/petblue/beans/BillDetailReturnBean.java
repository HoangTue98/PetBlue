package com.petblue.beans;
import com.petblue.entitys.BillDetail;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Admin on 7/3/2024
 * @project ShopPetBlue
 */
public class BillDetailReturnBean {

    @NotNull
    private BillDetail billDetail;
    @NotNull
    private List<Integer> returnTypes;
    @NotBlank
    private List<BillDetail> billDetails;
}
