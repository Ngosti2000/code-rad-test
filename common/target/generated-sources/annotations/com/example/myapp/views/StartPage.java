package com.example.myapp.views;
import com.codename1.rad.annotations.*;
import com.codename1.rad.controllers.*;
import com.example.myapp.views.*;
import com.example.myapp.model.GroupModel;
import static com.codename1.rad.util.NonNull.nonNull;
import static com.codename1.rad.util.NonNull.nonNullEntries;
import com.codename1.ui.spinner.Picker;
import com.codename1.rad.schemas.*;
import com.codename1.rad.ui.builders.*;
import ca.weblite.shared.components.*;
import com.codename1.rad.models.*;
import com.codename1.rad.nodes.*;
import com.codename1.rad.ui.entityviews.*;
import com.codename1.rad.ui.beans.*;
import com.codename1.rad.propertyviews.*;
import com.codename1.ui.*;
import com.codename1.ui.plaf.*;
import com.codename1.components.*;
import static com.codename1.ui.CN.*;
import com.codename1.ui.layouts.*;
import com.codename1.rad.ui.ViewContext;
import com.codename1.rad.ui.EntityView;
@Autogenerated
public class StartPage extends AbstractStartPage<GroupModel> implements StartPageSchema {
    private final ViewContext<GroupModel> context;
    private final FormController formController;
    private final ApplicationController applicationController;
    private final AppSectionController sectionController;
    private final ViewController viewController;
    private final FormController parentFormController;
    private java.util.List<Runnable> __initOnceListeners;
    private java.util.List<Runnable> __deinitListeners;
    // Placeholder for the row model when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private com.codename1.rad.models.Entity rowModel;
    // Placeholder for the row index when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private int rowIndex;
    // Placeholder for the row selected state when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private boolean rowSelected;
    // Placeholder for the row focused state when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private boolean rowFocused;
    // Placeholder for the EntityListView when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private com.codename1.rad.ui.entityviews.EntityListView rowList;
    private EntityView view = this;
    private EntityView rowView;
    private ViewContext subContext;
    private Container _currentContainer;
    public com.codename1.rad.ui.entityviews.EntityListView groups;
    private static ViewContext<GroupModel> wrapContext(ViewContext<GroupModel> context) {
        com.example.myapp.controllers.MyGroupsPageViewController _viewController = new com.example.myapp.controllers.MyGroupsPageViewController(context.getController());
        return _viewController.createViewContext(GroupModel.class, context.getEntity());
    }

    private Component registerViewController(Component cmp) {
        this.context.getController().setView(cmp);        return this.context.getController().getView();
    }

