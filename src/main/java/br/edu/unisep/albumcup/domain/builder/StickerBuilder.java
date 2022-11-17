package br.edu.unisep.albumcup.domain.builder;

import br.edu.unisep.albumcup.data.entity.Sticker;
import br.edu.unisep.albumcup.domain.dto.CreateStickerDto;
import br.edu.unisep.albumcup.domain.dto.StickerDto;


import java.util.List;


public interface StickerBuilder {
    Sticker build(CreateStickerDto dto);
    StickerDto build(Sticker sticker);
    List<StickerDto> build (List<Sticker> sticker);
}
