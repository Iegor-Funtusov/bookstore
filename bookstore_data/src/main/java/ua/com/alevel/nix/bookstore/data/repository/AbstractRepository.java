package ua.com.alevel.nix.bookstore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import ua.com.alevel.nix.bookstore.data.entity.AbstractEntity;

import java.util.Date;

@NoRepositoryBean
public interface AbstractRepository<T extends AbstractEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

    @Query("select min (ae.createTime) from #{#entityName} ae")
    Date findMinCreateTime();

    @Query("select max (ae.createTime) from #{#entityName} ae")
    Date findMaxCreateTime();

    Long countAllByCreateTimeBetween(Date start, Date end);
}
