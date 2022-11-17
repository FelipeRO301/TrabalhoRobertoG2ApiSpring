package br.edu.unisep.albumcup.domain.usecase.impl;


import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.builder.StickerBuilder;
import br.edu.unisep.albumcup.domain.usecase.FindAllStickersUseCase;
import br.edu.unisep.albumcup.domain.dto.StickerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class FindAllStickersUseCaseImpl  implements FindAllStickersUseCase {

    private final StickerRepository repository;
    private final StickerBuilder stickerBuilder;



    @Override
    public List<StickerDto> execute() {
        var result  = repository.findAll();
        return stickerBuilder.build(result);

    }
}
