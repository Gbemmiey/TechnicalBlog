package blog.controller;

import blog.model.Post;
import blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getAllPosts(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "/posts/posts";
    }
}
