package exercise.controller;

import exercise.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

import exercise.model.Post;
import exercise.repository.PostRepository;
import exercise.exception.ResourceNotFoundException;
import exercise.dto.PostDTO;
import exercise.dto.CommentDTO;

// BEGIN
@RestController
@RequestMapping("")
public class PostsController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private  CommentRepository commentRepository;

    @GetMapping(path = "/{posts}")
    public List<PostDTO> index() {
        var users = postRepository.findAll();
        var result = users.stream()
                .map(this::toDTO)
                .toList();
        return result;
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostDTO show(@PathVariable long id) {

        var post =  postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post with id " + id + " not found"));

        return toPostDTO(post);
    }

    private PostDTO toPostDTO(Post post) {
        var dto = new PostDTO();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setBody(post.getBody());
        var comments = commentRepository.findByPostId(post.getId());
        var commentsDto = comments.stream()
                .map((comment) -> {
                    var commentDto = new CommentDTO();
                    commentDto.setBody(comment.getBody());
                    commentDto.setId(comment.getId());
                    return commentDto;
                })
                .toList();
        dto.setComments(commentsDto);
        return dto;
    }
}
// END
