package com.sda.mbm.springngblog.repository;

import com.sda.mbm.springngblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
