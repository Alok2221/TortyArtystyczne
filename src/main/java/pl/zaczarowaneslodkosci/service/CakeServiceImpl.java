package pl.zaczarowaneslodkosci.service;

import org.springframework.stereotype.Service;
import pl.zaczarowaneslodkosci.dto.CakeDtoRequest;
import pl.zaczarowaneslodkosci.dto.CakeDtoResponse;
import pl.zaczarowaneslodkosci.entity.CakeEntity;
import pl.zaczarowaneslodkosci.repository.CakeRepository;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@Transactional
public class CakeServiceImpl implements CakeService {

    private final CakeRepository cakeRepository;

    public CakeServiceImpl(CakeRepository cakeRepository) {
        this.cakeRepository = cakeRepository;
    }

    @Override
    public CakeDtoResponse get(Long id) {
        return new CakeDtoResponse(cakeRepository.getOrThrow(id));
    }

    @Override
    public CakeDtoResponse add(CakeDtoRequest cakeDtoRequest) {
        CakeEntity cakeEntity = new CakeEntity();
        copyProperties(cakeDtoRequest, cakeEntity);
        CakeEntity newCake = cakeRepository.save(cakeEntity);
        return new CakeDtoResponse(newCake);
    }

    @Override
    public void delete(Long id) {
        cakeRepository.deleteById(id);
    }

    @Override
    public List<CakeDtoResponse> search(String name) {
        return cakeRepository.getByName(name)
                .stream()
                .map(CakeDtoResponse::new)
                .collect(toList());
    }
}