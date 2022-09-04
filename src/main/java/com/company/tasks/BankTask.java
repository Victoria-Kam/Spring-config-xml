package com.company.tasks;

import com.company.service.IBuyInterface;

public class BankTask implements IBuyInterface {

    @Override
    public String buySomething() {
        return "заплатить за коммуналку";
    }
}
