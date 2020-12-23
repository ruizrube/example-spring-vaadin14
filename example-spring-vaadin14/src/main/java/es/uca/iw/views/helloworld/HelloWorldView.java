package es.uca.iw.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import es.uca.iw.views.main.MainView;

@Route(value = "hello", layout = MainView.class)
@PageTitle("Hello World")
@CssImport("./styles/views/helloworld/hello-world-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;
    
  
    private int variableUno;
    private int variableDos;
    
    public HelloWorldView() {
        setId("hello-world-view");
        int variableTres;
        int variableCuatro;
        
        H1 h1=new H1("Nueva funcionalidad!");
        name = new TextField("What's your name? Tell me");
        sayHello = new Button("Say hello");
        add(h1,name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener( e-> {
            Notification.show("Hola " + name.getValue());
        });
    }

}
