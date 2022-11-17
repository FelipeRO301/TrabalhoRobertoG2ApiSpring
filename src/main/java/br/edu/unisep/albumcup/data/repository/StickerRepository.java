package br.edu.unisep.albumcup.data.repository;
import br.edu.unisep.albumcup.data.entity.Sticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
@Component
public interface StickerRepository extends JpaRepository<Sticker, Integer> {


}
