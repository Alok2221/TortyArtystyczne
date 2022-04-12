package pl.zaczarowaneslodkosci.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import pl.zaczarowaneslodkosci.entity.CakeEntity;

public class CakeDtoResponse {

    private final Long id;

    @JsonUnwrapped
    private final CakeDtoRequest cakeDtoRequest;

    public CakeDtoResponse(CakeEntity cakeEntity) {
        this.id = cakeEntity.getId();
        this.cakeDtoRequest = new CakeDtoRequest(cakeEntity);
    }

    public Long getId() {
        return id;
    }

    public CakeDtoRequest getCakeDtoRequest() {
        return cakeDtoRequest;
    }
}