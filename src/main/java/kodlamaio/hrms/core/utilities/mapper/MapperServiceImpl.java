package kodlamaio.hrms.core.utilities.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl implements MapperService{

	private ModelMapper modelMapper;

	@Autowired
	public MapperServiceImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	//https://www.baeldung.com/java-modelmapper-lists sayfasından alındı.
	@Override
	public <S, T> List<T> mapList(List<S> s, Class<T> targetClass) {
		return s.stream().map(element -> modelMapper.map(element, targetClass)).collect(Collectors.toList());
	}

	@Override
	public <T> Object mapEntity(Object source, Class<T> baseClass) {
		return modelMapper.map(source,baseClass);
	}
}
