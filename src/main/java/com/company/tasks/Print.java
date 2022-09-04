package com.company.tasks;

import com.company.service.IBuyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Print {

    private final IBuyInterface iBuyInterface;
    @Autowired
    public Print(IBuyInterface iBuyInterface) {
        this.iBuyInterface = iBuyInterface;
    }

    public void printTask(){
        System.out.println(iBuyInterface.buySomething());
    }
}
