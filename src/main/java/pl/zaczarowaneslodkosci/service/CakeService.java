package pl.zaczarowaneslodkosci.service;

import pl.zaczarowaneslodkosci.dto.CakeDtoRequest;
import pl.zaczarowaneslodkosci.dto.CakeDtoResponse;

import java.util.List;

public interface CakeService {

    CakeDtoResponse get(Long id);

    CakeDtoResponse add(CakeDtoRequest cakeDtoRequest);

    void delete(Long id);

    List<CakeDtoResponse> search(String name);
}