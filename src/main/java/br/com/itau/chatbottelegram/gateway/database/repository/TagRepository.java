package br.com.itau.chatbottelegram.gateway.database.repository;

import br.com.itau.chatbottelegram.gateway.database.data.TagData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagData, Long> {

}
