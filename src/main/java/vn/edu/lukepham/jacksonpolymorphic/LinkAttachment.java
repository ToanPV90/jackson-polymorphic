package vn.edu.lukepham.jacksonpolymorphic;

import lombok.Data;

@Data
public class LinkAttachment extends Attachment {
    private String url;
    private String title;
}
