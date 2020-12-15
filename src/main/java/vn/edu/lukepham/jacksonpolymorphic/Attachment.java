package vn.edu.lukepham.jacksonpolymorphic;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value=AudioAttachment.class, name="AUDIO"),
        @JsonSubTypes.Type(value=LinkAttachment.class, name="LINK")
})
@Data
public class Attachment {
    private AttachmentType type;
    private String description;
}
