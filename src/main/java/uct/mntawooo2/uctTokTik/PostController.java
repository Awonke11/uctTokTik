package uct.mntawooo2.uctTokTik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
@CrossOrigin(origins = " https://8f7b-196-47-228-190.ngrok-free.app")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/add")
    public ResponseEntity<String> addPost(@RequestBody Post post) {
        return new ResponseEntity<>(postService.addPost(post, post.getAccountId()), HttpStatus.OK);
    }
}
