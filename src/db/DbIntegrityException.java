package db;

public class DbIntegrityException extends RuntimeException{

<<<<<<< HEAD
    private static final long serialVersionUID = 1L;

	public DbIntegrityException(String message) {
=======
    public DbIntegrityException(String message) {
>>>>>>> 4b560ef381af6aa8a793fcee3b3168b105c9fae3
        super(message);
    }
}
