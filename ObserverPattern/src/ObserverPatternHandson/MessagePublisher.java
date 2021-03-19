package ObserverPatternHandson;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();
	
	private int state;



	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		
		Message msg = new Message("State of the subject is changed");
		notifyUpdate(msg);
	}

	@Override

	public void attach(Observer o) {

		observers.add(o);

	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}
}