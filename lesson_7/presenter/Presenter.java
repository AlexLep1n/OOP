package presenter;

import model.Model;
import view.ViewCounterAgent;

public class Presenter {
    private Model model;
    private ViewCounterAgent view;

    public Presenter(Model model, ViewCounterAgent view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        view.print(model);
    }

}
