package com.company.tasks;

import com.company.service.IBuyInterface;

public class BuyTask implements IBuyInterface{
    @Override
    public String buySomething(){
        return "купить книгу по английскому";
    }
}