    @Override
    public GroupModel getEntity(){ return (GroupModel)super.getEntity();}
    public StartPage(@Inject ViewContext<GroupModel> context) {
        super(wrapContext(context));
        this.context = getContext();
        this.formController = context.getController().getFormController();
        this.viewController = context.getController();
        this.applicationController = context.getController().getApplicationController();
        this.sectionController = context.getController().getSectionController();
        this.parentFormController = (this.formController == null || this.formController.getParent() == null) ? null : this.formController.getParent().getFormController();
        getAllStyles().stripMarginAndPadding();
        setLayout(new BorderLayout());
        _currentContainer = this;
        add(BorderLayout.CENTER, registerViewController(createComponent0()));
    }
    private com.codename1.ui.Container createComponent0() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("componentForm.formBottomPaddingEditingMode", "true");
         attributes.put("rad-id", "0");
         attributes.put("rad-model", "GroupModel");
         attributes.put("safeArea", "true");
         attributes.put("view-controller", "com.example.myapp.controllers.MyGroupsPageViewController");
         attributes.put("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         attributes.put("xsi:noNamespaceSchemaLocation", "StartPage.xsd");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "border", attributes);
        _builder.setParentContainer(_currentContainer, null);
        // componentForm.formBottomPaddingEditingMode=true
        
        // safeArea=true
        
        // xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance
        
        // xsi:noNamespaceSchemaLocation=StartPage.xsd
        
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // safeArea=true
        _cmp.setSafeArea(true);
        // xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance
        
        // xsi:noNamespaceSchemaLocation=StartPage.xsd
        
        // componentForm.formBottomPaddingEditingMode=true
        {
final com.codename1.ui.Container __fcmp = _cmp;
addInitOnceListener(()->{com.codename1.ui.Form __tmpReceiver___fcmp = null;{Object __tmp___tmpReceiver___fcmp=__fcmp.getComponentForm();__tmpReceiver___fcmp=(__tmp___tmpReceiver___fcmp==null)?null:(com.codename1.ui.Form)__tmp___tmpReceiver___fcmp;}if (__tmpReceiver___fcmp!=null)__tmpReceiver___fcmp.setFormBottomPaddingEditingMode(true);});
}

        // 9 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 9 child nodes
        // Child tag title is type com.codename1.rad.ui.beans.Title
        // Create bean com.codename1.rad.ui.beans.Title
        createBean1();
        // Child tag import is type null
        // Child tag define-category is type null
        // Child tag entityList is type com.codename1.rad.ui.entityviews.EntityListView
        // Add child component  with child tag entityList
        _cmp.addComponent(_builder.parseConstraint("center"), createComponent4());
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.rad.ui.entityviews.EntityListView createComponent4() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("layout-constraint", "center");
         attributes.put("name", "groups");
         attributes.put("provider", "com.example.myapp.provider.MgrGroupsProvider.class");
         attributes.put("rad-id", "4");
        com.codename1.rad.ui.builders.EntityListViewBuilder _builder = new com.codename1.rad.ui.builders.EntityListViewBuilder(context, "entityList", attributes);
        _builder.setParentContainer(_currentContainer, null);
        {
            com.codename1.rad.ui.EntityListCellRenderer _injectedValue = nonNull(context.getController().lookup(com.codename1.rad.ui.EntityListCellRenderer.class), null);
            if (_injectedValue != null) _builder.renderer((com.codename1.rad.ui.EntityListCellRenderer)_injectedValue);
        }
        {
            com.codename1.rad.nodes.Node _injectedValue = _setParent(com.codename1.rad.nodes.ViewNode.class, new com.codename1.rad.nodes.ViewNode());
            if (_injectedValue != null) _builder.parentNode((com.codename1.rad.nodes.Node)_injectedValue);
        }
        // name=groups
        
        // provider=com.example.myapp.provider.MgrGroupsProvider.class
        _builder.provider(com.example.myapp.provider.MgrGroupsProvider.class);
        // 1 row templates defined for list view
        {
            class Renderer4 implements com.codename1.rad.ui.EntityListCellRenderer {
                public EntityView getListCellRendererComponent(EntityListView list, Entity value, int index, boolean isSelected, boolean isFocused) {
                    Entity _old_rowModel = StartPage.this.rowModel;
                    StartPage.this.rowModel = value;
                    int _old_rowIndex = StartPage.this.rowIndex;
                    StartPage.this.rowIndex = index;
                    boolean _old_rowSelected = StartPage.this.rowSelected;
                    StartPage.this.rowSelected = isSelected;
                    boolean _old_rowFocused = StartPage.this.rowFocused;
                    StartPage.this.rowFocused = isFocused;
                    EntityListView _old_rowList = StartPage.this.rowList;
                    StartPage.this.rowList = list;
                    com.codename1.rad.nodes.ViewNode _viewNode = new com.codename1.rad.nodes.ViewNode();
                    _viewNode.setParent(context.getNode());
                    ViewContext _old_subContext = StartPage.this.subContext;
                    StartPage.this.subContext = new ViewContext(viewController, rowModel, _viewNode);
                    EntityView _old_rowView = StartPage.this.rowView;
                    try {
                        if (true) {
                            Container cnt = new Container(new BorderLayout());
                            cnt.getStyle().stripMarginAndPadding();
                            StartPage.this.rowView = new com.codename1.rad.ui.entityviews.WrapperEntityView(cnt, StartPage.this.rowModel, _viewNode);
                            cnt.add(BorderLayout.CENTER, createComponent6());
                            return StartPage.this.rowView;
                        }
                        throw new RuntimeException("No row view matches the provided condition.");
                    } finally {
                        StartPage.this.rowModel = _old_rowModel;
                        StartPage.this.rowIndex = _old_rowIndex;
                        StartPage.this.rowSelected = _old_rowSelected;
                        StartPage.this.rowFocused = _old_rowFocused;
                        StartPage.this.rowList = _old_rowList;
                        StartPage.this.subContext = _old_subContext;
                        StartPage.this.rowView = _old_rowView;
                    }
                }
            }
            _builder.renderer(new Renderer4());
        }
        com.codename1.rad.ui.entityviews.EntityListView _cmp = (com.codename1.rad.ui.entityviews.EntityListView)_builder.getComponent();
        // name=groups
        _cmp.setName("groups");
        // 3 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 3 child nodes
        // Child tag row-template is type null
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        groups = _cmp;
        return _cmp;
    }
    private com.codename1.ui.Container createComponent6() {
        Entity rowModel = this.rowModel;
        int rowIndex = this.rowIndex;
        boolean rowSelected = this.rowSelected;
        boolean rowFocused = this.rowFocused;
        EntityListView rowList = this.rowList;
        ViewContext<Entity> context = (ViewContext<Entity>)this.subContext;
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "6");
         attributes.put("uiid", "groupContainer");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "border", attributes);
        _builder.setParentContainer(_currentContainer, null);
        // uiid=groupContainer
        
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        EntityView<Entity> view = (EntityView<Entity>)StartPage.this.rowView;
        EntityView<Entity> rowView = view;
        // uiid=groupContainer
        _cmp.setUIID("groupContainer");
        // 5 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 5 child nodes
        // Child tag border is type com.codename1.ui.Container
        // Add child component  with child tag border
        _cmp.addComponent(_builder.parseConstraint("north"), createComponent7());
        // Child tag buttons is type com.codename1.rad.ui.entityviews.Buttons
        // Add child component  with child tag buttons
        _cmp.addComponent(_builder.parseConstraint("center"), createComponent9());
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Container createComponent7() {
        Entity rowModel = this.rowModel;
        int rowIndex = this.rowIndex;
        boolean rowSelected = this.rowSelected;
        boolean rowFocused = this.rowFocused;
        EntityListView rowList = this.rowList;
        ViewContext<Entity> context = (ViewContext<Entity>)this.subContext;
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("layout-constraint", "north");
         attributes.put("rad-id", "7");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "border", attributes);
        _builder.setParentContainer(_currentContainer, null);
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        EntityView<Entity> view = (EntityView<Entity>)StartPage.this.rowView;
        EntityView<Entity> rowView = view;
        // 3 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 3 child nodes
        // Child tag radLabel is type com.codename1.rad.propertyviews.LabelPropertyView
        // Add child component  with child tag radLabel
        _cmp.addComponent(_builder.parseConstraint("north"), createComponent8());
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.rad.propertyviews.LabelPropertyView createComponent8() {
        Entity rowModel = this.rowModel;
        int rowIndex = this.rowIndex;
        boolean rowSelected = this.rowSelected;
        boolean rowFocused = this.rowFocused;
        EntityListView rowList = this.rowList;
        ViewContext<Entity> context = (ViewContext<Entity>)this.subContext;
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("component.uiid", "GroupNameLabel");
         attributes.put("layout-constraint", "north");
         attributes.put("rad-id", "8");
         attributes.put("tag", "GroupModel.groupName");
        com.codename1.rad.ui.builders.LabelPropertyViewBuilder _builder = new com.codename1.rad.ui.builders.LabelPropertyViewBuilder(context, "radLabel", attributes);
        _builder.setParentContainer(_currentContainer, null);
        {
            com.codename1.ui.Label _injectedValue = null;
            if (_injectedValue != null) _builder.label((com.codename1.ui.Label)_injectedValue);
        }
        // component.uiid=GroupNameLabel
        
        // tag=GroupModel.groupName
        _builder.tag(GroupModel.groupName);
        com.codename1.rad.propertyviews.LabelPropertyView _cmp = (com.codename1.rad.propertyviews.LabelPropertyView)_builder.getComponent();
        EntityView<Entity> view = (EntityView<Entity>)StartPage.this.rowView;
        EntityView<Entity> rowView = view;
        // component.uiid=GroupNameLabel
        {com.codename1.ui.Label __tmpReceiver__cmp = null;{Object __tmp___tmpReceiver__cmp=_cmp.getComponent();__tmpReceiver__cmp=(__tmp___tmpReceiver__cmp==null)?null:(com.codename1.ui.Label)__tmp___tmpReceiver__cmp;}if (__tmpReceiver__cmp!=null)__tmpReceiver__cmp.setUIID("GroupNameLabel");}
        // 0 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 0 child nodes
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.rad.ui.entityviews.Buttons createComponent9() {
        Entity rowModel = this.rowModel;
        int rowIndex = this.rowIndex;
        boolean rowSelected = this.rowSelected;
        boolean rowFocused = this.rowFocused;
        EntityListView rowList = this.rowList;
        ViewContext<Entity> context = (ViewContext<Entity>)this.subContext;
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("actionCategory", "MAIN");
         attributes.put("layout", "new GridLayout(2,2)");
         attributes.put("layout-constraint", "center");
         attributes.put("limit", "1");
         attributes.put("preferredH", "20mm");
         attributes.put("rad-id", "9");
         attributes.put("uiid", "GroupsButton");
        com.codename1.rad.ui.entityviews.Buttons _cmp = new com.codename1.rad.ui.entityviews.Buttons(new com.codename1.rad.ui.ViewContext(context.getController(), context.getEntity()));
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.rad.ui.entityviews.Buttons> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.rad.ui.entityviews.Buttons>(_cmp, context, "buttons", attributes);
if (StartPage.this.rowView == null) {
    StartPage.this.rowView = (EntityView)_cmp;
    StartPage.this.subContext.setEntityView((EntityView)_cmp);
}
        EntityView<Entity> view = (EntityView<Entity>)StartPage.this.rowView;
        EntityView<Entity> rowView = view;
        // uiid=GroupsButton
        _cmp.setUIID("GroupsButton");
        // actionCategory=MAIN
        _cmp.setActionCategory(MAIN);
        // layout=new GridLayout(2,2)
        _cmp.setLayout(new GridLayout(2,2));
        // limit=1
        _cmp.setLimit(1);
        // preferredH=20mm
        _cmp.setPreferredH((int)Math.round(CN.convertToPixels((float)20)));
        // 1 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 1 child nodes
        // Child tag com.codename1.rad.ui.ViewContext is type com.codename1.rad.ui.ViewContext
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.rad.ui.beans.Title createBean1() {
        com.codename1.rad.ui.beans.Title _bean = new com.codename1.rad.ui.beans.Title(new com.codename1.rad.ui.ViewContext(context.getController(), context.getEntity()));
        {
            com.codename1.ui.Component _injectedValue = null;
            if (_injectedValue != null) _bean.setComponent((com.codename1.ui.Component)_injectedValue);
        }
        // hidden=true
        _bean.setHidden(true);
        // 1 child nodes
        // Create child nodes
        // 1 child nodes
        return _bean;
    }
    @Override
    public void commit() {}
    @Override
    public void update() {}
    @Override
    public void activate() {
        super.activate();
    }
    private <T extends Node> T _setParent(Class<T> cls, T node) {
        node.setParent(getViewNode());
        return node;
    }
    private <T> T _getInjectedParameter(Class<T> type, ViewContext context, Controller controller) {
        T lookedUp = (T)controller.lookup(type);
        if (lookedUp != null) return lookedUp;
        if (type == ViewContext.class) return (T)context;
        if (Entity.class.isAssignableFrom(type)) return (T)context.getEntity();
        if (type.isAssignableFrom(this.getClass())) return (T)this;
        if (type.isAssignableFrom(controller.getClass())) return (T)controller;
        if (type.isAssignableFrom(FormController.class)) return (T)formController;
        if (type.isAssignableFrom(ApplicationController.class)) return (T)applicationController;
        if (type.isAssignableFrom(ViewController.class)) return (T)viewController;
        return null;
    }
    @Override
    protected void initComponent() {
        super.initComponent();
        if (__initOnceListeners != null && !__initOnceListeners.isEmpty()) {
            java.util.List<Runnable> toRun = new java.util.ArrayList<Runnable>(__initOnceListeners);
            __initOnceListeners = null;
            for (Runnable r : toRun) r.run();
        }
    }
    @Override
    protected void deinitialize() {
        if (__deinitListeners != null && !__deinitListeners.isEmpty()) {
            java.util.List<Runnable> toRun = new java.util.ArrayList<Runnable>(__deinitListeners);
            for (Runnable r : toRun) r.run();
        }
        super.deinitialize();
    }
    private void addInitOnceListener(Runnable r) {
        if (__initOnceListeners == null) __initOnceListeners = new java.util.ArrayList<>();
        __initOnceListeners.add(r);
    }
    private void addDeinitListener(Runnable r) {
        if (__deinitListeners == null) __deinitListeners = new java.util.ArrayList<>();
        __deinitListeners.add(r);
    }
    private void back() {
        com.codename1.rad.controllers.ActionSupport.dispatchEvent(new com.codename1.rad.controllers.FormController.FormBackEvent(this));
    }
}