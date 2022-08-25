package com.example.myapp.model;

import com.codename1.rad.annotations.RAD;
import com.codename1.rad.models.Entity;
import com.codename1.rad.models.Tag;
import com.codename1.rad.schemas.Thing;

@RAD

public interface GroupModel extends Entity {
    public static final Tag groupName = Thing.name;
    public static final Tag groupDescription = Thing.description;
    public static final Tag groupId = new Tag("groupId");
        public static final Tag groupLimit = new Tag("groupLimit");
    public static final Tag createdBy = new Tag("createdBy");
    public static final Tag groupType = new Tag("groupType");

    public static final Tag amount = new Tag("amount");

    public static final Tag minAmount = new Tag("minAmount");
    public static final Tag maxAmount = new Tag("maxAmount");


    @RAD(tag = "groupName")
    String getGroupName();
    void setGroupName(String groupName);

    @RAD(tag = "groupDescription")
    String getGroupDescription();
    void setGroupDescription(String groupDescription);

    @RAD(tag = "groupId")
    String getGroupId();
    void setGroupId(String groupId);

    @RAD(tag = "minAmount")
    String getMinAmount();
    void setMinAmount(String amount);

    @RAD(tag = "maxAmount")
    String getMaxAmount();
    void setMaxAmount(String amount);
    @RAD(tag = "createdBy")
    int getCreatedBy();
    void setCreatedBy(int createdBy);

    @RAD(tag = "groupLimit")
    String getGroupLimit();
    void setGroupLimit(String groupLimit);

    @RAD(tag = "groupType")
    String getGroupType();
    void setGroupType(String groupType);

    @RAD(tag = "amount")
    String getAmount();
    void setAmount(String amount);


}
