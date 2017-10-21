package type;

import visitor.CaffePart;
import visitor.CaffePartVisitor;

public class Sugar implements CaffePart {

	@Override
	public void accept(CaffePartVisitor caffePartVisitor) {
		caffePartVisitor.visit(this);

	}

}
