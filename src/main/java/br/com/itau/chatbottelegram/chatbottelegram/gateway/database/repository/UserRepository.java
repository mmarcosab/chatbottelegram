package br.com.itau.chatbottelegram.chatbottelegram.gateway.database.repository;

import br.com.itau.chatbottelegram.chatbottelegram.gateway.database.data.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {

    @Query(value = " SELECT TOP 5 user.username" +
           " FROM User user " +
           " WHERE user.tag = :ptag " +
           " ORDER BY user.quantity_of_followers ", nativeQuery = true)
    List<String> getUsersMostFollowed(@Param("ptag") String tag);

}
