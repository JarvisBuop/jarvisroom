package com.jarvisdong.dao.repository;

import com.jarvisdong.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by JarvisDong on 2018/12/6.
 */
public interface BookRepository extends JpaRepository<Book,Long> {

}
