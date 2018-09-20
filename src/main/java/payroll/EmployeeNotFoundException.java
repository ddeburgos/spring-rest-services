package payroll;

public class EmployeeNotFoundException extends Exception {
	
	private static final long serialVersionUID = -8613857445439902381L;
	private final Long id;
	
	public EmployeeNotFoundException(Long id) {
		super();
		this.id = id;
	}
	
	public EmployeeNotFoundException(String message, Throwable cause, Long id) {
		super(message, cause);
		this.id = id;
	}
	
	public EmployeeNotFoundException(String message, Long id) {
		super(message);
		this.id = id;
	}
	
	public EmployeeNotFoundException(Throwable cause, Long id) {
		super(cause);
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	
	

}
