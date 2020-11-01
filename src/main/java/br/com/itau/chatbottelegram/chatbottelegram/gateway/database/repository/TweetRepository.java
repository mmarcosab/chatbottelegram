package br.com.itau.chatbottelegram.chatbottelegram.gateway.database.repository;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.TweetData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<TweetData, Long> {

    @Query(" SELECT COUNT (t.id) " +
           " FROM TweetData t " +
           " WHERE  t.language = 'pt' " +
           " AND t.tag = :ptag" )
    int getCountPortuguese(@Param("ptag") String tag);

}