package ch.hackaton.apme;

import com.vaadin.ui.Button;
import com.vaadin.ui.Layout;

/**
 * @author apme
 *
 */
@SuppressWarnings("serial")
public class DefaultApplicationDesign extends ApplicationDesign {

    public DefaultApplicationDesign() {

        super();
    }

    public Layout getContent() {

        return this.content;
    }

    public Button getSearchContentButton() {

        return this.searchContentButton;
    }
}
