package kodlamaio.hrms.core;

public interface TcKimlikNoDogrulamaService{

	boolean TcKimlikNoDogrula(long TcNo, String firstName, String lastName, int birthYear);
}
