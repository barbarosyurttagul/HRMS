package kodlamaio.hrms.core.utilities.mapper;

import java.util.List;

public interface MapperService {

	<S, T> List<T> mapList(List<S> s, Class<T> targetClass);
	
	public <T> Object mapEntity(Object source,Class<T> baseClass);
}
