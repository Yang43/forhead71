package tw.softlead.test_maven;

import java.util.List;

public interface GenericService<T> {
private T t1;
public void setGeneric(T t1)){
	
}
}
Game getOne(int id);
List<Game> getAll();
void insert(Game data);
void update(Game data);
void delete(int id);
