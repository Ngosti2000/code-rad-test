package com.example.myapp.provider;

import com.codename1.rad.models.AbstractEntityListProvider;
import com.codename1.rad.models.EntityList;
import com.example.myapp.model.GroupModel;
import com.example.myapp.model.GroupModelImpl;

public class MgrGroupsProvider extends AbstractEntityListProvider {
    @Override
    public Request getEntities(Request request) {

        EntityList<GroupModel> entityList = new EntityList<>();
                for(int i=0;i<10;i++) {
                    GroupModel model = new GroupModelImpl();
                    model.setGroupName("test  "+i);
                    model.setGroupDescription("code rad "+i);
                    model.setAmount("100");
                    model.setCreatedBy(1);


                    entityList.add(model);
                }




        request.complete(entityList);

        return request;

    }
}
