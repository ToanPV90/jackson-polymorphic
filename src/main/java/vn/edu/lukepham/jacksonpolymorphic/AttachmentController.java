package vn.edu.lukepham.jacksonpolymorphic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attachments")
public class AttachmentController {

    @PostMapping("/")
    public ResponseEntity create(@RequestBody Attachment attachment) {
        if (AttachmentType.AUDIO.equals(attachment.getType())) {
            AudioAttachment audioAttachment = (AudioAttachment) attachment;
            System.out.println(audioAttachment.getAid());
        } else {
            LinkAttachment linkAttachment = (LinkAttachment) attachment;
            System.out.println(linkAttachment.getTitle());
        }
        return ResponseEntity.ok().build();
    }
}
