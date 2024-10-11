package com.classroots.classroots.repository;

import com.classroots.classroots.model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
