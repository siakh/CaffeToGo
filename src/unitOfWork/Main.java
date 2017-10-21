package unitOfWork;

import visitor.CaffeDisplayVisitor;
import visitor.CaffePart;
import unit.*;
public class Main {

	public static void main(String[] args) {

		CaffePart caffePart = new Caffe();
		caffePart.accept(new CaffeDisplayVisitor());
	}

}
