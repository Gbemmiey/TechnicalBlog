package blog.controller;

import blog.model.Post;
import blog.services.Post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/posts/posts")
    public String getAllPosts(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "posts";
    }



    @RequestMapping(value = "/posts/create", method = RequestMethod.GET)
    public String displayCreatePostPage(){
        return "/posts/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createPost(Post post){
        post.setId(System.currentTimeMillis()%1000);
        // post.setBody();
        postService.create(post);
        return "redirect:/posts/posts";
    }
}
