package be.designisdead.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables=Resource.class)
public class AnnouncementModel {

    @Inject @Default(values="Enter a title")
    private String title;

    @Inject @Default(values="Enter a message")
    private String message;

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
