package br.edu.unisep.albumcup.controller;

import br.edu.unisep.albumcup.data.entity.Sticker;
import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.dto.StickerDto;
import br.edu.unisep.albumcup.domain.usecase.CreateStickerUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindAllStickersUseCase;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.hibernate.annotations.SQLDeleteAll;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sticker")
@RequiredArgsConstructor
public class StickerController {

       private final CreateStickerUseCase createStickerUseCase;
       private final FindAllStickersUseCase findAllStickersUseCase;



    @PostMapping
    public ResponseEntity save(@RequestBody CreateStickerDto stickerData) {
        createStickerUseCase.execute(stickerData);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @PostMapping(value="/sticker", consumes="application/jason",produces="application/json")
    public Sticker createPlayer(@RequestBody  Sticker sticker){
        return sticker;
    }

    @GetMapping
    public ResponseEntity<List<StickerDto>>findAll(){

        var result = findAllStickersUseCase.execute();

        if(result.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/sticker")
    public ResponseEntity fetchAllsticker(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/sticker/id/")
    public ResponseEntity fetchstickerById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/sticker/id/")
    public ResponseEntity deleteSticker(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

  /*@PutMapping("/{stickerId}")
    public ResponseEntity<Sticker> update(@PathVariable Long stickerId, @RequestBody Sticker){

        if(StickerRepository.existsById(stickerId)){
            return ResponseEntity.notFound().build();
        }

        Sticker.setId(stickerId);
        Sticker = StickerRepository.save(Sticker);
        return ResponseEntity.ok(Sticker);
  }*/





}
