package com.example.application.views.dqf_analysis_frontend;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "home", layout = MainView.class)
@PageTitle("dqf_analysis_frontend")
@RouteAlias(value = "", layout = MainView.class)
public class Dqf_analysis_frontendView extends Div {

    public Dqf_analysis_frontendView() {
        setId("dqfanalysisfrontend-view");
        add(new Text("Content placeholder"));
    }

}
