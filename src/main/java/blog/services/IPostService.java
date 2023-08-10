package blog.services;


import blog.model.Post;

import java.util.List;

public interface IPostService {
    Post create(Post post);
    List<Post> findAll();
    List<Post> firstThreePosts();

    Post findById(Long id);
    Post editPost (Long id);
    void deleteById(Post post);
}
