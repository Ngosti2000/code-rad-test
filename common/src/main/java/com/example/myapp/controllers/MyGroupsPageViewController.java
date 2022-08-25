package com.example.myapp.controllers;

import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.example.myapp.views.*;
public class MyGroupsPageViewController extends ViewController {
    /**
     * Creates a new ViewController with the given parent controller.
     *
     * @param parent
     */
    public MyGroupsPageViewController(Controller parent) {
        super(parent);
    }

    @Override
    protected void initControllerActions() {
        super.initControllerActions();

        ActionNode.
                builder()
                .label("Contribute")
                .addToController(this, StartPage.MAIN, e-> print());
        ActionNode.
                builder()
                .label("Group Transactions")
                .addToController(this, StartPage.MAIN,e-> print());
        ActionNode.
                builder()
                .label("My Transactions")
                .addToController(this, StartPage.MAIN,e-> print());

        ActionNode.
                builder()
                .label("Exit Group")
                .addToController(this, StartPage.MAIN,e-> print());


    }
    private void print(){
        System.out.println("Testing");
    }



}
