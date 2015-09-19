package Task;

public class Task {
	
	private String name;
	private String category;
	private String description;
    private String startDate;
    private String endDate;
    
    private long startTime;
    private long endTime;
    private long reminder;
    
	private int priority;
    
    private boolean done;
    
    public Task() {
    	
    }
    
    // Floating task
    public Task(String taskName, String taskDescription, int priority, long reminder, String category, boolean done) {
    	setName(taskName);
		setDescription(taskDescription);
		setStartDate("-1");
		setEndDate("-1");
		setStartTime(-1);
		setEndTime(-1);
		setPriority(priority);
		setReminder(reminder);
		setCategory(category);
		setDone(done);
	}
    
    // Task
	public Task(String taskName, String taskDescription, String deadline, long endTime, int priority, 
			int reminder, String category, boolean done) {
		setName(taskName);
		setDescription(taskDescription);
		setStartDate("-1");
		setEndDate(deadline);
		setStartTime(-1);
		setEndTime(-1);
		setPriority(priority);
		setReminder(reminder);
		setCategory(category);
		setDone(done);
	}

	// Event
	public Task(String eventName, String eventDescription, String startDate, String endDate, long startTime,
			long endTime, int priority, long reminder, String category) {
		setName(eventName);
		setDescription(eventDescription);
		setStartDate(startDate);
		setEndDate(endDate);
		setStartTime(startTime);
		setEndTime(endTime);
		setPriority(priority);
		setReminder(reminder);
		setCategory(category);
	}

	public int getPriority() {
    	return priority;
    }
    
    public void setPriority(int priority) {
    	this.priority = priority;
    }
    
    public boolean isDone() {
    	return done;
    }
    
    public void setDone(boolean done) {
    	this.done = done;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
    
    public String getStartDate() {
    	return startDate;
    }
    
    public void setStartDate(String startDate) {
    	this.startDate = startDate;
    }
    
    public String getEndDate() {
    	return endDate;
    }
    
    public void setEndDate(String endDate) {
    	this.endDate = endDate;
    }
    
    public long getStartTime() {
    	return startTime;
    }
    
    public void setStartTime(long startTime) {
    	this.startTime = startTime;
    }
    
    public long getEndTime() {
    	return endTime;
    }
    
    public void setEndTime(long endTime) {
    	this.endTime = endTime;
    }
    
    public long getReminder() {
    	return reminder;
    }
    
    public void setReminder(long reminder) {
    	this.reminder = reminder;
    }
    
    public String getCategory() {
    	return category;
    }
    
    public void setCategory(String category) {
    	this.category = category;
    }
    
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(name+System.getProperty("line.separator"));
    	sb.append(description+System.getProperty("line.separator"));
    	sb.append(startDate+System.getProperty("line.separator"));
    	sb.append(endDate+System.getProperty("line.separator"));
    	sb.append(startTime+System.getProperty("line.separator"));
    	sb.append(endTime+System.getProperty("line.separator"));
    	sb.append(reminder+System.getProperty("line.separator"));
    	sb.append(priority+System.getProperty("line.separator"));
    	sb.append(done+System.getProperty("line.separator"));
    	return sb.toString();
    }
}