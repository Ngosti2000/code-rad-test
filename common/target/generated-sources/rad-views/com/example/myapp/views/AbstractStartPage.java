package com.example.myapp.views;
import com.codename1.rad.annotations.RAD;
import com.codename1.rad.ui.AbstractEntityView;
import com.codename1.rad.ui.EntityView;
import com.codename1.rad.models.Entity;
import com.codename1.rad.nodes.Node;
import com.codename1.io.CharArrayReader;
import com.codename1.rad.ui.ViewContext;

       import com.example.myapp.model.GroupModel;

@RAD
public abstract class AbstractStartPage<T extends GroupModel>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><border xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" componentForm.formBottomPaddingEditingMode=\"true\" rad-id=\"0\" rad-model=\"GroupModel\" safeArea=\"true\" view-controller=\"com.example.myapp.controllers.MyGroupsPageViewController\" xsi:noNamespaceSchemaLocation=\"StartPage.xsd\">\n<title hidden=\"true\" rad-id=\"1\"/>\n<import rad-id=\"2\">\n       import com.example.myapp.model.GroupModel;\n</import>\n\n\n<define-category name=\"MAIN\" rad-id=\"3\"/>\n\n<entityList layout-constraint=\"center\" name=\"groups\" provider=\"com.example.myapp.provider.MgrGroupsProvider.class\" rad-id=\"4\">\n    <row-template rad-id=\"5\">\n        <border rad-id=\"6\" uiid=\"groupContainer\">\n\n            <border layout-constraint=\"north\" rad-id=\"7\">\n                <radLabel component.uiid=\"GroupNameLabel\" layout-constraint=\"north\" rad-id=\"8\" tag=\"GroupModel.groupName\"/>\n\n            </border>\n            <buttons actionCategory=\"MAIN\" layout=\"new GridLayout(2,2)\" layout-constraint=\"center\" limit=\"1\" preferredH=\"20mm\" rad-id=\"9\" uiid=\"GroupsButton\"/>\n        </border>\n    </row-template>\n\n</entityList>\n</border>";
    public AbstractStartPage(ViewContext<T> context) {
        super(context);
    }

}
