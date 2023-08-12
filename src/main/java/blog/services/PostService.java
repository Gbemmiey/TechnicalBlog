package blog.services;

import blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService implements IPostService{

    List<Post> posts = new ArrayList<Post>();

    public PostService() {

        posts.add(new Post(1L, "Hey", "Hello from the Universe!"));
        posts.add(new Post(2L, "He", "Hello from the Multiverse!"));
        posts.add(new Post(3L, "H", "Hello from Pluto!"));
        posts.add(new Post(4L, "ey", "Hello from Earth!"));
        posts.add(new Post(5L, "y", "Hello from Saturn!"));

    }

    @Override
    public Post create(Post post) {
        posts.add(post);
        return post;
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public List<Post> firstThreePosts() {
        return posts.subList(0,3);
    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post editPost(Long id) {
        return null;
    }

    @Override
    public void deleteById(Post post) {

    }
}
