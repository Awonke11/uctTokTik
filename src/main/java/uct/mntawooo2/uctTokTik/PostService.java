package uct.mntawooo2.uctTokTik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public String addPost(Post post, Integer accountId) {
        return postRepository.addPost(post, accountId);
    }
}
