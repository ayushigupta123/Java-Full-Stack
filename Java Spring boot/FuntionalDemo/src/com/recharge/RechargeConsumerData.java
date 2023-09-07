package com.recharge;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RechargeConsumerData {
    public void rechargeData(List<Recharge> rechargeList, Function<Recharge, String> func) {
        for (Recharge recharge : rechargeList) {
            String result = func.apply(recharge);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Recharge> rechargeList = new ArrayList<>();
        rechargeList.add(new Recharge(1, 100.0f, "2023-08-11"));
        rechargeList.add(new Recharge(2, 200.0f, "2023-08-12"));
        rechargeList.add(new Recharge(3, 150.0f, "2023-08-10"));

        RechargeConsumerData consumerData = new RechargeConsumerData();

        Function<Recharge, String> rechargeFunction = recharge -> "Customer ID: " + recharge.getCustomerId() + ", Amount Recharged: " + recharge.getAmount();
        consumerData.rechargeData(rechargeList, rechargeFunction);
    }
}
  
